package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p001firebaseauthapi.zzi;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzam {
    /* access modifiers changed from: private */
    public static final Logger zzg = new Logger("TokenRefresher", "FirebaseAuth:");
    volatile long zza;
    volatile long zzb;
    final long zzc = 300000;
    final HandlerThread zzd;
    final Handler zze = new zzi(this.zzd.getLooper());
    final Runnable zzf = new zzal(this, this.zzh.getName());
    private final FirebaseApp zzh;

    public zzam(FirebaseApp firebaseApp) {
        zzg.v("Initializing TokenRefresher", new Object[0]);
        this.zzh = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.zzd = handlerThread;
        handlerThread.start();
    }

    public final void zza() {
        Logger logger = zzg;
        long j = this.zza;
        long j2 = this.zzc;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j - j2);
        logger.v(sb.toString(), new Object[0]);
        zzc();
        this.zzb = Math.max((this.zza - DefaultClock.getInstance().currentTimeMillis()) - this.zzc, 0) / 1000;
        this.zze.postDelayed(this.zzf, this.zzb * 1000);
    }

    public final void zzc() {
        this.zze.removeCallbacks(this.zzf);
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        long j;
        int i = (int) this.zzb;
        if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
            long j2 = this.zzb;
            j = j2 + j2;
        } else {
            j = i != 960 ? 30 : 960;
        }
        this.zzb = j;
        this.zza = DefaultClock.getInstance().currentTimeMillis() + (this.zzb * 1000);
        Logger logger = zzg;
        long j3 = this.zza;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j3);
        logger.v(sb.toString(), new Object[0]);
        this.zze.postDelayed(this.zzf, this.zzb * 1000);
    }
}
