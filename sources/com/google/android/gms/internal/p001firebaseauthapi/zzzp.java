package com.google.android.gms.internal.p001firebaseauthapi;

import androidx.core.internal.view.SupportMenu;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzzp {
    private final Object zza;
    private final int zzb;

    zzzp(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzzp)) {
            return false;
        }
        zzzp zzzp = (zzzp) obj;
        if (this.zza == zzzp.zza && this.zzb == zzzp.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
    }
}
