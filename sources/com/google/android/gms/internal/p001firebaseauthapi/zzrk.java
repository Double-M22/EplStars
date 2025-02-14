package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzx;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzrk extends zzvc<Void, zzg> {
    private final zznl zza;

    public zzrk(EmailAuthCredential emailAuthCredential) {
        super(2);
        Preconditions.checkNotNull(emailAuthCredential, "Credential cannot be null");
        this.zza = new zznl(emailAuthCredential);
    }

    public final String zza() {
        return "reauthenticateWithEmailLink";
    }

    public final TaskApiCall<zztr, Void> zzb() {
        return TaskApiCall.builder().run(new zzrj(this)).build();
    }

    public final void zzc() {
        zzx zzS = zztn.zzS(this.zzd, this.zzk);
        if (this.zze.getUid().equalsIgnoreCase(zzS.getUid())) {
            ((zzg) this.zzf).zza(this.zzj, zzS);
            zzj(null);
            return;
        }
        zzk(new Status(FirebaseError.ERROR_USER_MISMATCH));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zztr zztr, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zzv = new zzvb(this, taskCompletionSource);
        zztr.zzq().zzA(this.zza, this.zzc);
    }
}
