package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzaa  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class zzaa {
    public static final Feature zza = new Feature("sms_code_autofill", 2);
    public static final Feature zzb = new Feature("sms_retrieve", 1);
    public static final Feature zzc;
    public static final Feature[] zzd;

    static {
        Feature feature = new Feature("user_consent", 3);
        zzc = feature;
        zzd = new Feature[]{zza, zzb, feature};
    }
}
