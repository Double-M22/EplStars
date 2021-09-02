package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zztn;
import com.google.android.gms.internal.p001firebaseauthapi.zztp;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zze;

/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzp implements OnCompleteListener<zze> {
    final /* synthetic */ PhoneAuthOptions zza;
    final /* synthetic */ FirebaseAuth zzb;

    zzp(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions) {
        this.zzb = firebaseAuth;
        this.zza = phoneAuthOptions;
    }

    public final void onComplete(Task<zze> task) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        String str3;
        if (!task.isSuccessful()) {
            String valueOf = String.valueOf(task.getException().getMessage());
            if (valueOf.length() != 0) {
                str3 = "Error while validating application identity: ".concat(valueOf);
            } else {
                str3 = new String("Error while validating application identity: ");
            }
            Log.e("FirebaseAuth", str3);
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str2 = null;
            str = null;
        } else {
            String zza2 = task.getResult().zza();
            str = task.getResult().zzb();
            str2 = zza2;
        }
        long longValue = this.zza.zzc().longValue();
        PhoneAuthProvider.OnVerificationStateChangedCallbacks zzD = this.zzb.zzI(this.zza.zzb(), this.zza.zzd());
        zzag zzag = (zzag) this.zza.zzg();
        if (zzag.zze()) {
            zztn zzF = this.zzb.zze;
            String zzb2 = this.zza.zzb();
            String zzE = this.zzb.zzi;
            if (this.zza.zzf() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzF.zzM(zzag, zzb2, zzE, longValue, z2, this.zza.zzh(), str2, str, zztp.zza(), zzD, this.zza.zze(), this.zza.zzi());
            return;
        }
        zztn zzF2 = this.zzb.zze;
        PhoneMultiFactorInfo zzj = this.zza.zzj();
        String zzE2 = this.zzb.zzi;
        if (this.zza.zzf() != null) {
            z = true;
        } else {
            z = false;
        }
        zzF2.zzO(zzag, zzj, zzE2, longValue, z, this.zza.zzh(), str2, str, zztp.zza(), zzD, this.zza.zze(), this.zza.zzi());
    }
}
