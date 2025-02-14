package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p001firebaseauthapi.zztt;
import com.google.android.gms.internal.p001firebaseauthapi.zzup;
import com.google.android.gms.internal.p001firebaseauthapi.zzvw;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzf {
    /* access modifiers changed from: private */
    public static final String zza = zzf.class.getSimpleName();
    private static final zzf zzb = new zzf();

    private zzf() {
    }

    public static zzf zza() {
        return zzb;
    }

    /* access modifiers changed from: private */
    public final void zze(FirebaseAuth firebaseAuth, zzbm zzbm, Activity activity, TaskCompletionSource<zze> taskCompletionSource) {
        Task task;
        zzbm.zzb(firebaseAuth.getApp().getApplicationContext(), firebaseAuth);
        Preconditions.checkNotNull(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (!zzax.zza().zzb(activity, taskCompletionSource2)) {
            task = Tasks.forException(zztt.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        } else {
            Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent.setClass(activity, RecaptchaActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtra("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.getApp().getOptions().getApiKey());
            if (!TextUtils.isEmpty(firebaseAuth.getTenantId())) {
                intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.getTenantId());
            }
            intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzup.zzb().zza());
            intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", firebaseAuth.getApp().getName());
            activity.startActivity(intent);
            task = taskCompletionSource2.getTask();
        }
        task.addOnSuccessListener(new zzd(this, taskCompletionSource)).addOnFailureListener(new zzc(this, taskCompletionSource));
    }

    public final Task<zze> zzb(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z) {
        SafetyNetClient safetyNetClient;
        zzw zzw = (zzw) firebaseAuth.getFirebaseAuthSettings();
        if (z) {
            safetyNetClient = SafetyNet.getClient(firebaseAuth.getApp().getApplicationContext());
        } else {
            safetyNetClient = null;
        }
        zzbm zza2 = zzbm.zza();
        if (zzvw.zzb(firebaseAuth.getApp()) || zzw.zzd()) {
            return Tasks.forResult(new zze((String) null, (String) null));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task<String> zze = zza2.zze();
        if (zze != null) {
            if (zze.isSuccessful()) {
                return Tasks.forResult(new zze((String) null, zze.getResult()));
            }
            String str2 = zza;
            String valueOf = String.valueOf(zze.getException().getMessage());
            Log.e(str2, valueOf.length() != 0 ? "Error in previous reCAPTCHA flow: ".concat(valueOf) : new String("Error in previous reCAPTCHA flow: "));
            Log.e(zza, "Continuing with application verification as normal");
        }
        if (safetyNetClient == null || zzw.zze()) {
            zze(firebaseAuth, zza2, activity, taskCompletionSource);
        } else {
            FirebaseApp app = firebaseAuth.getApp();
            byte[] bArr = new byte[0];
            if (str != null) {
                try {
                    bArr = str.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    String str3 = zza;
                    String valueOf2 = String.valueOf(e.getMessage());
                    Log.e(str3, valueOf2.length() != 0 ? "Failed to getBytes with exception: ".concat(valueOf2) : new String("Failed to getBytes with exception: "));
                }
            }
            safetyNetClient.attest(bArr, app.getOptions().getApiKey()).addOnSuccessListener(new zzb(this, taskCompletionSource, firebaseAuth, zza2, activity)).addOnFailureListener(new zza(this, firebaseAuth, zza2, activity, taskCompletionSource));
        }
        return taskCompletionSource.getTask();
    }
}
