package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> zado = new zao();
    private zaa mResultGuardian;
    private Status mStatus;
    /* access modifiers changed from: private */
    public R zacl;
    private final Object zadp;
    private final CallbackHandler<R> zadq;
    private final WeakReference<GoogleApiClient> zadr;
    private final CountDownLatch zads;
    private final ArrayList<PendingResult.StatusListener> zadt;
    private ResultCallback<? super R> zadu;
    private final AtomicReference<zacq> zadv;
    private volatile boolean zadw;
    private boolean zadx;
    private boolean zady;
    private ICancelToken zadz;
    private volatile zack<R> zaea;
    private boolean zaeb;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class zaa {
        private zaa() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.zab(BasePendingResult.this.zacl);
            super.finalize();
        }

        /* synthetic */ zaa(BasePendingResult basePendingResult, zao zao) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.zadp = new Object();
        this.zads = new CountDownLatch(1);
        this.zadt = new ArrayList<>();
        this.zadv = new AtomicReference<>();
        this.zaeb = false;
        this.zadq = new CallbackHandler<>(Looper.getMainLooper());
        this.zadr = new WeakReference<>((Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract R createFailedResult(Status status);

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class CallbackHandler<R extends Result> extends zar {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        public final void zaa(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(BasePendingResult.zaa(resultCallback), r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.onResult(result);
                } catch (RuntimeException e) {
                    BasePendingResult.zab(result);
                    throw e;
                }
            } else if (i != 2) {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).zab(Status.RESULT_TIMEOUT);
            }
        }
    }

    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.zadp = new Object();
        this.zads = new CountDownLatch(1);
        this.zadt = new ArrayList<>();
        this.zadv = new AtomicReference<>();
        this.zaeb = false;
        this.zadq = new CallbackHandler<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zadr = new WeakReference<>(googleApiClient);
    }

    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.zadp = new Object();
        this.zads = new CountDownLatch(1);
        this.zadt = new ArrayList<>();
        this.zadv = new AtomicReference<>();
        this.zaeb = false;
        this.zadq = new CallbackHandler<>(looper);
        this.zadr = new WeakReference<>((Object) null);
    }

    protected BasePendingResult(CallbackHandler<R> callbackHandler) {
        this.zadp = new Object();
        this.zads = new CountDownLatch(1);
        this.zadt = new ArrayList<>();
        this.zadv = new AtomicReference<>();
        this.zaeb = false;
        this.zadq = (CallbackHandler) Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.zadr = new WeakReference<>((Object) null);
    }

    public final boolean isReady() {
        return this.zads.getCount() == 0;
    }

    public final R await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        boolean z = true;
        Preconditions.checkState(!this.zadw, "Result has already been consumed");
        if (this.zaea != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            this.zads.await();
        } catch (InterruptedException e) {
            zab(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        Preconditions.checkState(!this.zadw, "Result has already been consumed.");
        if (this.zaea != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            if (!this.zads.await(j, timeUnit)) {
                zab(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException e) {
            zab(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.zadp
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.zadu = r6     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x000a:
            boolean r1 = r5.zadw     // Catch:{ all -> 0x0040 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch:{ all -> 0x0040 }
            com.google.android.gms.common.api.internal.zack<R> r1 = r5.zaea     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch:{ all -> 0x0040 }
            boolean r1 = r5.isCanceled()     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x002b:
            boolean r1 = r5.isReady()     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R> r1 = r5.zadq     // Catch:{ all -> 0x0040 }
            com.google.android.gms.common.api.Result r2 = r5.get()     // Catch:{ all -> 0x0040 }
            r1.zaa(r6, r2)     // Catch:{ all -> 0x0040 }
            goto L_0x003e
        L_0x003b:
            r5.zadu = r6     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r6, long r7, java.util.concurrent.TimeUnit r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.zadp
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.zadu = r6     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x000a:
            boolean r1 = r5.zadw     // Catch:{ all -> 0x004e }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch:{ all -> 0x004e }
            com.google.android.gms.common.api.internal.zack<R> r1 = r5.zaea     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch:{ all -> 0x004e }
            boolean r1 = r5.isCanceled()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x002b:
            boolean r1 = r5.isReady()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R> r7 = r5.zadq     // Catch:{ all -> 0x004e }
            com.google.android.gms.common.api.Result r8 = r5.get()     // Catch:{ all -> 0x004e }
            r7.zaa(r6, r8)     // Catch:{ all -> 0x004e }
            goto L_0x004c
        L_0x003b:
            r5.zadu = r6     // Catch:{ all -> 0x004e }
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R> r6 = r5.zadq     // Catch:{ all -> 0x004e }
            long r7 = r9.toMillis(r7)     // Catch:{ all -> 0x004e }
            r9 = 2
            android.os.Message r9 = r6.obtainMessage(r9, r5)     // Catch:{ all -> 0x004e }
            r6.sendMessageDelayed(r9, r7)     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x004e:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback, long, java.util.concurrent.TimeUnit):void");
    }

    /* access modifiers changed from: private */
    public static <R extends Result> ResultCallback<R> zaa(ResultCallback<R> resultCallback) {
        return resultCallback;
    }

    public final void addStatusListener(PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.zadp) {
            if (isReady()) {
                statusListener.onComplete(this.mStatus);
            } else {
                this.zadt.add(statusListener);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.zadp
            monitor-enter(r0)
            boolean r1 = r2.zadx     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            boolean r1 = r2.zadw     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            com.google.android.gms.common.internal.ICancelToken r1 = r2.zadz     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0017
            com.google.android.gms.common.internal.ICancelToken r1 = r2.zadz     // Catch:{ RemoteException -> 0x0016 }
            r1.cancel()     // Catch:{ RemoteException -> 0x0016 }
            goto L_0x0017
        L_0x0016:
            r1 = move-exception
        L_0x0017:
            R r1 = r2.zacl     // Catch:{ all -> 0x002c }
            zab((com.google.android.gms.common.api.Result) r1)     // Catch:{ all -> 0x002c }
            r1 = 1
            r2.zadx = r1     // Catch:{ all -> 0x002c }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_CANCELED     // Catch:{ all -> 0x002c }
            com.google.android.gms.common.api.Result r1 = r2.createFailedResult(r1)     // Catch:{ all -> 0x002c }
            r2.zaa(r1)     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.cancel():void");
    }

    public final boolean zaq() {
        boolean isCanceled;
        synchronized (this.zadp) {
            if (((GoogleApiClient) this.zadr.get()) == null || !this.zaeb) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.zadp) {
            z = this.zadx;
        }
        return z;
    }

    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> then;
        Preconditions.checkState(!this.zadw, "Result has already been consumed.");
        synchronized (this.zadp) {
            boolean z = false;
            Preconditions.checkState(this.zaea == null, "Cannot call then() twice.");
            Preconditions.checkState(this.zadu == null, "Cannot call then() if callbacks are set.");
            if (!this.zadx) {
                z = true;
            }
            Preconditions.checkState(z, "Cannot call then() if result was canceled.");
            this.zaeb = true;
            this.zaea = new zack<>(this.zadr);
            then = this.zaea.then(resultTransform);
            if (isReady()) {
                this.zadq.zaa(this.zaea, get());
            } else {
                this.zadu = this.zaea;
            }
        }
        return then;
    }

    public final void setResult(R r) {
        synchronized (this.zadp) {
            if (this.zady || this.zadx) {
                zab((Result) r);
                return;
            }
            boolean isReady = isReady();
            boolean z = true;
            Preconditions.checkState(!isReady(), "Results have already been set");
            if (this.zadw) {
                z = false;
            }
            Preconditions.checkState(z, "Result has already been consumed");
            zaa(r);
        }
    }

    public final void zab(Status status) {
        synchronized (this.zadp) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zady = true;
            }
        }
    }

    public final void zaa(zacq zacq) {
        this.zadv.set(zacq);
    }

    public final Integer zal() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void setCancelToken(ICancelToken iCancelToken) {
        synchronized (this.zadp) {
            this.zadz = iCancelToken;
        }
    }

    public final void zar() {
        this.zaeb = this.zaeb || zado.get().booleanValue();
    }

    private final R get() {
        R r;
        synchronized (this.zadp) {
            Preconditions.checkState(!this.zadw, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            r = this.zacl;
            this.zacl = null;
            this.zadu = null;
            this.zadw = true;
        }
        zacq andSet = this.zadv.getAndSet((Object) null);
        if (andSet != null) {
            andSet.zab(this);
        }
        return r;
    }

    private final void zaa(R r) {
        this.zacl = r;
        this.zadz = null;
        this.zads.countDown();
        this.mStatus = this.zacl.getStatus();
        if (this.zadx) {
            this.zadu = null;
        } else if (this.zadu != null) {
            this.zadq.removeMessages(2);
            this.zadq.zaa(this.zadu, get());
        } else if (this.zacl instanceof Releasable) {
            this.mResultGuardian = new zaa(this, (zao) null);
        }
        ArrayList arrayList = this.zadt;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((PendingResult.StatusListener) obj).onComplete(this.mStatus);
        }
        this.zadt.clear();
    }

    public static void zab(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }
}
