package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final /* synthetic */ class zzsn implements RemoteCall {
    private final zzso zza;

    zzsn(zzso zzso) {
        this.zza = zzso;
    }

    public final void accept(Object obj, Object obj2) {
        this.zza.zzd((zztr) obj, (TaskCompletionSource) obj2);
    }
}
