package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzabc {
    private static final zzabb zza;
    private static final zzabb zzb = new zzabb();

    static {
        zzabb zzabb;
        try {
            zzabb = (zzabb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            zzabb = null;
        }
        zza = zzabb;
    }

    static zzabb zza() {
        return zza;
    }

    static zzabb zzb() {
        return zzb;
    }
}
