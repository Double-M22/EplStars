package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final /* synthetic */ class zztd implements RemoteCall {
    private final zzte zza;

    zztd(zzte zzte) {
        this.zza = zzte;
    }

    public final void accept(Object obj, Object obj2) {
        this.zza.zzd((zztr) obj, (TaskCompletionSource) obj2);
    }
}
