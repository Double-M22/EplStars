package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzh;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzra  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzra extends zzvc<AuthResult, zzg> {
    private final zzxv zza;

    public zzra(AuthCredential authCredential) {
        super(2);
        Preconditions.checkNotNull(authCredential, "credential cannot be null");
        this.zza = zzh.zza(authCredential, (String) null);
    }

    public final String zza() {
        return "linkFederatedCredential";
    }

    public final TaskApiCall<zztr, AuthResult> zzb() {
        return TaskApiCall.builder().run(new zzqz(this)).build();
    }

    public final void zzc() {
        zzx zzS = zztn.zzS(this.zzd, this.zzk);
        ((zzg) this.zzf).zza(this.zzj, zzS);
        zzj(new zzr(zzS));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zztr zztr, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zzv = new zzvb(this, taskCompletionSource);
        zztr.zzq().zzl(new zzmp(this.zze.zzg(), this.zza), this.zzc);
    }
}
