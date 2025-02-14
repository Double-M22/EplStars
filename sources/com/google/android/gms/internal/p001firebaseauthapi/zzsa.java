package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.internal.zzg;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsa  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzsa extends zzvc<Void, zzg> {
    private final zzmx zza;
    private final String zzw;

    public zzsa(String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        super(4);
        Preconditions.checkNotEmpty(str, "email cannot be null or empty");
        this.zza = new zzmx(str, actionCodeSettings, str2);
        this.zzw = str3;
    }

    public final String zza() {
        return this.zzw;
    }

    public final TaskApiCall<zztr, Void> zzb() {
        return TaskApiCall.builder().run(new zzrz(this)).build();
    }

    public final void zzc() {
        zzj(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zztr zztr, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zzv = new zzvb(this, taskCompletionSource);
        zztr.zzq().zzz(this.zza, this.zzc);
    }
}
