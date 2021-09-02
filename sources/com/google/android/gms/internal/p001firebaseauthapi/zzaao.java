package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaao  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public class zzaao {
    private static final zzzq zzb = zzzq.zza();
    protected volatile zzabg zza;
    private volatile zzzb zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaao)) {
            return false;
        }
        zzaao zzaao = (zzaao) obj;
        zzabg zzabg = this.zza;
        zzabg zzabg2 = zzaao.zza;
        if (zzabg == null && zzabg2 == null) {
            return zzb().equals(zzaao.zzb());
        }
        if (zzabg != null && zzabg2 != null) {
            return zzabg.equals(zzabg2);
        }
        if (zzabg != null) {
            zzaao.zzc(zzabg.zzo());
            return zzabg.equals(zzaao.zza);
        }
        zzc(zzabg2.zzo());
        return this.zza.equals(zzabg2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzyz) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzw();
        }
        return 0;
    }

    public final zzzb zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzzb zzzb = this.zzc;
                return zzzb;
            }
            if (this.zza == null) {
                this.zzc = zzzb.zzb;
            } else {
                this.zzc = this.zza.zzn();
            }
            zzzb zzzb2 = this.zzc;
            return zzzb2;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzc(zzabg zzabg) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzabg;
                        this.zzc = zzzb.zzb;
                    } catch (zzaal e) {
                        this.zza = zzabg;
                        this.zzc = zzzb.zzb;
                    }
                }
            }
        }
    }
}
