package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzgk extends zzaad<zzgk, zzgj> implements zzabh {
    /* access modifiers changed from: private */
    public static final zzgk zzf;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public zzzb zze = zzzb.zzb;

    static {
        zzgk zzgk = new zzgk();
        zzf = zzgk;
        zzaad.zzy(zzgk.class, zzgk);
    }

    private zzgk() {
    }

    public static zzgk zzc(zzzb zzzb, zzzq zzzq) throws zzaal {
        return (zzgk) zzaad.zzE(zzf, zzzb, zzzq);
    }

    public static zzgj zzd() {
        return (zzgj) zzf.zzs();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzzb zzb() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzb", "zze"});
        } else if (i2 == 3) {
            return new zzgk();
        } else {
            if (i2 == 4) {
                return new zzgj((zzgi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzf;
        }
    }
}
