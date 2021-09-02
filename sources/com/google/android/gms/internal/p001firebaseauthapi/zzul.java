package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.api.Api;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzul  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzul {
    public static final Api.ClientKey<zztr> zza = new Api.ClientKey<>();
    public static final Api<zzuk> zzb = new Api<>("InternalFirebaseAuth.FIREBASE_AUTH_API", zzc, zza);
    private static final Api.AbstractClientBuilder<zztr, zzuk> zzc = new zzui();

    public static zztn zza(Context context, zzuk zzuk) {
        return new zztn(context, zzuk);
    }
}
