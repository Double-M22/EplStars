package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzzd extends zzze {
    private final byte[] zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = Integer.MAX_VALUE;

    /* synthetic */ zzzd(byte[] bArr, int i, int i2, boolean z, zzzc zzzc) {
        super((zzzc) null);
        this.zzc = bArr;
        this.zzd = i2;
        this.zzf = 0;
    }

    private final void zzv() {
        int i = this.zzd + this.zze;
        this.zzd = i;
        int i2 = this.zzh;
        if (i > i2) {
            int i3 = i - i2;
            this.zze = i3;
            this.zzd = i - i3;
            return;
        }
        this.zze = 0;
    }

    public final int zza() throws IOException {
        if (zzo()) {
            this.zzg = 0;
            return 0;
        }
        int zzh2 = zzh();
        this.zzg = zzh2;
        if ((zzh2 >>> 3) != 0) {
            return zzh2;
        }
        throw zzaal.zze();
    }

    public final void zzb(int i) throws zzaal {
        if (this.zzg != i) {
            throw zzaal.zzf();
        }
    }

    public final boolean zzd() throws IOException {
        return zzi() != 0;
    }

    public final String zze() throws IOException {
        int zzh2 = zzh();
        if (zzh2 > 0) {
            int i = this.zzd;
            int i2 = this.zzf;
            if (zzh2 <= i - i2) {
                String str = new String(this.zzc, i2, zzh2, zzaaj.zza);
                this.zzf += zzh2;
                return str;
            }
        }
        if (zzh2 == 0) {
            return "";
        }
        if (zzh2 < 0) {
            throw zzaal.zzc();
        }
        throw zzaal.zzb();
    }

    public final String zzf() throws IOException {
        int zzh2 = zzh();
        if (zzh2 > 0) {
            int i = this.zzd;
            int i2 = this.zzf;
            if (zzh2 <= i - i2) {
                String zze2 = zzacx.zze(this.zzc, i2, zzh2);
                this.zzf += zzh2;
                return zze2;
            }
        }
        if (zzh2 == 0) {
            return "";
        }
        if (zzh2 <= 0) {
            throw zzaal.zzc();
        }
        throw zzaal.zzb();
    }

    public final zzzb zzg() throws IOException {
        int zzh2 = zzh();
        if (zzh2 > 0) {
            int i = this.zzd;
            int i2 = this.zzf;
            if (zzh2 <= i - i2) {
                zzzb zzl = zzzb.zzl(this.zzc, i2, zzh2);
                this.zzf += zzh2;
                return zzl;
            }
        }
        if (zzh2 == 0) {
            return zzzb.zzb;
        }
        if (zzh2 > 0) {
            int i3 = this.zzd;
            int i4 = this.zzf;
            if (zzh2 <= i3 - i4) {
                int i5 = zzh2 + i4;
                this.zzf = i5;
                return zzzb.zzn(Arrays.copyOfRange(this.zzc, i4, i5));
            }
        }
        if (zzh2 <= 0) {
            throw zzaal.zzc();
        }
        throw zzaal.zzb();
    }

    /* access modifiers changed from: package-private */
    public final long zzj() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzq = zzq();
            j |= ((long) (zzq & Byte.MAX_VALUE)) << i;
            if ((zzq & 128) == 0) {
                return j;
            }
        }
        throw zzaal.zzd();
    }

    public final int zzk() throws IOException {
        int i = this.zzf;
        if (this.zzd - i >= 4) {
            byte[] bArr = this.zzc;
            this.zzf = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzaal.zzb();
    }

    public final long zzl() throws IOException {
        int i = this.zzf;
        if (this.zzd - i >= 8) {
            byte[] bArr = this.zzc;
            this.zzf = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzaal.zzb();
    }

    public final int zzm(int i) throws zzaal {
        if (i >= 0) {
            int i2 = i + this.zzf;
            int i3 = this.zzh;
            if (i2 <= i3) {
                this.zzh = i2;
                zzv();
                return i3;
            }
            throw zzaal.zzb();
        }
        throw zzaal.zzc();
    }

    public final void zzn(int i) {
        this.zzh = i;
        zzv();
    }

    public final boolean zzo() throws IOException {
        return this.zzf == this.zzd;
    }

    public final int zzp() {
        return this.zzf;
    }

    public final byte zzq() throws IOException {
        int i = this.zzf;
        if (i != this.zzd) {
            byte[] bArr = this.zzc;
            this.zzf = i + 1;
            return bArr[i];
        }
        throw zzaal.zzb();
    }

    public final void zzr(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zzd;
            int i3 = this.zzf;
            if (i <= i2 - i3) {
                this.zzf = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzaal.zzc();
        }
        throw zzaal.zzb();
    }

    public final boolean zzc(int i) throws IOException {
        int zza;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzd - this.zzf >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.zzc;
                    int i4 = this.zzf;
                    this.zzf = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzaal.zzd();
            }
            while (i3 < 10) {
                if (zzq() < 0) {
                    i3++;
                }
            }
            throw zzaal.zzd();
            return true;
        } else if (i2 == 1) {
            zzr(8);
            return true;
        } else if (i2 == 2) {
            zzr(zzh());
            return true;
        } else if (i2 == 3) {
            do {
                zza = zza();
                if (zza == 0 || !zzc(zza)) {
                    zzb(((i >>> 3) << 3) | 4);
                }
                zza = zza();
                break;
            } while (!zzc(zza));
            zzb(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zzr(4);
                return true;
            }
            throw zzaal.zzg();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        if (r2[r3] >= 0) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzh() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzf
            int r1 = r5.zzd
            if (r1 != r0) goto L_0x0008
            goto L_0x006f
        L_0x0008:
            byte[] r2 = r5.zzc
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0013
            r5.zzf = r3
            return r0
        L_0x0013:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006f
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x006c
        L_0x0024:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            r1 = r3
            goto L_0x006c
        L_0x0031:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x006c
        L_0x003f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x006c
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x006c
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x006b
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006f
            goto L_0x006c
        L_0x006b:
            r1 = r3
        L_0x006c:
            r5.zzf = r1
            return r0
        L_0x006f:
            long r0 = r5.zzj()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzzd.zzh():int");
    }

    public final long zzi() throws IOException {
        long j;
        int i = this.zzf;
        int i2 = this.zzd;
        if (i2 != i) {
            byte[] bArr = this.zzc;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzf = i3;
                return (long) b;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b2 = b ^ (bArr[i3] << 7);
                if (b2 < 0) {
                    j = (long) (b2 ^ Byte.MIN_VALUE);
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 14);
                    if (b3 >= 0) {
                        i4 = i5;
                        j = (long) (b3 ^ 16256);
                    } else {
                        i4 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 21);
                        if (b4 < 0) {
                            j = (long) (b4 ^ -2080896);
                        } else {
                            int i6 = i4 + 1;
                            long j2 = (((long) bArr[i4]) << 28) ^ ((long) b4);
                            if (j2 >= 0) {
                                i4 = i6;
                                j = j2 ^ 266354560;
                            } else {
                                int i7 = i6 + 1;
                                long j3 = j2 ^ (((long) bArr[i6]) << 35);
                                if (j3 < 0) {
                                    j = -34093383808L ^ j3;
                                    i4 = i7;
                                } else {
                                    int i8 = i7 + 1;
                                    long j4 = j3 ^ (((long) bArr[i7]) << 42);
                                    if (j4 >= 0) {
                                        i4 = i8;
                                        j = j4 ^ 4363953127296L;
                                    } else {
                                        int i9 = i8 + 1;
                                        long j5 = j4 ^ (((long) bArr[i8]) << 49);
                                        if (j5 < 0) {
                                            j = -558586000294016L ^ j5;
                                            i4 = i9;
                                        } else {
                                            int i10 = i9 + 1;
                                            long j6 = (j5 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                int i11 = i10 + 1;
                                                if (((long) bArr[i10]) >= 0) {
                                                    j = j6;
                                                    i4 = i11;
                                                }
                                            } else {
                                                i4 = i10;
                                                j = j6;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.zzf = i4;
                return j;
            }
        }
        return zzj();
    }
}
