package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzd {
    public static final Feature zza = new Feature("firebase_auth", 11);
    public static final Feature zzb = new Feature("firebase_auth_aidl_migration", 1);
    public static final Feature zzc;
    public static final Feature[] zzd;

    static {
        Feature feature = new Feature("firebase_auth_multi_factor_auth", 1);
        zzc = feature;
        zzd = new Feature[]{zza, zzb, feature};
    }
}
