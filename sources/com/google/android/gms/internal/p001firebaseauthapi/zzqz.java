package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final /* synthetic */ class zzqz implements RemoteCall {
    private final zzra zza;

    zzqz(zzra zzra) {
        this.zza = zzra;
    }

    public final void accept(Object obj, Object obj2) {
        this.zza.zzd((zztr) obj, (TaskCompletionSource) obj2);
    }
}
