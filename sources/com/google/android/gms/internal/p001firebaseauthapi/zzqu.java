package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzqu extends zzvc<AuthResult, zzg> {
    private final zzmh zza;

    public zzqu(PhoneMultiFactorAssertion phoneMultiFactorAssertion, String str) {
        super(2);
        Preconditions.checkNotNull(phoneMultiFactorAssertion);
        Preconditions.checkNotEmpty(str);
        this.zza = new zzmh(phoneMultiFactorAssertion.zza(), str);
    }

    public final String zza() {
        return "finalizeMfaSignIn";
    }

    public final TaskApiCall<zztr, AuthResult> zzb() {
        return TaskApiCall.builder().run(new zzqt(this)).build();
    }

    public final void zzc() {
        zzx zzS = zztn.zzS(this.zzd, this.zzk);
        FirebaseUser firebaseUser = this.zze;
        if (firebaseUser == null || firebaseUser.getUid().equalsIgnoreCase(zzS.getUid())) {
            ((zzg) this.zzf).zza(this.zzj, zzS);
            zzj(new zzr(zzS));
            return;
        }
        zzk(new Status(FirebaseError.ERROR_USER_MISMATCH));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zztr zztr, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zzv = new zzvb(this, taskCompletionSource);
        zztr.zzq().zzF(this.zza, this.zzc);
    }
}
