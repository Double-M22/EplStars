package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzgh extends zzaad<zzgh, zzgg> implements zzabh {
    /* access modifiers changed from: private */
    public static final zzgh zze;
    private int zzb;

    static {
        zzgh zzgh = new zzgh();
        zze = zzgh;
        zzaad.zzy(zzgh.class, zzgh);
    }

    private zzgh() {
    }

    public static zzgh zzb(zzzb zzzb, zzzq zzzq) throws zzaal {
        return (zzgh) zzaad.zzE(zze, zzzb, zzzq);
    }

    public final int zza() {
        return this.zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        } else if (i2 == 3) {
            return new zzgh();
        } else {
            if (i2 == 4) {
                return new zzgg((zzgf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
