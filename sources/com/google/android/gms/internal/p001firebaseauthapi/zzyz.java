package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
class zzyz extends zzyy {
    protected final byte[] zza;

    zzyz(byte[] bArr) {
        if (bArr != null) {
            this.zza = bArr;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzzb) || zzc() != ((zzzb) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzyz)) {
            return obj.equals(this);
        }
        zzyz zzyz = (zzyz) obj;
        int zzs = zzs();
        int zzs2 = zzyz.zzs();
        if (zzs != 0 && zzs2 != 0 && zzs != zzs2) {
            return false;
        }
        int zzc = zzc();
        if (zzc > zzyz.zzc()) {
            int zzc2 = zzc();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(zzc);
            sb.append(zzc2);
            throw new IllegalArgumentException(sb.toString());
        } else if (zzc > zzyz.zzc()) {
            int zzc3 = zzyz.zzc();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(0);
            sb2.append(", ");
            sb2.append(zzc);
            sb2.append(", ");
            sb2.append(zzc3);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzyz instanceof zzyz)) {
            return zzyz.zzf(0, zzc).equals(zzf(0, zzc));
        } else {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzyz.zza;
            zzyz.zzd();
            int i = 0;
            int i2 = 0;
            while (i < zzc) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        }
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public int zzd() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    public final zzzb zzf(int i, int i2) {
        int zzt = zzt(0, i2, zzc());
        if (zzt == 0) {
            return zzzb.zzb;
        }
        return new zzyu(this.zza, 0, zzt);
    }

    /* access modifiers changed from: package-private */
    public final void zzg(zzyp zzyp) throws IOException {
        zzyp.zza(this.zza, 0, zzc());
    }

    /* access modifiers changed from: protected */
    public final String zzh(Charset charset) {
        return new String(this.zza, 0, zzc(), charset);
    }

    public final boolean zzi() {
        return zzacx.zzb(this.zza, 0, zzc());
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i, int i2, int i3) {
        return zzaaj.zzh(i, this.zza, 0, i3);
    }

    public final zzze zzk() {
        return zzze.zzs(this.zza, 0, zzc(), true);
    }
}
