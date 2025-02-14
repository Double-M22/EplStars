package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzg;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzsu extends zzvc<Void, zzg> {
    private final zznt zza;

    public zzsu(String str, String str2) {
        super(2);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(str2);
        this.zza = new zznt(str, str2);
    }

    public final String zza() {
        return "unenrollMfa";
    }

    public final TaskApiCall<zztr, Void> zzb() {
        return TaskApiCall.builder().run(new zzst(this)).build();
    }

    public final void zzc() {
        ((zzg) this.zzf).zza(this.zzj, zztn.zzS(this.zzd, this.zzk));
        zzj(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zztr zztr, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zzv = new zzvb(this, taskCompletionSource);
        zztr.zzq().zzD(this.zza, this.zzc);
    }
}
