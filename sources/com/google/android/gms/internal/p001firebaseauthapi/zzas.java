package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzas  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public abstract class zzas<PrimitiveT, KeyT> {
    private final Class<PrimitiveT> zza;

    public zzas(Class<PrimitiveT> cls) {
        this.zza = cls;
    }

    /* access modifiers changed from: package-private */
    public final Class<PrimitiveT> zza() {
        return this.zza;
    }

    public abstract PrimitiveT zzb(KeyT keyt) throws GeneralSecurityException;
}
