package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzabj<T> implements zzabs<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzacr.zzr();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzabg zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzaau zzn;
    private final zzacg<?, ?> zzo;
    private final zzzr<?> zzp;
    private final zzabl zzq;
    private final zzabb zzr;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.firebase-auth-api.zzabg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.google.android.gms.internal.firebase-auth-api.zzabl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.firebase-auth-api.zzabb} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.firebase-auth-api.zzzr, com.google.android.gms.internal.firebase-auth-api.zzzr<?>] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.firebase-auth-api.zzaau] */
    /* JADX WARNING: type inference failed for: r3v13, types: [com.google.android.gms.internal.firebase-auth-api.zzacg<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzabj(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.p001firebaseauthapi.zzabg r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.p001firebaseauthapi.zzabl r17, com.google.android.gms.internal.p001firebaseauthapi.zzaau r18, com.google.android.gms.internal.p001firebaseauthapi.zzacg<?, ?> r19, com.google.android.gms.internal.p001firebaseauthapi.zzzr<?> r20, com.google.android.gms.internal.p001firebaseauthapi.zzabb r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.zzc = r3
            r3 = r7
            r0.zzd = r3
            r3 = r8
            r0.zze = r3
            r3 = r9
            r0.zzf = r3
            boolean r3 = r1 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzaad
            r0.zzi = r3
            r3 = r11
            r0.zzj = r3
            r3 = 0
            if (r2 == 0) goto L_0x0025
            boolean r4 = r2.zza(r10)
            if (r4 == 0) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x0025:
        L_0x0026:
            r0.zzh = r3
            r3 = r13
            r0.zzk = r3
            r3 = r14
            r0.zzl = r3
            r3 = r15
            r0.zzm = r3
            r3 = r16
            r0.zzq = r3
            r3 = r17
            r0.zzn = r3
            r3 = r18
            r0.zzo = r3
            r0.zzp = r2
            r0.zzg = r1
            r1 = r20
            r0.zzr = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzabj.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.firebase-auth-api.zzabg, boolean, boolean, int[], int, int, com.google.android.gms.internal.firebase-auth-api.zzabl, com.google.android.gms.internal.firebase-auth-api.zzaau, com.google.android.gms.internal.firebase-auth-api.zzacg, com.google.android.gms.internal.firebase-auth-api.zzzr, com.google.android.gms.internal.firebase-auth-api.zzabb, byte[]):void");
    }

    private final <UT, UB> UB zzA(Object obj, int i, UB ub, zzacg<UT, UB> zzacg) {
        int i2 = this.zzc[i];
        Object zzn2 = zzacr.zzn(obj, (long) (zzD(i) & 1048575));
        if (zzn2 == null || zzy(i) == null) {
            return ub;
        }
        zzaba zzaba = (zzaba) zzn2;
        zzaaz zzaaz = (zzaaz) zzx(i);
        throw null;
    }

    private static boolean zzB(Object obj, int i, zzabs zzabs) {
        return zzabs.zzk(zzacr.zzn(obj, (long) (i & 1048575)));
    }

    private final void zzC(Object obj, int i, zzabr zzabr) throws IOException {
        if (zzG(i)) {
            zzacr.zzo(obj, (long) (i & 1048575), zzabr.zzn());
        } else if (this.zzi) {
            zzacr.zzo(obj, (long) (i & 1048575), zzabr.zzm());
        } else {
            zzacr.zzo(obj, (long) (i & 1048575), zzabr.zzq());
        }
    }

    private final int zzD(int i) {
        return this.zzc[i + 1];
    }

    private final int zzE(int i) {
        return this.zzc[i + 2];
    }

    private static int zzF(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzG(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> double zzH(T t, long j) {
        return ((Double) zzacr.zzn(t, j)).doubleValue();
    }

    private static <T> float zzI(T t, long j) {
        return ((Float) zzacr.zzn(t, j)).floatValue();
    }

    private static <T> int zzJ(T t, long j) {
        return ((Integer) zzacr.zzn(t, j)).intValue();
    }

    private static <T> long zzK(T t, long j) {
        return ((Long) zzacr.zzn(t, j)).longValue();
    }

    private static <T> boolean zzL(T t, long j) {
        return ((Boolean) zzacr.zzn(t, j)).booleanValue();
    }

    private final boolean zzM(T t, T t2, int i) {
        return zzO(t, i) == zzO(t2, i);
    }

    private final boolean zzN(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzO(t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zzO(T t, int i) {
        int zzE = zzE(i);
        long j = (long) (zzE & 1048575);
        if (j != 1048575) {
            return (zzacr.zzd(t, j) & (1 << (zzE >>> 20))) != 0;
        }
        int zzD = zzD(i);
        long j2 = (long) (zzD & 1048575);
        switch (zzF(zzD)) {
            case 0:
                return zzacr.zzl(t, j2) != 0.0d;
            case 1:
                return zzacr.zzj(t, j2) != 0.0f;
            case 2:
                return zzacr.zzf(t, j2) != 0;
            case 3:
                return zzacr.zzf(t, j2) != 0;
            case 4:
                return zzacr.zzd(t, j2) != 0;
            case 5:
                return zzacr.zzf(t, j2) != 0;
            case 6:
                return zzacr.zzd(t, j2) != 0;
            case 7:
                return zzacr.zzh(t, j2);
            case 8:
                Object zzn2 = zzacr.zzn(t, j2);
                if (zzn2 instanceof String) {
                    return !((String) zzn2).isEmpty();
                }
                if (zzn2 instanceof zzzb) {
                    return !zzzb.zzb.equals(zzn2);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzacr.zzn(t, j2) != null;
            case 10:
                return !zzzb.zzb.equals(zzacr.zzn(t, j2));
            case 11:
                return zzacr.zzd(t, j2) != 0;
            case 12:
                return zzacr.zzd(t, j2) != 0;
            case 13:
                return zzacr.zzd(t, j2) != 0;
            case 14:
                return zzacr.zzf(t, j2) != 0;
            case 15:
                return zzacr.zzd(t, j2) != 0;
            case 16:
                return zzacr.zzf(t, j2) != 0;
            case 17:
                return zzacr.zzn(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzP(T t, int i) {
        int zzE = zzE(i);
        long j = (long) (1048575 & zzE);
        if (j != 1048575) {
            zzacr.zze(t, j, (1 << (zzE >>> 20)) | zzacr.zzd(t, j));
        }
    }

    private final boolean zzQ(T t, int i, int i2) {
        return zzacr.zzd(t, (long) (zzE(i2) & 1048575)) == i;
    }

    private final void zzR(T t, int i, int i2) {
        zzacr.zze(t, (long) (zzE(i2) & 1048575), i);
    }

    private final int zzS(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzU(i, 0);
    }

    private final int zzT(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzU(i, i2);
    }

    private final int zzU(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final void zzV(T t, zzzm zzzm) throws IOException {
        int i;
        T t2 = t;
        zzzm zzzm2 = zzzm;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int zzD = zzD(i3);
                int i6 = this.zzc[i3];
                int zzF = zzF(zzD);
                if (zzF <= 17) {
                    int i7 = this.zzc[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(t2, (long) i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (zzD & i2);
                switch (zzF) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzf(i6, zzacr.zzl(t2, j));
                            break;
                        }
                    case 1:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zze(i6, zzacr.zzj(t2, j));
                            break;
                        }
                    case 2:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzc(i6, unsafe.getLong(t2, j));
                            break;
                        }
                    case 3:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzh(i6, unsafe.getLong(t2, j));
                            break;
                        }
                    case 4:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzi(i6, unsafe.getInt(t2, j));
                            break;
                        }
                    case 5:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzj(i6, unsafe.getLong(t2, j));
                            break;
                        }
                    case 6:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzk(i6, unsafe.getInt(t2, j));
                            break;
                        }
                    case 7:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzl(i6, zzacr.zzh(t2, j));
                            break;
                        }
                    case 8:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzX(i6, unsafe.getObject(t2, j), zzzm2);
                            break;
                        }
                    case 9:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzr(i6, unsafe.getObject(t2, j), zzw(i3));
                            break;
                        }
                    case 10:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzn(i6, (zzzb) unsafe.getObject(t2, j));
                            break;
                        }
                    case 11:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzo(i6, unsafe.getInt(t2, j));
                            break;
                        }
                    case 12:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzg(i6, unsafe.getInt(t2, j));
                            break;
                        }
                    case 13:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzb(i6, unsafe.getInt(t2, j));
                            break;
                        }
                    case 14:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzd(i6, unsafe.getLong(t2, j));
                            break;
                        }
                    case 15:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzp(i6, unsafe.getInt(t2, j));
                            break;
                        }
                    case 16:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzq(i6, unsafe.getLong(t2, j));
                            break;
                        }
                    case 17:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzzm2.zzs(i6, unsafe.getObject(t2, j), zzw(i3));
                            break;
                        }
                    case 18:
                        zzabu.zzJ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 19:
                        zzabu.zzK(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 20:
                        zzabu.zzL(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 21:
                        zzabu.zzM(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 22:
                        zzabu.zzQ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 23:
                        zzabu.zzO(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 24:
                        zzabu.zzT(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 25:
                        zzabu.zzW(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 26:
                        zzabu.zzX(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2);
                        break;
                    case 27:
                        zzabu.zzZ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, zzw(i3));
                        break;
                    case 28:
                        zzabu.zzY(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2);
                        break;
                    case 29:
                        zzabu.zzR(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 30:
                        zzabu.zzV(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 31:
                        zzabu.zzU(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 32:
                        zzabu.zzP(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 33:
                        zzabu.zzS(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 34:
                        zzabu.zzN(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, false);
                        break;
                    case 35:
                        zzabu.zzJ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 36:
                        zzabu.zzK(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 37:
                        zzabu.zzL(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 38:
                        zzabu.zzM(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 39:
                        zzabu.zzQ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 40:
                        zzabu.zzO(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 41:
                        zzabu.zzT(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 42:
                        zzabu.zzW(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 43:
                        zzabu.zzR(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 44:
                        zzabu.zzV(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 45:
                        zzabu.zzU(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 46:
                        zzabu.zzP(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 47:
                        zzabu.zzS(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 48:
                        zzabu.zzN(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, true);
                        break;
                    case 49:
                        zzabu.zzaa(this.zzc[i3], (List) unsafe.getObject(t2, j), zzzm2, zzw(i3));
                        break;
                    case 50:
                        zzW(zzzm2, i6, unsafe.getObject(t2, j), i3);
                        break;
                    case 51:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzf(i6, zzH(t2, j));
                            break;
                        }
                    case 52:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zze(i6, zzI(t2, j));
                            break;
                        }
                    case 53:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzc(i6, zzK(t2, j));
                            break;
                        }
                    case 54:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzh(i6, zzK(t2, j));
                            break;
                        }
                    case 55:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzi(i6, zzJ(t2, j));
                            break;
                        }
                    case 56:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzj(i6, zzK(t2, j));
                            break;
                        }
                    case 57:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzk(i6, zzJ(t2, j));
                            break;
                        }
                    case 58:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzl(i6, zzL(t2, j));
                            break;
                        }
                    case 59:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzX(i6, unsafe.getObject(t2, j), zzzm2);
                            break;
                        }
                    case 60:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzr(i6, unsafe.getObject(t2, j), zzw(i3));
                            break;
                        }
                    case 61:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzn(i6, (zzzb) unsafe.getObject(t2, j));
                            break;
                        }
                    case 62:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzo(i6, zzJ(t2, j));
                            break;
                        }
                    case 63:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzg(i6, zzJ(t2, j));
                            break;
                        }
                    case 64:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzb(i6, zzJ(t2, j));
                            break;
                        }
                    case 65:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzd(i6, zzK(t2, j));
                            break;
                        }
                    case 66:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzp(i6, zzJ(t2, j));
                            break;
                        }
                    case 67:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzq(i6, zzK(t2, j));
                            break;
                        }
                    case 68:
                        if (!zzQ(t2, i6, i3)) {
                            break;
                        } else {
                            zzzm2.zzs(i6, unsafe.getObject(t2, j), zzw(i3));
                            break;
                        }
                }
                i3 += 3;
                i2 = 1048575;
            }
            zzacg<?, ?> zzacg = this.zzo;
            zzacg.zzr(zzacg.zzj(t2), zzzm2);
            return;
        }
        this.zzp.zzb(t2);
        throw null;
    }

    private static final void zzX(int i, Object obj, zzzm zzzm) throws IOException {
        if (obj instanceof String) {
            zzzm.zzm(i, (String) obj);
        } else {
            zzzm.zzn(i, (zzzb) obj);
        }
    }

    static zzach zzg(Object obj) {
        zzaad zzaad = (zzaad) obj;
        zzach zzach = zzaad.zzc;
        if (zzach != zzach.zza()) {
            return zzach;
        }
        zzach zzb2 = zzach.zzb();
        zzaad.zzc = zzb2;
        return zzb2;
    }

    static <T> zzabj<T> zzl(Class<T> cls, zzabd zzabd, zzabl zzabl, zzaau zzaau, zzacg<?, ?> zzacg, zzzr<?> zzzr, zzabb zzabb) {
        if (zzabd instanceof zzabq) {
            return zzm((zzabq) zzabd, zzabl, zzaau, zzacg, zzzr, zzabb);
        }
        zzacd zzacd = (zzacd) zzabd;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.p001firebaseauthapi.zzabj<T> zzm(com.google.android.gms.internal.p001firebaseauthapi.zzabq r34, com.google.android.gms.internal.p001firebaseauthapi.zzabl r35, com.google.android.gms.internal.p001firebaseauthapi.zzaau r36, com.google.android.gms.internal.p001firebaseauthapi.zzacg<?, ?> r37, com.google.android.gms.internal.p001firebaseauthapi.zzzr<?> r38, com.google.android.gms.internal.p001firebaseauthapi.zzabb r39) {
        /*
            int r0 = r34.zzc()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.zzd()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            if (r6 != 0) goto L_0x0058
            int[] r6 = zza
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0177
        L_0x0058:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0078
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0064:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0074
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0064
        L_0x0074:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
            goto L_0x0079
        L_0x0078:
        L_0x0079:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0099
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0085:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0095
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0085
        L_0x0095:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
            goto L_0x009a
        L_0x0099:
        L_0x009a:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00ba
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a6:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b6
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a6
        L_0x00b6:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
            goto L_0x00bb
        L_0x00ba:
        L_0x00bb:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00db
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c7:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d7
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c7
        L_0x00d7:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
            goto L_0x00dc
        L_0x00db:
        L_0x00dc:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00fc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00e8:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00f8
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00e8
        L_0x00f8:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
            goto L_0x00fd
        L_0x00fc:
        L_0x00fd:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x011d
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0109:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0119
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x0109
        L_0x0119:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
            goto L_0x011e
        L_0x011d:
        L_0x011e:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0140
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x012a:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x013b
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x012a
        L_0x013b:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
            goto L_0x0141
        L_0x0140:
        L_0x0141:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0165
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x014d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x015f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x014d
        L_0x015f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
            goto L_0x0166
        L_0x0165:
        L_0x0166:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0177:
            sun.misc.Unsafe r15 = zzb
            java.lang.Object[] r17 = r34.zze()
            com.google.android.gms.internal.firebase-auth-api.zzabg r18 = r34.zzb()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0195:
            if (r4 >= r3) goto L_0x03e9
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01bd
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x01a5:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01b7
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x01a5
        L_0x01b7:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01bf
        L_0x01bd:
            r2 = r24
        L_0x01bf:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01ec
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01cd:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01e6
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01cd
        L_0x01e6:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01f0
        L_0x01ec:
            r28 = r3
            r3 = r24
        L_0x01f0:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01fe
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01fe:
            r14 = 51
            if (r5 < r14) goto L_0x02a9
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0234
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0215:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x022e
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0215
        L_0x022e:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0238
        L_0x0234:
            r32 = r12
            r14 = r27
        L_0x0238:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x025b
            r14 = 17
            if (r12 != r14) goto L_0x0245
            goto L_0x025b
        L_0x0245:
            r14 = 12
            if (r12 != r14) goto L_0x026a
            if (r10 != 0) goto L_0x026a
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            r16 = r14
            goto L_0x026a
        L_0x025b:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            r16 = r14
        L_0x026a:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0274
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x027c
        L_0x0274:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = zzo(r1, r12)
            r17[r3] = r12
        L_0x027c:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x028f
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0297
        L_0x028f:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = zzo(r1, r7)
            r17[r3] = r7
        L_0x0297:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r7 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r8 = r3
            r3 = 0
            goto L_0x03b0
        L_0x02a9:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzo(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x0328
            r12 = 17
            if (r5 != r12) goto L_0x02c4
            r25 = 1
            goto L_0x032a
        L_0x02c4:
            r12 = 27
            if (r5 == r12) goto L_0x0318
            r12 = 49
            if (r5 != r12) goto L_0x02cd
            goto L_0x0318
        L_0x02cd:
            r12 = 12
            if (r5 == r12) goto L_0x0303
            r12 = 30
            if (r5 == r12) goto L_0x0303
            r12 = 44
            if (r5 != r12) goto L_0x02da
            goto L_0x0303
        L_0x02da:
            r12 = 50
            if (r5 != r12) goto L_0x0302
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02fb
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
            goto L_0x02ff
        L_0x02fb:
            r22 = r12
            r7 = r27
        L_0x02ff:
            r25 = 1
            goto L_0x0335
        L_0x0302:
            goto L_0x02ff
        L_0x0303:
            if (r10 != 0) goto L_0x0317
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            r7 = r27
        L_0x0314:
            r25 = 1
            goto L_0x0335
        L_0x0317:
            goto L_0x0314
        L_0x0318:
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            r7 = r27
            goto L_0x0335
        L_0x0328:
            r25 = 1
        L_0x032a:
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x0335:
            r12 = r7
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0393
            r7 = 17
            if (r5 > r7) goto L_0x0393
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x036f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0359:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x036b
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x0359
        L_0x036b:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0371
        L_0x036f:
            r27 = r7
        L_0x0371:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0382
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x038a
        L_0x0382:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = zzo(r1, r11)
            r17[r7] = r11
        L_0x038a:
            r7 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x039c
        L_0x0393:
            r30 = r0
            r7 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x039c:
            r0 = 18
            if (r5 < r0) goto L_0x03ad
            r0 = 49
            if (r5 > r0) goto L_0x03ad
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
            r16 = r12
            goto L_0x03b0
        L_0x03ad:
            r16 = r12
        L_0x03b0:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x03bd
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03be
        L_0x03bd:
            r9 = 0
        L_0x03be:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03c5
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c6
        L_0x03c5:
            r2 = 0
        L_0x03c6:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r31[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r7
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0195
        L_0x03e9:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.firebase-auth-api.zzabj r0 = new com.google.android.gms.internal.firebase-auth-api.zzabj
            r4 = r0
            com.google.android.gms.internal.firebase-auth-api.zzabg r9 = r34.zzb()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzabj.zzm(com.google.android.gms.internal.firebase-auth-api.zzabq, com.google.android.gms.internal.firebase-auth-api.zzabl, com.google.android.gms.internal.firebase-auth-api.zzaau, com.google.android.gms.internal.firebase-auth-api.zzacg, com.google.android.gms.internal.firebase-auth-api.zzzr, com.google.android.gms.internal.firebase-auth-api.zzabb):com.google.android.gms.internal.firebase-auth-api.zzabj");
    }

    private static Field zzo(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void zzp(T t, T t2, int i) {
        long zzD = (long) (zzD(i) & 1048575);
        if (zzO(t2, i)) {
            Object zzn2 = zzacr.zzn(t, zzD);
            Object zzn3 = zzacr.zzn(t2, zzD);
            if (zzn2 != null && zzn3 != null) {
                zzacr.zzo(t, zzD, zzaaj.zzi(zzn2, zzn3));
                zzP(t, i);
            } else if (zzn3 != null) {
                zzacr.zzo(t, zzD, zzn3);
                zzP(t, i);
            }
        }
    }

    private final void zzq(T t, T t2, int i) {
        Object obj;
        int zzD = zzD(i);
        int i2 = this.zzc[i];
        long j = (long) (zzD & 1048575);
        if (zzQ(t2, i2, i)) {
            if (zzQ(t, i2, i)) {
                obj = zzacr.zzn(t, j);
            } else {
                obj = null;
            }
            Object zzn2 = zzacr.zzn(t2, j);
            if (obj != null && zzn2 != null) {
                zzacr.zzo(t, j, zzaaj.zzi(obj, zzn2));
                zzR(t, i2, i);
            } else if (zzn2 != null) {
                zzacr.zzo(t, j, zzn2);
                zzR(t, i2, i);
            }
        }
    }

    private final int zzr(T t) {
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1048575;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzD = zzD(i5);
            int i6 = this.zzc[i5];
            int zzF = zzF(zzD);
            if (zzF <= 17) {
                int i7 = this.zzc[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i4) {
                    i3 = unsafe.getInt(t, (long) i8);
                    i4 = i8;
                }
            } else {
                i = 0;
            }
            long j = (long) (zzD & 1048575);
            switch (zzF) {
                case 0:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 8;
                        break;
                    }
                case 1:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 4;
                        break;
                    }
                case 2:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzB(unsafe.getLong(t, j));
                        break;
                    }
                case 3:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzB(unsafe.getLong(t, j));
                        break;
                    }
                case 4:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzz(unsafe.getInt(t, j));
                        break;
                    }
                case 5:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 8;
                        break;
                    }
                case 6:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 4;
                        break;
                    }
                case 7:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 1;
                        break;
                    }
                case 8:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t, j);
                        if (!(object instanceof zzzb)) {
                            i2 += zzzl.zzy(i6) + zzzl.zzC((String) object);
                            break;
                        } else {
                            int zzy = zzzl.zzy(i6);
                            int zzc2 = ((zzzb) object).zzc();
                            i2 += zzy + zzzl.zzA(zzc2) + zzc2;
                            break;
                        }
                    }
                case 9:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzabu.zzw(i6, unsafe.getObject(t, j), zzw(i5));
                        break;
                    }
                case 10:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        int zzy2 = zzzl.zzy(i6);
                        int zzc3 = ((zzzb) unsafe.getObject(t, j)).zzc();
                        i2 += zzy2 + zzzl.zzA(zzc3) + zzc3;
                        break;
                    }
                case 11:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(unsafe.getInt(t, j));
                        break;
                    }
                case 12:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzz(unsafe.getInt(t, j));
                        break;
                    }
                case 13:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 4;
                        break;
                    }
                case 14:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 8;
                        break;
                    }
                case 15:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzzl.zzG(unsafe.getInt(t, j)));
                        break;
                    }
                case 16:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzB(zzzl.zzH(unsafe.getLong(t, j)));
                        break;
                    }
                case 17:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += zzzl.zzK(i6, (zzabg) unsafe.getObject(t, j), zzw(i5));
                        break;
                    }
                case 18:
                    i2 += zzabu.zzs(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 19:
                    i2 += zzabu.zzq(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 20:
                    i2 += zzabu.zzc(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 21:
                    i2 += zzabu.zze(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 22:
                    i2 += zzabu.zzk(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 23:
                    i2 += zzabu.zzs(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 24:
                    i2 += zzabu.zzq(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 25:
                    i2 += zzabu.zzu(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 26:
                    i2 += zzabu.zzv(i6, (List) unsafe.getObject(t, j));
                    break;
                case 27:
                    i2 += zzabu.zzx(i6, (List) unsafe.getObject(t, j), zzw(i5));
                    break;
                case 28:
                    i2 += zzabu.zzy(i6, (List) unsafe.getObject(t, j));
                    break;
                case 29:
                    i2 += zzabu.zzm(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 30:
                    i2 += zzabu.zzi(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 31:
                    i2 += zzabu.zzq(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 32:
                    i2 += zzabu.zzs(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 33:
                    i2 += zzabu.zzo(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 34:
                    i2 += zzabu.zzg(i6, (List) unsafe.getObject(t, j), false);
                    break;
                case 35:
                    int zzr2 = zzabu.zzr((List) unsafe.getObject(t, j));
                    if (zzr2 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzr2) + zzr2;
                        break;
                    }
                case 36:
                    int zzp2 = zzabu.zzp((List) unsafe.getObject(t, j));
                    if (zzp2 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzp2) + zzp2;
                        break;
                    }
                case 37:
                    int zzb2 = zzabu.zzb((List) unsafe.getObject(t, j));
                    if (zzb2 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzb2) + zzb2;
                        break;
                    }
                case 38:
                    int zzd2 = zzabu.zzd((List) unsafe.getObject(t, j));
                    if (zzd2 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzd2) + zzd2;
                        break;
                    }
                case 39:
                    int zzj2 = zzabu.zzj((List) unsafe.getObject(t, j));
                    if (zzj2 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzj2) + zzj2;
                        break;
                    }
                case 40:
                    int zzr3 = zzabu.zzr((List) unsafe.getObject(t, j));
                    if (zzr3 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzr3) + zzr3;
                        break;
                    }
                case 41:
                    int zzp3 = zzabu.zzp((List) unsafe.getObject(t, j));
                    if (zzp3 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzp3) + zzp3;
                        break;
                    }
                case 42:
                    int zzt = zzabu.zzt((List) unsafe.getObject(t, j));
                    if (zzt <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzt) + zzt;
                        break;
                    }
                case 43:
                    int zzl2 = zzabu.zzl((List) unsafe.getObject(t, j));
                    if (zzl2 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzl2) + zzl2;
                        break;
                    }
                case 44:
                    int zzh2 = zzabu.zzh((List) unsafe.getObject(t, j));
                    if (zzh2 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzh2) + zzh2;
                        break;
                    }
                case 45:
                    int zzp4 = zzabu.zzp((List) unsafe.getObject(t, j));
                    if (zzp4 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzp4) + zzp4;
                        break;
                    }
                case 46:
                    int zzr4 = zzabu.zzr((List) unsafe.getObject(t, j));
                    if (zzr4 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzr4) + zzr4;
                        break;
                    }
                case 47:
                    int zzn2 = zzabu.zzn((List) unsafe.getObject(t, j));
                    if (zzn2 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzn2) + zzn2;
                        break;
                    }
                case 48:
                    int zzf2 = zzabu.zzf((List) unsafe.getObject(t, j));
                    if (zzf2 <= 0) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzf2) + zzf2;
                        break;
                    }
                case 49:
                    i2 += zzabu.zzz(i6, (List) unsafe.getObject(t, j), zzw(i5));
                    break;
                case 50:
                    zzabb.zza(i6, unsafe.getObject(t, j), zzx(i5));
                    break;
                case 51:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 8;
                        break;
                    }
                case 52:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 4;
                        break;
                    }
                case 53:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzB(zzK(t, j));
                        break;
                    }
                case 54:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzB(zzK(t, j));
                        break;
                    }
                case 55:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzz(zzJ(t, j));
                        break;
                    }
                case 56:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 8;
                        break;
                    }
                case 57:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 4;
                        break;
                    }
                case 58:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 1;
                        break;
                    }
                case 59:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t, j);
                        if (!(object2 instanceof zzzb)) {
                            i2 += zzzl.zzy(i6) + zzzl.zzC((String) object2);
                            break;
                        } else {
                            int zzy3 = zzzl.zzy(i6);
                            int zzc4 = ((zzzb) object2).zzc();
                            i2 += zzy3 + zzzl.zzA(zzc4) + zzc4;
                            break;
                        }
                    }
                case 60:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzabu.zzw(i6, unsafe.getObject(t, j), zzw(i5));
                        break;
                    }
                case 61:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        int zzy4 = zzzl.zzy(i6);
                        int zzc5 = ((zzzb) unsafe.getObject(t, j)).zzc();
                        i2 += zzy4 + zzzl.zzA(zzc5) + zzc5;
                        break;
                    }
                case 62:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzJ(t, j));
                        break;
                    }
                case 63:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzz(zzJ(t, j));
                        break;
                    }
                case 64:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 4;
                        break;
                    }
                case 65:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + 8;
                        break;
                    }
                case 66:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzA(zzzl.zzG(zzJ(t, j)));
                        break;
                    }
                case 67:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzy(i6) + zzzl.zzB(zzzl.zzH(zzK(t, j)));
                        break;
                    }
                case 68:
                    if (!zzQ(t, i6, i5)) {
                        break;
                    } else {
                        i2 += zzzl.zzK(i6, (zzabg) unsafe.getObject(t, j), zzw(i5));
                        break;
                    }
            }
        }
        zzacg<?, ?> zzacg = this.zzo;
        int zzq2 = i2 + zzacg.zzq(zzacg.zzj(t));
        if (!this.zzh) {
            return zzq2;
        }
        this.zzp.zzb(t);
        throw null;
    }

    private final int zzs(T t) {
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzD = zzD(i2);
            int zzF = zzF(zzD);
            int i3 = this.zzc[i2];
            long j = (long) (zzD & 1048575);
            if (zzF >= zzzw.DOUBLE_LIST_PACKED.zza() && zzF <= zzzw.SINT64_LIST_PACKED.zza()) {
                int i4 = this.zzc[i2 + 2];
            }
            switch (zzF) {
                case 0:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 8;
                        break;
                    }
                case 1:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 4;
                        break;
                    }
                case 2:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzB(zzacr.zzf(t, j));
                        break;
                    }
                case 3:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzB(zzacr.zzf(t, j));
                        break;
                    }
                case 4:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzz(zzacr.zzd(t, j));
                        break;
                    }
                case 5:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 8;
                        break;
                    }
                case 6:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 4;
                        break;
                    }
                case 7:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 1;
                        break;
                    }
                case 8:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        Object zzn2 = zzacr.zzn(t, j);
                        if (!(zzn2 instanceof zzzb)) {
                            i += zzzl.zzy(i3) + zzzl.zzC((String) zzn2);
                            break;
                        } else {
                            int zzy = zzzl.zzy(i3);
                            int zzc2 = ((zzzb) zzn2).zzc();
                            i += zzy + zzzl.zzA(zzc2) + zzc2;
                            break;
                        }
                    }
                case 9:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzabu.zzw(i3, zzacr.zzn(t, j), zzw(i2));
                        break;
                    }
                case 10:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        int zzy2 = zzzl.zzy(i3);
                        int zzc3 = ((zzzb) zzacr.zzn(t, j)).zzc();
                        i += zzy2 + zzzl.zzA(zzc3) + zzc3;
                        break;
                    }
                case 11:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzacr.zzd(t, j));
                        break;
                    }
                case 12:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzz(zzacr.zzd(t, j));
                        break;
                    }
                case 13:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 4;
                        break;
                    }
                case 14:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 8;
                        break;
                    }
                case 15:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzzl.zzG(zzacr.zzd(t, j)));
                        break;
                    }
                case 16:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzB(zzzl.zzH(zzacr.zzf(t, j)));
                        break;
                    }
                case 17:
                    if (!zzO(t, i2)) {
                        break;
                    } else {
                        i += zzzl.zzK(i3, (zzabg) zzacr.zzn(t, j), zzw(i2));
                        break;
                    }
                case 18:
                    i += zzabu.zzs(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 19:
                    i += zzabu.zzq(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 20:
                    i += zzabu.zzc(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 21:
                    i += zzabu.zze(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 22:
                    i += zzabu.zzk(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 23:
                    i += zzabu.zzs(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 24:
                    i += zzabu.zzq(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 25:
                    i += zzabu.zzu(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 26:
                    i += zzabu.zzv(i3, (List) zzacr.zzn(t, j));
                    break;
                case 27:
                    i += zzabu.zzx(i3, (List) zzacr.zzn(t, j), zzw(i2));
                    break;
                case 28:
                    i += zzabu.zzy(i3, (List) zzacr.zzn(t, j));
                    break;
                case 29:
                    i += zzabu.zzm(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 30:
                    i += zzabu.zzi(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 31:
                    i += zzabu.zzq(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 32:
                    i += zzabu.zzs(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 33:
                    i += zzabu.zzo(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 34:
                    i += zzabu.zzg(i3, (List) zzacr.zzn(t, j), false);
                    break;
                case 35:
                    int zzr2 = zzabu.zzr((List) unsafe.getObject(t, j));
                    if (zzr2 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzr2) + zzr2;
                        break;
                    }
                case 36:
                    int zzp2 = zzabu.zzp((List) unsafe.getObject(t, j));
                    if (zzp2 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzp2) + zzp2;
                        break;
                    }
                case 37:
                    int zzb2 = zzabu.zzb((List) unsafe.getObject(t, j));
                    if (zzb2 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzb2) + zzb2;
                        break;
                    }
                case 38:
                    int zzd2 = zzabu.zzd((List) unsafe.getObject(t, j));
                    if (zzd2 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzd2) + zzd2;
                        break;
                    }
                case 39:
                    int zzj2 = zzabu.zzj((List) unsafe.getObject(t, j));
                    if (zzj2 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzj2) + zzj2;
                        break;
                    }
                case 40:
                    int zzr3 = zzabu.zzr((List) unsafe.getObject(t, j));
                    if (zzr3 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzr3) + zzr3;
                        break;
                    }
                case 41:
                    int zzp3 = zzabu.zzp((List) unsafe.getObject(t, j));
                    if (zzp3 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzp3) + zzp3;
                        break;
                    }
                case 42:
                    int zzt = zzabu.zzt((List) unsafe.getObject(t, j));
                    if (zzt <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzt) + zzt;
                        break;
                    }
                case 43:
                    int zzl2 = zzabu.zzl((List) unsafe.getObject(t, j));
                    if (zzl2 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzl2) + zzl2;
                        break;
                    }
                case 44:
                    int zzh2 = zzabu.zzh((List) unsafe.getObject(t, j));
                    if (zzh2 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzh2) + zzh2;
                        break;
                    }
                case 45:
                    int zzp4 = zzabu.zzp((List) unsafe.getObject(t, j));
                    if (zzp4 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzp4) + zzp4;
                        break;
                    }
                case 46:
                    int zzr4 = zzabu.zzr((List) unsafe.getObject(t, j));
                    if (zzr4 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzr4) + zzr4;
                        break;
                    }
                case 47:
                    int zzn3 = zzabu.zzn((List) unsafe.getObject(t, j));
                    if (zzn3 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzn3) + zzn3;
                        break;
                    }
                case 48:
                    int zzf2 = zzabu.zzf((List) unsafe.getObject(t, j));
                    if (zzf2 <= 0) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzf2) + zzf2;
                        break;
                    }
                case 49:
                    i += zzabu.zzz(i3, (List) zzacr.zzn(t, j), zzw(i2));
                    break;
                case 50:
                    zzabb.zza(i3, zzacr.zzn(t, j), zzx(i2));
                    break;
                case 51:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 8;
                        break;
                    }
                case 52:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 4;
                        break;
                    }
                case 53:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzB(zzK(t, j));
                        break;
                    }
                case 54:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzB(zzK(t, j));
                        break;
                    }
                case 55:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzz(zzJ(t, j));
                        break;
                    }
                case 56:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 8;
                        break;
                    }
                case 57:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 4;
                        break;
                    }
                case 58:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 1;
                        break;
                    }
                case 59:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        Object zzn4 = zzacr.zzn(t, j);
                        if (!(zzn4 instanceof zzzb)) {
                            i += zzzl.zzy(i3) + zzzl.zzC((String) zzn4);
                            break;
                        } else {
                            int zzy3 = zzzl.zzy(i3);
                            int zzc4 = ((zzzb) zzn4).zzc();
                            i += zzy3 + zzzl.zzA(zzc4) + zzc4;
                            break;
                        }
                    }
                case 60:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzabu.zzw(i3, zzacr.zzn(t, j), zzw(i2));
                        break;
                    }
                case 61:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        int zzy4 = zzzl.zzy(i3);
                        int zzc5 = ((zzzb) zzacr.zzn(t, j)).zzc();
                        i += zzy4 + zzzl.zzA(zzc5) + zzc5;
                        break;
                    }
                case 62:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzJ(t, j));
                        break;
                    }
                case 63:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzz(zzJ(t, j));
                        break;
                    }
                case 64:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 4;
                        break;
                    }
                case 65:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + 8;
                        break;
                    }
                case 66:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzA(zzzl.zzG(zzJ(t, j)));
                        break;
                    }
                case 67:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzy(i3) + zzzl.zzB(zzzl.zzH(zzK(t, j)));
                        break;
                    }
                case 68:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i += zzzl.zzK(i3, (zzabg) zzacr.zzn(t, j), zzw(i2));
                        break;
                    }
            }
        }
        zzacg<?, ?> zzacg = this.zzo;
        return i + zzacg.zzq(zzacg.zzj(t));
    }

    private final int zzt(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzym zzym) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        int i8;
        int i9;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i10 = i;
        int i11 = i2;
        int i12 = i3;
        int i13 = i5;
        int i14 = i6;
        long j3 = j2;
        zzym zzym2 = zzym;
        zzaai zzaai = (zzaai) zzb.getObject(t2, j3);
        if (!zzaai.zza()) {
            int size = zzaai.size();
            zzaai = zzaai.zze(size == 0 ? 10 : size + size);
            zzb.putObject(t2, j3, zzaai);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i13 == 2) {
                    zzzn zzzn = (zzzn) zzaai;
                    int zza2 = zzyn.zza(bArr2, i10, zzym2);
                    int i15 = zzym2.zza + zza2;
                    while (zza2 < i15) {
                        zzzn.zzd(Double.longBitsToDouble(zzyn.zze(bArr2, zza2)));
                        zza2 += 8;
                    }
                    if (zza2 == i15) {
                        return zza2;
                    }
                    throw zzaal.zzb();
                } else if (i13 == 1) {
                    zzzn zzzn2 = (zzzn) zzaai;
                    zzzn2.zzd(Double.longBitsToDouble(zzyn.zze(bArr, i)));
                    int i16 = i10 + 8;
                    while (i16 < i11) {
                        int zza3 = zzyn.zza(bArr2, i16, zzym2);
                        if (i12 != zzym2.zza) {
                            return i16;
                        }
                        zzzn2.zzd(Double.longBitsToDouble(zzyn.zze(bArr2, zza3)));
                        i16 = zza3 + 8;
                    }
                    return i16;
                }
                break;
            case 19:
            case 36:
                if (i13 == 2) {
                    zzzx zzzx = (zzzx) zzaai;
                    int zza4 = zzyn.zza(bArr2, i10, zzym2);
                    int i17 = zzym2.zza + zza4;
                    while (zza4 < i17) {
                        zzzx.zzd(Float.intBitsToFloat(zzyn.zzd(bArr2, zza4)));
                        zza4 += 4;
                    }
                    if (zza4 == i17) {
                        return zza4;
                    }
                    throw zzaal.zzb();
                } else if (i13 == 5) {
                    zzzx zzzx2 = (zzzx) zzaai;
                    zzzx2.zzd(Float.intBitsToFloat(zzyn.zzd(bArr, i)));
                    int i18 = i10 + 4;
                    while (i18 < i11) {
                        int zza5 = zzyn.zza(bArr2, i18, zzym2);
                        if (i12 != zzym2.zza) {
                            return i18;
                        }
                        zzzx2.zzd(Float.intBitsToFloat(zzyn.zzd(bArr2, zza5)));
                        i18 = zza5 + 4;
                    }
                    return i18;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    zzaav zzaav = (zzaav) zzaai;
                    int zza6 = zzyn.zza(bArr2, i10, zzym2);
                    int i19 = zzym2.zza + zza6;
                    while (zza6 < i19) {
                        zza6 = zzyn.zzc(bArr2, zza6, zzym2);
                        zzaav.zzf(zzym2.zzb);
                    }
                    if (zza6 == i19) {
                        return zza6;
                    }
                    throw zzaal.zzb();
                } else if (i13 == 0) {
                    zzaav zzaav2 = (zzaav) zzaai;
                    int zzc2 = zzyn.zzc(bArr2, i10, zzym2);
                    zzaav2.zzf(zzym2.zzb);
                    while (zzc2 < i11) {
                        int zza7 = zzyn.zza(bArr2, zzc2, zzym2);
                        if (i12 != zzym2.zza) {
                            return zzc2;
                        }
                        zzc2 = zzyn.zzc(bArr2, zza7, zzym2);
                        zzaav2.zzf(zzym2.zzb);
                    }
                    return zzc2;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return zzyn.zzl(bArr2, i10, zzaai, zzym2);
                }
                if (i13 == 0) {
                    return zzyn.zzk(i3, bArr, i, i2, zzaai, zzym);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    zzaav zzaav3 = (zzaav) zzaai;
                    int zza8 = zzyn.zza(bArr2, i10, zzym2);
                    int i20 = zzym2.zza + zza8;
                    while (zza8 < i20) {
                        zzaav3.zzf(zzyn.zze(bArr2, zza8));
                        zza8 += 8;
                    }
                    if (zza8 == i20) {
                        return zza8;
                    }
                    throw zzaal.zzb();
                } else if (i13 == 1) {
                    zzaav zzaav4 = (zzaav) zzaai;
                    zzaav4.zzf(zzyn.zze(bArr, i));
                    int i21 = i10 + 8;
                    while (i21 < i11) {
                        int zza9 = zzyn.zza(bArr2, i21, zzym2);
                        if (i12 != zzym2.zza) {
                            return i21;
                        }
                        zzaav4.zzf(zzyn.zze(bArr2, zza9));
                        i21 = zza9 + 8;
                    }
                    return i21;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    zzaae zzaae = (zzaae) zzaai;
                    int zza10 = zzyn.zza(bArr2, i10, zzym2);
                    int i22 = zzym2.zza + zza10;
                    while (zza10 < i22) {
                        zzaae.zzf(zzyn.zzd(bArr2, zza10));
                        zza10 += 4;
                    }
                    if (zza10 == i22) {
                        return zza10;
                    }
                    throw zzaal.zzb();
                } else if (i13 == 5) {
                    zzaae zzaae2 = (zzaae) zzaai;
                    zzaae2.zzf(zzyn.zzd(bArr, i));
                    int i23 = i10 + 4;
                    while (i23 < i11) {
                        int zza11 = zzyn.zza(bArr2, i23, zzym2);
                        if (i12 != zzym2.zza) {
                            return i23;
                        }
                        zzaae2.zzf(zzyn.zzd(bArr2, zza11));
                        i23 = zza11 + 4;
                    }
                    return i23;
                }
                break;
            case 25:
            case 42:
                if (i13 == 2) {
                    zzyo zzyo = (zzyo) zzaai;
                    int zza12 = zzyn.zza(bArr2, i10, zzym2);
                    int i24 = zzym2.zza + zza12;
                    while (zza12 < i24) {
                        zza12 = zzyn.zzc(bArr2, zza12, zzym2);
                        if (zzym2.zzb != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zzyo.zzd(z3);
                    }
                    if (zza12 == i24) {
                        return zza12;
                    }
                    throw zzaal.zzb();
                } else if (i13 == 0) {
                    zzyo zzyo2 = (zzyo) zzaai;
                    int zzc3 = zzyn.zzc(bArr2, i10, zzym2);
                    if (zzym2.zzb != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzyo2.zzd(z);
                    while (zzc3 < i11) {
                        int zza13 = zzyn.zza(bArr2, zzc3, zzym2);
                        if (i12 != zzym2.zza) {
                            return zzc3;
                        }
                        zzc3 = zzyn.zzc(bArr2, zza13, zzym2);
                        if (zzym2.zzb != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zzyo2.zzd(z2);
                    }
                    return zzc3;
                }
                break;
            case 26:
                if (i13 == 2) {
                    if ((j & 536870912) == 0) {
                        int zza14 = zzyn.zza(bArr2, i10, zzym2);
                        int i25 = zzym2.zza;
                        if (i25 >= 0) {
                            if (i25 == 0) {
                                zzaai.add("");
                            } else {
                                zzaai.add(new String(bArr2, zza14, i25, zzaaj.zza));
                                zza14 += i25;
                            }
                            while (i10 < i11) {
                                int zza15 = zzyn.zza(bArr2, i10, zzym2);
                                if (i12 != zzym2.zza) {
                                    break;
                                } else {
                                    i10 = zzyn.zza(bArr2, zza15, zzym2);
                                    int i26 = zzym2.zza;
                                    if (i26 < 0) {
                                        throw zzaal.zzc();
                                    } else if (i26 == 0) {
                                        zzaai.add("");
                                    } else {
                                        zzaai.add(new String(bArr2, i10, i26, zzaaj.zza));
                                        i10 += i26;
                                    }
                                }
                            }
                            break;
                        } else {
                            throw zzaal.zzc();
                        }
                    } else {
                        int zza16 = zzyn.zza(bArr2, i10, zzym2);
                        int i27 = zzym2.zza;
                        if (i27 >= 0) {
                            if (i27 == 0) {
                                zzaai.add("");
                            } else {
                                int i28 = zza16 + i27;
                                if (zzacx.zzb(bArr2, zza16, i28)) {
                                    zzaai.add(new String(bArr2, zza16, i27, zzaaj.zza));
                                    zza16 = i28;
                                } else {
                                    throw zzaal.zzi();
                                }
                            }
                            while (i10 < i11) {
                                int zza17 = zzyn.zza(bArr2, i10, zzym2);
                                if (i12 != zzym2.zza) {
                                    break;
                                } else {
                                    int i29 = zzyn.zza(bArr2, zza17, zzym2);
                                    int i30 = zzym2.zza;
                                    if (i30 < 0) {
                                        throw zzaal.zzc();
                                    } else if (i30 == 0) {
                                        zzaai.add("");
                                    } else {
                                        int i31 = i29 + i30;
                                        if (zzacx.zzb(bArr2, i29, i31)) {
                                            zzaai.add(new String(bArr2, i29, i30, zzaaj.zza));
                                            i29 = i31;
                                        } else {
                                            throw zzaal.zzi();
                                        }
                                    }
                                }
                            }
                            break;
                        } else {
                            throw zzaal.zzc();
                        }
                    }
                }
                break;
            case 27:
                if (i13 == 2) {
                    return zzyn.zzm(zzw(i14), i3, bArr, i, i2, zzaai, zzym);
                }
                break;
            case 28:
                if (i13 == 2) {
                    int zza18 = zzyn.zza(bArr2, i10, zzym2);
                    int i32 = zzym2.zza;
                    if (i32 < 0) {
                        throw zzaal.zzc();
                    } else if (i32 <= bArr2.length - zza18) {
                        if (i32 == 0) {
                            zzaai.add(zzzb.zzb);
                        } else {
                            zzaai.add(zzzb.zzl(bArr2, zza18, i32));
                            zza18 += i32;
                        }
                        while (i8 < i11) {
                            int zza19 = zzyn.zza(bArr2, i8, zzym2);
                            if (i12 != zzym2.zza) {
                                return i8;
                            }
                            i8 = zzyn.zza(bArr2, zza19, zzym2);
                            int i33 = zzym2.zza;
                            if (i33 < 0) {
                                throw zzaal.zzc();
                            } else if (i33 > bArr2.length - i8) {
                                throw zzaal.zzb();
                            } else if (i33 == 0) {
                                zzaai.add(zzzb.zzb);
                            } else {
                                zzaai.add(zzzb.zzl(bArr2, i8, i33));
                                i8 += i33;
                            }
                        }
                        return i8;
                    } else {
                        throw zzaal.zzb();
                    }
                }
                break;
            case 30:
            case 44:
                if (i13 == 2) {
                    i9 = zzyn.zzl(bArr2, i10, zzaai, zzym2);
                } else if (i13 == 0) {
                    i9 = zzyn.zzk(i3, bArr, i, i2, zzaai, zzym);
                }
                zzaad zzaad = (zzaad) t2;
                zzach zzach = zzaad.zzc;
                if (zzach == zzach.zza()) {
                    zzach = null;
                }
                Object zzG = zzabu.zzG(i4, zzaai, zzy(i14), zzach, this.zzo);
                if (zzG == null) {
                    return i9;
                }
                zzaad.zzc = (zzach) zzG;
                return i9;
            case 33:
            case 47:
                if (i13 == 2) {
                    zzaae zzaae3 = (zzaae) zzaai;
                    int zza20 = zzyn.zza(bArr2, i10, zzym2);
                    int i34 = zzym2.zza + zza20;
                    while (zza20 < i34) {
                        zza20 = zzyn.zza(bArr2, zza20, zzym2);
                        zzaae3.zzf(zzze.zzt(zzym2.zza));
                    }
                    if (zza20 == i34) {
                        return zza20;
                    }
                    throw zzaal.zzb();
                } else if (i13 == 0) {
                    zzaae zzaae4 = (zzaae) zzaai;
                    int zza21 = zzyn.zza(bArr2, i10, zzym2);
                    zzaae4.zzf(zzze.zzt(zzym2.zza));
                    while (zza21 < i11) {
                        int zza22 = zzyn.zza(bArr2, zza21, zzym2);
                        if (i12 != zzym2.zza) {
                            return zza21;
                        }
                        zza21 = zzyn.zza(bArr2, zza22, zzym2);
                        zzaae4.zzf(zzze.zzt(zzym2.zza));
                    }
                    return zza21;
                }
                break;
            case 34:
            case 48:
                if (i13 == 2) {
                    zzaav zzaav5 = (zzaav) zzaai;
                    int zza23 = zzyn.zza(bArr2, i10, zzym2);
                    int i35 = zzym2.zza + zza23;
                    while (zza23 < i35) {
                        zza23 = zzyn.zzc(bArr2, zza23, zzym2);
                        zzaav5.zzf(zzze.zzu(zzym2.zzb));
                    }
                    if (zza23 == i35) {
                        return zza23;
                    }
                    throw zzaal.zzb();
                } else if (i13 == 0) {
                    zzaav zzaav6 = (zzaav) zzaai;
                    int zzc4 = zzyn.zzc(bArr2, i10, zzym2);
                    zzaav6.zzf(zzze.zzu(zzym2.zzb));
                    while (zzc4 < i11) {
                        int zza24 = zzyn.zza(bArr2, zzc4, zzym2);
                        if (i12 != zzym2.zza) {
                            return zzc4;
                        }
                        zzc4 = zzyn.zzc(bArr2, zza24, zzym2);
                        zzaav6.zzf(zzze.zzu(zzym2.zzb));
                    }
                    return zzc4;
                }
                break;
            default:
                if (i13 == 3) {
                    zzabs zzw = zzw(i14);
                    int i36 = (i12 & -8) | 4;
                    int zzj2 = zzyn.zzj(zzw, bArr, i, i2, i36, zzym);
                    zzaai.add(zzym2.zzc);
                    while (zzj2 < i11) {
                        int zza25 = zzyn.zza(bArr2, zzj2, zzym2);
                        if (i12 != zzym2.zza) {
                            return zzj2;
                        }
                        zzj2 = zzyn.zzj(zzw, bArr, zza25, i2, i36, zzym);
                        zzaai.add(zzym2.zzc);
                    }
                    return zzj2;
                }
                break;
        }
        return i10;
    }

    private final <K, V> int zzu(T t, byte[] bArr, int i, int i2, int i3, long j, zzym zzym) throws IOException {
        Unsafe unsafe = zzb;
        Object zzx = zzx(i3);
        Object object = unsafe.getObject(t, j);
        if (zzabb.zzb(object)) {
            zzaba zzc2 = zzaba.zza().zzc();
            zzabb.zzc(zzc2, object);
            unsafe.putObject(t, j, zzc2);
        }
        zzaaz zzaaz = (zzaaz) zzx;
        throw null;
    }

    private final int zzv(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzym zzym) throws IOException {
        boolean z;
        Object obj;
        Object obj2;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        zzym zzym2 = zzym;
        Unsafe unsafe = zzb;
        long j3 = (long) (this.zzc[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(zzyn.zze(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(zzyn.zzd(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int zzc2 = zzyn.zzc(bArr2, i9, zzym2);
                    unsafe.putObject(t2, j2, Long.valueOf(zzym2.zzb));
                    unsafe.putInt(t2, j3, i11);
                    return zzc2;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int zza2 = zzyn.zza(bArr2, i9, zzym2);
                    unsafe.putObject(t2, j2, Integer.valueOf(zzym2.zza));
                    unsafe.putInt(t2, j3, i11);
                    return zza2;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(zzyn.zze(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(zzyn.zzd(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int zzc3 = zzyn.zzc(bArr2, i9, zzym2);
                    if (zzym2.zzb != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(t2, j2, Boolean.valueOf(z));
                    unsafe.putInt(t2, j3, i11);
                    return zzc3;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int zza3 = zzyn.zza(bArr2, i9, zzym2);
                    int i14 = zzym2.zza;
                    if (i14 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || zzacx.zzb(bArr2, zza3, zza3 + i14)) {
                        unsafe.putObject(t2, j2, new String(bArr2, zza3, i14, zzaaj.zza));
                        zza3 += i14;
                    } else {
                        throw zzaal.zzi();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return zza3;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int zzi2 = zzyn.zzi(zzw(i13), bArr2, i9, i2, zzym2);
                    if (unsafe.getInt(t2, j3) == i11) {
                        obj = unsafe.getObject(t2, j2);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        unsafe.putObject(t2, j2, zzym2.zzc);
                    } else {
                        unsafe.putObject(t2, j2, zzaaj.zzi(obj, zzym2.zzc));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return zzi2;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int zzh2 = zzyn.zzh(bArr2, i9, zzym2);
                    unsafe.putObject(t2, j2, zzym2.zzc);
                    unsafe.putInt(t2, j3, i11);
                    return zzh2;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int zza4 = zzyn.zza(bArr2, i9, zzym2);
                    int i15 = zzym2.zza;
                    zzaah zzy = zzy(i13);
                    if (zzy == null || zzy.zza()) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i15));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        zzg(t).zzh(i10, Long.valueOf((long) i15));
                    }
                    return zza4;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int zza5 = zzyn.zza(bArr2, i9, zzym2);
                    unsafe.putObject(t2, j2, Integer.valueOf(zzze.zzt(zzym2.zza)));
                    unsafe.putInt(t2, j3, i11);
                    return zza5;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int zzc4 = zzyn.zzc(bArr2, i9, zzym2);
                    unsafe.putObject(t2, j2, Long.valueOf(zzze.zzu(zzym2.zzb)));
                    unsafe.putInt(t2, j3, i11);
                    return zzc4;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int zzj2 = zzyn.zzj(zzw(i13), bArr, i, i2, (i10 & -8) | 4, zzym);
                    if (unsafe.getInt(t2, j3) == i11) {
                        obj2 = unsafe.getObject(t2, j2);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(t2, j2, zzym2.zzc);
                    } else {
                        unsafe.putObject(t2, j2, zzaaj.zzi(obj2, zzym2.zzc));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return zzj2;
                }
                break;
        }
        return i9;
    }

    private final zzabs zzw(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzabs zzabs = (zzabs) this.zzd[i3];
        if (zzabs != null) {
            return zzabs;
        }
        zzabs zzb2 = zzabo.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzx(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzaah zzy(int i) {
        int i2 = i / 3;
        return (zzaah) this.zzd[i2 + i2 + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzz(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.p001firebaseauthapi.zzym r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = zzb
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x0449
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzb(r0, r12, r3, r11)
            int r3 = r11.zza
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003d
            int r2 = r2 / 3
            int r0 = r15.zzT(r5, r2)
            r2 = r0
            goto L_0x0042
        L_0x003d:
            int r0 = r15.zzS(r5)
            r2 = r0
        L_0x0042:
            if (r2 != r10) goto L_0x004f
            r2 = r4
            r20 = r5
            r28 = r9
            r18 = -1
            r19 = 0
            goto L_0x0423
        L_0x004f:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = zzF(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x02d3
            int[] r10 = r15.zzc
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            if (r10 == r7) goto L_0x0097
            if (r7 == r13) goto L_0x0082
            r23 = r1
            r20 = r2
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0088
        L_0x0082:
            r23 = r1
            r20 = r2
            r7 = r19
        L_0x0088:
            if (r10 == r13) goto L_0x0090
            long r1 = (long) r10
            int r6 = r7.getInt(r14, r1)
            goto L_0x0091
        L_0x0090:
        L_0x0091:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x009d
        L_0x0097:
            r23 = r1
            r20 = r2
            r10 = r19
        L_0x009d:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x02a5;
                case 1: goto L_0x0280;
                case 2: goto L_0x0259;
                case 3: goto L_0x0259;
                case 4: goto L_0x0237;
                case 5: goto L_0x020b;
                case 6: goto L_0x01e5;
                case 7: goto L_0x01b7;
                case 8: goto L_0x0185;
                case 9: goto L_0x0145;
                case 10: goto L_0x0122;
                case 11: goto L_0x0237;
                case 12: goto L_0x0100;
                case 13: goto L_0x01e5;
                case 14: goto L_0x020b;
                case 15: goto L_0x00da;
                case 16: goto L_0x00aa;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            goto L_0x02ca
        L_0x00aa:
            if (r3 != 0) goto L_0x00d1
            int r17 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzc(r12, r4, r11)
            long r0 = r11.zzb
            long r4 = com.google.android.gms.internal.p001firebaseauthapi.zzze.zzu(r0)
            r0 = r10
            r1 = r31
            r13 = r20
            r2 = r8
            r20 = r33
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x00d1:
            r13 = r20
            r20 = r33
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02ca
        L_0x00da:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x00fb
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zza(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzze.zzt(r1)
            r10.putInt(r14, r8, r1)
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x00fb:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02ca
        L_0x0100:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x011d
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zza(r12, r4, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x011d:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02ca
        L_0x0122:
            r13 = r20
            r20 = r33
            r0 = 2
            if (r3 != r0) goto L_0x0140
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzh(r12, r4, r11)
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x0140:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02ca
        L_0x0145:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x017e
            com.google.android.gms.internal.firebase-auth-api.zzabs r0 = r15.zzw(r13)
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzi(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x0165
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x016e
        L_0x0165:
            java.lang.Object r3 = r11.zzc
            java.lang.Object r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaaj.zzi(r1, r3)
            r10.putObject(r14, r8, r1)
        L_0x016e:
            r6 = r6 | r21
            r9 = r10
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x001a
        L_0x017e:
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02ca
        L_0x0185:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r0 = 2
            if (r3 != r0) goto L_0x01b5
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x019c
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzf(r12, r4, r11)
            goto L_0x01a0
        L_0x019c:
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzg(r12, r4, r11)
        L_0x01a0:
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            r6 = r6 | r21
            r9 = r10
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x001a
        L_0x01b5:
            goto L_0x02ca
        L_0x01b7:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x01e3
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzc(r12, r4, r11)
            long r3 = r11.zzb
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x01cf
            goto L_0x01d0
        L_0x01cf:
            r5 = 0
        L_0x01d0:
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzi(r14, r8, r5)
            r6 = r6 | r21
            r9 = r10
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x001a
        L_0x01e3:
            goto L_0x02ca
        L_0x01e5:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x0209
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzd(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
            r6 = r6 | r21
            r9 = r10
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x001a
        L_0x0209:
            goto L_0x02ca
        L_0x020b:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x0234
            long r22 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zze(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x0234:
            r8 = r4
            goto L_0x02ca
        L_0x0237:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x0257
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zza(r12, r4, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x0257:
            goto L_0x02ca
        L_0x0259:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x027f
            int r17 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzc(r12, r4, r11)
            long r4 = r11.zzb
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x027f:
            goto L_0x02ca
        L_0x0280:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x02a4
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzd(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzk(r14, r8, r0)
            int r0 = r4 + 4
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x02a4:
            goto L_0x02ca
        L_0x02a5:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x02c9
            long r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zze(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzm(r14, r8, r0)
            int r0 = r4 + 8
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x02c9:
        L_0x02ca:
            r2 = r4
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x0423
        L_0x02d3:
            r20 = r33
            r23 = r1
            r13 = r2
            r10 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x0331
            r0 = 2
            if (r3 != r0) goto L_0x0323
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.android.gms.internal.firebase-auth-api.zzaai r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzaai) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x0303
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02f9
            r1 = 10
            goto L_0x02fa
        L_0x02f9:
            int r1 = r1 + r1
        L_0x02fa:
            com.google.android.gms.internal.firebase-auth-api.zzaai r0 = r0.zze(r1)
            r10.putObject(r14, r8, r0)
            r5 = r0
            goto L_0x0304
        L_0x0303:
            r5 = r0
        L_0x0304:
            com.google.android.gms.internal.firebase-auth-api.zzabs r0 = r15.zzw(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzm(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
            r9 = r10
            r2 = r13
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x0323:
            r8 = r6
            r15 = r4
            r25 = r7
            r24 = r8
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x03e2
        L_0x0331:
            r1 = 49
            if (r0 > r1) goto L_0x038e
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r20
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r19 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0387
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
            r6 = r24
            r7 = r25
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x0387:
            r2 = r0
            r6 = r24
            r7 = r25
            goto L_0x0423
        L_0x038e:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r19 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x03e8
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x03e1
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r26
            r8 = r35
            int r0 = r0.zzu(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x03db
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
            r6 = r24
            r7 = r25
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x03db:
            r2 = r0
            r6 = r24
            r7 = r25
            goto L_0x0423
        L_0x03e1:
        L_0x03e2:
            r2 = r15
            r6 = r24
            r7 = r25
            goto L_0x0423
        L_0x03e8:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r26
            r12 = r19
            r13 = r35
            int r0 = r0.zzv(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x041e
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
            r6 = r24
            r7 = r25
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x041e:
            r2 = r0
            r6 = r24
            r7 = r25
        L_0x0423:
            com.google.android.gms.internal.firebase-auth-api.zzach r4 = zzg(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyn.zzn(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x0449:
            r24 = r6
            r25 = r7
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x045e
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x045e:
            r1 = r34
            if (r0 != r1) goto L_0x0463
            return r0
        L_0x0463:
            com.google.android.gms.internal.firebase-auth-api.zzaal r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaal.zzh()
            goto L_0x0469
        L_0x0468:
            throw r0
        L_0x0469:
            goto L_0x0468
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzabj.zzz(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzym):int");
    }

    public final T zza() {
        return ((zzaad) this.zzg).zzj(4, (Object) null, (Object) null);
    }

    public final boolean zzb(T t, T t2) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzD = zzD(i);
            long j = (long) (zzD & 1048575);
            switch (zzF(zzD)) {
                case 0:
                    if (zzM(t, t2, i) && Double.doubleToLongBits(zzacr.zzl(t, j)) == Double.doubleToLongBits(zzacr.zzl(t2, j))) {
                        continue;
                    }
                case 1:
                    if (zzM(t, t2, i) && Float.floatToIntBits(zzacr.zzj(t, j)) == Float.floatToIntBits(zzacr.zzj(t2, j))) {
                        continue;
                    }
                case 2:
                    if (zzM(t, t2, i) && zzacr.zzf(t, j) == zzacr.zzf(t2, j)) {
                        continue;
                    }
                case 3:
                    if (zzM(t, t2, i) && zzacr.zzf(t, j) == zzacr.zzf(t2, j)) {
                        continue;
                    }
                case 4:
                    if (zzM(t, t2, i) && zzacr.zzd(t, j) == zzacr.zzd(t2, j)) {
                        continue;
                    }
                case 5:
                    if (zzM(t, t2, i) && zzacr.zzf(t, j) == zzacr.zzf(t2, j)) {
                        continue;
                    }
                case 6:
                    if (zzM(t, t2, i) && zzacr.zzd(t, j) == zzacr.zzd(t2, j)) {
                        continue;
                    }
                case 7:
                    if (zzM(t, t2, i) && zzacr.zzh(t, j) == zzacr.zzh(t2, j)) {
                        continue;
                    }
                case 8:
                    if (zzM(t, t2, i) && zzabu.zzD(zzacr.zzn(t, j), zzacr.zzn(t2, j))) {
                        continue;
                    }
                case 9:
                    if (zzM(t, t2, i) && zzabu.zzD(zzacr.zzn(t, j), zzacr.zzn(t2, j))) {
                        continue;
                    }
                case 10:
                    if (zzM(t, t2, i) && zzabu.zzD(zzacr.zzn(t, j), zzacr.zzn(t2, j))) {
                        continue;
                    }
                case 11:
                    if (zzM(t, t2, i) && zzacr.zzd(t, j) == zzacr.zzd(t2, j)) {
                        continue;
                    }
                case 12:
                    if (zzM(t, t2, i) && zzacr.zzd(t, j) == zzacr.zzd(t2, j)) {
                        continue;
                    }
                case 13:
                    if (zzM(t, t2, i) && zzacr.zzd(t, j) == zzacr.zzd(t2, j)) {
                        continue;
                    }
                case 14:
                    if (zzM(t, t2, i) && zzacr.zzf(t, j) == zzacr.zzf(t2, j)) {
                        continue;
                    }
                case 15:
                    if (zzM(t, t2, i) && zzacr.zzd(t, j) == zzacr.zzd(t2, j)) {
                        continue;
                    }
                case 16:
                    if (zzM(t, t2, i) && zzacr.zzf(t, j) == zzacr.zzf(t2, j)) {
                        continue;
                    }
                case 17:
                    if (zzM(t, t2, i) && zzabu.zzD(zzacr.zzn(t, j), zzacr.zzn(t2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = zzabu.zzD(zzacr.zzn(t, j), zzacr.zzn(t2, j));
                    break;
                case 50:
                    z = zzabu.zzD(zzacr.zzn(t, j), zzacr.zzn(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzE = (long) (zzE(i) & 1048575);
                    if (zzacr.zzd(t, zzE) == zzacr.zzd(t2, zzE) && zzabu.zzD(zzacr.zzn(t, j), zzacr.zzn(t2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzo.zzj(t).equals(this.zzo.zzj(t2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zzb(t);
        this.zzp.zzb(t2);
        throw null;
    }

    public final int zzc(T t) {
        int length = this.zzc.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzD = zzD(i2);
            int i3 = this.zzc[i2];
            long j = (long) (1048575 & zzD);
            int i4 = 37;
            switch (zzF(zzD)) {
                case 0:
                    i = (i * 53) + zzaaj.zze(Double.doubleToLongBits(zzacr.zzl(t, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(zzacr.zzj(t, j));
                    break;
                case 2:
                    i = (i * 53) + zzaaj.zze(zzacr.zzf(t, j));
                    break;
                case 3:
                    i = (i * 53) + zzaaj.zze(zzacr.zzf(t, j));
                    break;
                case 4:
                    i = (i * 53) + zzacr.zzd(t, j);
                    break;
                case 5:
                    i = (i * 53) + zzaaj.zze(zzacr.zzf(t, j));
                    break;
                case 6:
                    i = (i * 53) + zzacr.zzd(t, j);
                    break;
                case 7:
                    i = (i * 53) + zzaaj.zzf(zzacr.zzh(t, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) zzacr.zzn(t, j)).hashCode();
                    break;
                case 9:
                    Object zzn2 = zzacr.zzn(t, j);
                    if (zzn2 != null) {
                        i4 = zzn2.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + zzacr.zzn(t, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + zzacr.zzd(t, j);
                    break;
                case 12:
                    i = (i * 53) + zzacr.zzd(t, j);
                    break;
                case 13:
                    i = (i * 53) + zzacr.zzd(t, j);
                    break;
                case 14:
                    i = (i * 53) + zzaaj.zze(zzacr.zzf(t, j));
                    break;
                case 15:
                    i = (i * 53) + zzacr.zzd(t, j);
                    break;
                case 16:
                    i = (i * 53) + zzaaj.zze(zzacr.zzf(t, j));
                    break;
                case 17:
                    Object zzn3 = zzacr.zzn(t, j);
                    if (zzn3 != null) {
                        i4 = zzn3.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + zzacr.zzn(t, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + zzacr.zzn(t, j).hashCode();
                    break;
                case 51:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaaj.zze(Double.doubleToLongBits(zzH(t, j)));
                        break;
                    }
                case 52:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(zzI(t, j));
                        break;
                    }
                case 53:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaaj.zze(zzK(t, j));
                        break;
                    }
                case 54:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaaj.zze(zzK(t, j));
                        break;
                    }
                case 55:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzJ(t, j);
                        break;
                    }
                case 56:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaaj.zze(zzK(t, j));
                        break;
                    }
                case 57:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzJ(t, j);
                        break;
                    }
                case 58:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaaj.zzf(zzL(t, j));
                        break;
                    }
                case 59:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) zzacr.zzn(t, j)).hashCode();
                        break;
                    }
                case 60:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzacr.zzn(t, j).hashCode();
                        break;
                    }
                case 61:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzacr.zzn(t, j).hashCode();
                        break;
                    }
                case 62:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzJ(t, j);
                        break;
                    }
                case 63:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzJ(t, j);
                        break;
                    }
                case 64:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzJ(t, j);
                        break;
                    }
                case 65:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaaj.zze(zzK(t, j));
                        break;
                    }
                case 66:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzJ(t, j);
                        break;
                    }
                case 67:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaaj.zze(zzK(t, j));
                        break;
                    }
                case 68:
                    if (!zzQ(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzacr.zzn(t, j).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + this.zzo.zzj(t).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzp.zzb(t);
        throw null;
    }

    public final void zzd(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzc.length; i += 3) {
                int zzD = zzD(i);
                long j = (long) (1048575 & zzD);
                int i2 = this.zzc[i];
                switch (zzF(zzD)) {
                    case 0:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zzm(t, j, zzacr.zzl(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 1:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zzk(t, j, zzacr.zzj(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 2:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zzg(t, j, zzacr.zzf(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 3:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zzg(t, j, zzacr.zzf(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 4:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zze(t, j, zzacr.zzd(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 5:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zzg(t, j, zzacr.zzf(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 6:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zze(t, j, zzacr.zzd(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 7:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zzi(t, j, zzacr.zzh(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 8:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zzo(t, j, zzacr.zzn(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 9:
                        zzp(t, t2, i);
                        break;
                    case 10:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zzo(t, j, zzacr.zzn(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 11:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zze(t, j, zzacr.zzd(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 12:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zze(t, j, zzacr.zzd(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 13:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zze(t, j, zzacr.zzd(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 14:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zzg(t, j, zzacr.zzf(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 15:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zze(t, j, zzacr.zzd(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 16:
                        if (!zzO(t2, i)) {
                            break;
                        } else {
                            zzacr.zzg(t, j, zzacr.zzf(t2, j));
                            zzP(t, i);
                            break;
                        }
                    case 17:
                        zzp(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.zzn.zzc(t, t2, j);
                        break;
                    case 50:
                        zzabu.zzI(this.zzr, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zzQ(t2, i2, i)) {
                            break;
                        } else {
                            zzacr.zzo(t, j, zzacr.zzn(t2, j));
                            zzR(t, i2, i);
                            break;
                        }
                    case 60:
                        zzq(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zzQ(t2, i2, i)) {
                            break;
                        } else {
                            zzacr.zzo(t, j, zzacr.zzn(t2, j));
                            zzR(t, i2, i);
                            break;
                        }
                    case 68:
                        zzq(t, t2, i);
                        break;
                }
            }
            zzabu.zzF(this.zzo, t, t2);
            if (this.zzh) {
                zzabu.zzE(this.zzp, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    public final int zze(T t) {
        return this.zzj ? zzs(t) : zzr(t);
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x05c9 A[LOOP:5: B:170:0x05c5->B:172:0x05c9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(T r13, com.google.android.gms.internal.p001firebaseauthapi.zzabr r14, com.google.android.gms.internal.p001firebaseauthapi.zzzq r15) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 0
            if (r15 == 0) goto L_0x05da
            com.google.android.gms.internal.firebase-auth-api.zzacg<?, ?> r8 = r12.zzo
            com.google.android.gms.internal.firebase-auth-api.zzzr<?> r9 = r12.zzp
            r1 = r0
            r10 = r1
        L_0x0009:
            int r2 = r14.zzb()     // Catch:{ all -> 0x05c2 }
            int r3 = r12.zzS(r2)     // Catch:{ all -> 0x05c2 }
            if (r3 >= 0) goto L_0x0079
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L_0x002f
            int r14 = r12.zzl
        L_0x001a:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzA(r13, r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x001a
        L_0x0029:
            if (r10 == 0) goto L_0x05bf
        L_0x002b:
            r8.zzl(r13, r10)
            return
        L_0x002f:
            boolean r3 = r12.zzh     // Catch:{ all -> 0x05c2 }
            if (r3 != 0) goto L_0x0035
            r3 = r0
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.firebase-auth-api.zzabg r3 = r12.zzg     // Catch:{ all -> 0x05c2 }
            java.lang.Object r2 = r9.zzf(r15, r3, r2)     // Catch:{ all -> 0x05c2 }
            r3 = r2
        L_0x003c:
            if (r3 == 0) goto L_0x0053
            if (r1 != 0) goto L_0x0046
            com.google.android.gms.internal.firebase-auth-api.zzzv r1 = r9.zzc(r13)     // Catch:{ all -> 0x05c2 }
            r11 = r1
            goto L_0x0047
        L_0x0046:
            r11 = r1
        L_0x0047:
            r1 = r9
            r2 = r14
            r4 = r15
            r5 = r11
            r6 = r10
            r7 = r8
            java.lang.Object r10 = r1.zze(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x05c2 }
            r1 = r11
            goto L_0x0009
        L_0x0053:
            r8.zza(r14)     // Catch:{ all -> 0x05c2 }
            if (r10 != 0) goto L_0x005c
            java.lang.Object r10 = r8.zzk(r13)     // Catch:{ all -> 0x05c2 }
        L_0x005c:
            boolean r2 = r8.zzn(r10, r14)     // Catch:{ all -> 0x0076 }
            if (r2 != 0) goto L_0x0009
            int r14 = r12.zzl
        L_0x0064:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x0073
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzA(r13, r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x0064
        L_0x0073:
            if (r10 == 0) goto L_0x05bf
            goto L_0x002b
        L_0x0076:
            r14 = move-exception
            goto L_0x05c3
        L_0x0079:
            int r4 = r12.zzD(r3)     // Catch:{ all -> 0x05c2 }
            int r5 = zzF(r4)     // Catch:{ zzaak -> 0x0599 }
            r6 = 1048575(0xfffff, float:1.469367E-39)
            switch(r5) {
                case 0: goto L_0x0569;
                case 1: goto L_0x055b;
                case 2: goto L_0x054d;
                case 3: goto L_0x053f;
                case 4: goto L_0x0531;
                case 5: goto L_0x0523;
                case 6: goto L_0x0514;
                case 7: goto L_0x0505;
                case 8: goto L_0x04fd;
                case 9: goto L_0x04cc;
                case 10: goto L_0x04bd;
                case 11: goto L_0x04ae;
                case 12: goto L_0x048c;
                case 13: goto L_0x047d;
                case 14: goto L_0x046e;
                case 15: goto L_0x045f;
                case 16: goto L_0x0450;
                case 17: goto L_0x041f;
                case 18: goto L_0x0411;
                case 19: goto L_0x0403;
                case 20: goto L_0x03f5;
                case 21: goto L_0x03e7;
                case 22: goto L_0x03d9;
                case 23: goto L_0x03cb;
                case 24: goto L_0x03bd;
                case 25: goto L_0x03af;
                case 26: goto L_0x0385;
                case 27: goto L_0x0373;
                case 28: goto L_0x0365;
                case 29: goto L_0x0357;
                case 30: goto L_0x0342;
                case 31: goto L_0x0334;
                case 32: goto L_0x0326;
                case 33: goto L_0x0318;
                case 34: goto L_0x030a;
                case 35: goto L_0x02fc;
                case 36: goto L_0x02ee;
                case 37: goto L_0x02e0;
                case 38: goto L_0x02d2;
                case 39: goto L_0x02c4;
                case 40: goto L_0x02b6;
                case 41: goto L_0x02a8;
                case 42: goto L_0x029a;
                case 43: goto L_0x028c;
                case 44: goto L_0x0277;
                case 45: goto L_0x0269;
                case 46: goto L_0x025b;
                case 47: goto L_0x024d;
                case 48: goto L_0x023f;
                case 49: goto L_0x022d;
                case 50: goto L_0x01f7;
                case 51: goto L_0x01e5;
                case 52: goto L_0x01d3;
                case 53: goto L_0x01c1;
                case 54: goto L_0x01af;
                case 55: goto L_0x019d;
                case 56: goto L_0x018b;
                case 57: goto L_0x0179;
                case 58: goto L_0x0167;
                case 59: goto L_0x015f;
                case 60: goto L_0x012e;
                case 61: goto L_0x0120;
                case 62: goto L_0x010e;
                case 63: goto L_0x00e9;
                case 64: goto L_0x00d7;
                case 65: goto L_0x00c5;
                case 66: goto L_0x00b3;
                case 67: goto L_0x00a1;
                case 68: goto L_0x008f;
                default: goto L_0x0087;
            }     // Catch:{ zzaak -> 0x0599 }
        L_0x0087:
            if (r10 != 0) goto L_0x0577
            java.lang.Object r10 = r8.zzg()     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0577
        L_0x008f:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabs r6 = r12.zzw(r3)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r6 = r14.zzp(r6, r15)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x00a1:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            long r6 = r14.zzw()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x00b3:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            int r6 = r14.zzv()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x00c5:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            long r6 = r14.zzu()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x00d7:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            int r6 = r14.zzt()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x00e9:
            int r5 = r14.zzs()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaah r7 = r12.zzy(r3)     // Catch:{ zzaak -> 0x0599 }
            if (r7 == 0) goto L_0x0100
            boolean r7 = r7.zza()     // Catch:{ zzaak -> 0x0599 }
            if (r7 == 0) goto L_0x00fa
            goto L_0x0100
        L_0x00fa:
            java.lang.Object r10 = com.google.android.gms.internal.p001firebaseauthapi.zzabu.zzH(r2, r5, r10, r8)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0100:
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r6, r4)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x010e:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            int r6 = r14.zzr()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0120:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzzb r6 = r14.zzq()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x012e:
            boolean r5 = r12.zzQ(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            if (r5 == 0) goto L_0x014a
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r6 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzn(r13, r4)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabs r7 = r12.zzw(r3)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r7 = r14.zzo(r7, r15)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r6 = com.google.android.gms.internal.p001firebaseauthapi.zzaaj.zzi(r6, r7)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x015a
        L_0x014a:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabs r6 = r12.zzw(r3)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r6 = r14.zzo(r6, r15)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
        L_0x015a:
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x015f:
            r12.zzC(r13, r4, r14)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0167:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            boolean r6 = r14.zzl()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0179:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            int r6 = r14.zzk()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x018b:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            long r6 = r14.zzj()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x019d:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            int r6 = r14.zzi()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x01af:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            long r6 = r14.zzg()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x01c1:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            long r6 = r14.zzh()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x01d3:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            float r6 = r14.zzf()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x01e5:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            double r6 = r14.zze()     // Catch:{ zzaak -> 0x0599 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzR(r13, r2, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x01f7:
            java.lang.Object r2 = r12.zzx(r3)     // Catch:{ zzaak -> 0x0599 }
            int r3 = r12.zzD(r3)     // Catch:{ zzaak -> 0x0599 }
            r3 = r3 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r5 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzn(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            if (r5 == 0) goto L_0x021d
            boolean r6 = com.google.android.gms.internal.p001firebaseauthapi.zzabb.zzb(r5)     // Catch:{ zzaak -> 0x0599 }
            if (r6 == 0) goto L_0x0228
            com.google.android.gms.internal.firebase-auth-api.zzaba r6 = com.google.android.gms.internal.p001firebaseauthapi.zzaba.zza()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaba r6 = r6.zzc()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzabb.zzc(r6, r5)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r3, r6)     // Catch:{ zzaak -> 0x0599 }
            r5 = r6
            goto L_0x0228
        L_0x021d:
            com.google.android.gms.internal.firebase-auth-api.zzaba r5 = com.google.android.gms.internal.p001firebaseauthapi.zzaba.zza()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaba r5 = r5.zzc()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r3, r5)     // Catch:{ zzaak -> 0x0599 }
        L_0x0228:
            com.google.android.gms.internal.firebase-auth-api.zzaba r5 = (com.google.android.gms.internal.p001firebaseauthapi.zzaba) r5     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaaz r2 = (com.google.android.gms.internal.p001firebaseauthapi.zzaaz) r2     // Catch:{ zzaak -> 0x0599 }
            throw r0     // Catch:{ zzaak -> 0x0599 }
        L_0x022d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabs r2 = r12.zzw(r3)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaau r3 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            java.util.List r3 = r3.zza(r13, r4)     // Catch:{ zzaak -> 0x0599 }
            r14.zzH(r3, r2, r15)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x023f:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzO(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x024d:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzN(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x025b:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzM(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0269:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzL(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0277:
            com.google.android.gms.internal.firebase-auth-api.zzaau r5 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            java.util.List r4 = r5.zza(r13, r6)     // Catch:{ zzaak -> 0x0599 }
            r14.zzK(r4)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaah r3 = r12.zzy(r3)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r10 = com.google.android.gms.internal.p001firebaseauthapi.zzabu.zzG(r2, r4, r3, r10, r8)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x028c:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzJ(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x029a:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzE(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x02a8:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzD(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x02b6:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzC(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x02c4:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzB(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x02d2:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzz(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x02e0:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzA(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x02ee:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzy(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x02fc:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzx(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x030a:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzO(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0318:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzN(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0326:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzM(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0334:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzL(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0342:
            com.google.android.gms.internal.firebase-auth-api.zzaau r5 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzaak -> 0x0599 }
            java.util.List r4 = r5.zza(r13, r6)     // Catch:{ zzaak -> 0x0599 }
            r14.zzK(r4)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaah r3 = r12.zzy(r3)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r10 = com.google.android.gms.internal.p001firebaseauthapi.zzabu.zzG(r2, r4, r3, r10, r8)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0357:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzJ(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0365:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzI(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0373:
            com.google.android.gms.internal.firebase-auth-api.zzabs r2 = r12.zzw(r3)     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaau r5 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            java.util.List r3 = r5.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzG(r3, r2, r15)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0385:
            boolean r2 = zzG(r4)     // Catch:{ zzaak -> 0x0599 }
            if (r2 == 0) goto L_0x039d
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r3 = r14
            com.google.android.gms.internal.firebase-auth-api.zzzf r3 = (com.google.android.gms.internal.p001firebaseauthapi.zzzf) r3     // Catch:{ zzaak -> 0x0599 }
            r4 = 1
            r3.zzF(r2, r4)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x039d:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r3 = r14
            com.google.android.gms.internal.firebase-auth-api.zzzf r3 = (com.google.android.gms.internal.p001firebaseauthapi.zzzf) r3     // Catch:{ zzaak -> 0x0599 }
            r4 = 0
            r3.zzF(r2, r4)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x03af:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzE(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x03bd:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzD(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x03cb:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzC(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x03d9:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzB(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x03e7:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzz(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x03f5:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzA(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0403:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzy(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0411:
            com.google.android.gms.internal.firebase-auth-api.zzaau r2 = r12.zzn     // Catch:{ zzaak -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaak -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            r14.zzx(r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x041f:
            boolean r2 = r12.zzO(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            if (r2 == 0) goto L_0x043d
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r2 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzn(r13, r4)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabs r3 = r12.zzw(r3)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r3 = r14.zzp(r3, r15)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaaj.zzi(r2, r3)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x043d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabs r2 = r12.zzw(r3)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r2 = r14.zzp(r2, r15)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0450:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            long r6 = r14.zzw()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzg(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x045f:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            int r2 = r14.zzv()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zze(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x046e:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            long r6 = r14.zzu()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzg(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x047d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            int r2 = r14.zzt()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zze(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x048c:
            int r5 = r14.zzs()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaah r7 = r12.zzy(r3)     // Catch:{ zzaak -> 0x0599 }
            if (r7 == 0) goto L_0x04a3
            boolean r7 = r7.zza()     // Catch:{ zzaak -> 0x0599 }
            if (r7 == 0) goto L_0x049d
            goto L_0x04a3
        L_0x049d:
            java.lang.Object r10 = com.google.android.gms.internal.p001firebaseauthapi.zzabu.zzH(r2, r5, r10, r8)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x04a3:
            r2 = r4 & r6
            long r6 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zze(r13, r6, r5)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x04ae:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            int r2 = r14.zzr()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zze(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x04bd:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzzb r2 = r14.zzq()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x04cc:
            boolean r2 = r12.zzO(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            if (r2 == 0) goto L_0x04ea
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r2 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzn(r13, r4)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabs r3 = r12.zzw(r3)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r3 = r14.zzo(r3, r15)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaaj.zzi(r2, r3)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x04ea:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabs r2 = r12.zzw(r3)     // Catch:{ zzaak -> 0x0599 }
            java.lang.Object r2 = r14.zzo(r2, r15)     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzo(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x04fd:
            r12.zzC(r13, r4, r14)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0505:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            boolean r2 = r14.zzl()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzi(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0514:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            int r2 = r14.zzk()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zze(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0523:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            long r6 = r14.zzj()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzg(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0531:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            int r2 = r14.zzi()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zze(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x053f:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            long r6 = r14.zzg()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzg(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x054d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            long r6 = r14.zzh()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzg(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x055b:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            float r2 = r14.zzf()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzk(r13, r4, r2)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0569:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaak -> 0x0599 }
            double r6 = r14.zze()     // Catch:{ zzaak -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzm(r13, r4, r6)     // Catch:{ zzaak -> 0x0599 }
            r12.zzP(r13, r3)     // Catch:{ zzaak -> 0x0599 }
            goto L_0x0593
        L_0x0577:
            boolean r2 = r8.zzn(r10, r14)     // Catch:{ zzaak -> 0x0597, all -> 0x0595 }
            if (r2 != 0) goto L_0x0592
            int r14 = r12.zzl
        L_0x057f:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x058e
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzA(r13, r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x057f
        L_0x058e:
            if (r10 == 0) goto L_0x05bf
            goto L_0x002b
        L_0x0592:
        L_0x0593:
            goto L_0x0009
        L_0x0595:
            r14 = move-exception
            goto L_0x05c3
        L_0x0597:
            r2 = move-exception
            goto L_0x059a
        L_0x0599:
            r2 = move-exception
        L_0x059a:
            r8.zza(r14)     // Catch:{ all -> 0x05c0 }
            if (r10 != 0) goto L_0x05a4
            java.lang.Object r2 = r8.zzk(r13)     // Catch:{ all -> 0x05c0 }
            r10 = r2
        L_0x05a4:
            boolean r2 = r8.zzn(r10, r14)     // Catch:{ all -> 0x05c0 }
            if (r2 != 0) goto L_0x0009
            int r14 = r12.zzl
        L_0x05ac:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x05bb
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzA(r13, r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x05ac
        L_0x05bb:
            if (r10 == 0) goto L_0x05bf
            goto L_0x002b
        L_0x05bf:
            return
        L_0x05c0:
            r14 = move-exception
            goto L_0x05c3
        L_0x05c2:
            r14 = move-exception
        L_0x05c3:
            int r15 = r12.zzl
        L_0x05c5:
            int r0 = r12.zzm
            if (r15 >= r0) goto L_0x05d4
            int[] r0 = r12.zzk
            r0 = r0[r15]
            java.lang.Object r10 = r12.zzA(r13, r0, r10, r8)
            int r15 = r15 + 1
            goto L_0x05c5
        L_0x05d4:
            if (r10 == 0) goto L_0x05d9
            r8.zzl(r13, r10)
        L_0x05d9:
            throw r14
        L_0x05da:
            goto L_0x05dc
        L_0x05db:
            throw r0
        L_0x05dc:
            goto L_0x05db
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzabj.zzf(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzabr, com.google.android.gms.internal.firebase-auth-api.zzzq):void");
    }

    /* access modifiers changed from: package-private */
    public final int zzh(T t, byte[] bArr, int i, int i2, int i3, zzym zzym) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        zzabj zzabj;
        Object obj;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        T t3;
        int i13;
        zzym zzym2;
        int zzn2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z;
        zzabj zzabj2 = this;
        T t4 = t;
        byte[] bArr2 = bArr;
        int i23 = i2;
        int i24 = i3;
        zzym zzym3 = zzym;
        Unsafe unsafe2 = zzb;
        int i25 = i;
        int i26 = 0;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        int i30 = 1048575;
        while (true) {
            if (i25 < i23) {
                int i31 = i25 + 1;
                byte b = bArr2[i25];
                if (b < 0) {
                    i6 = zzyn.zzb(b, bArr2, i31, zzym3);
                    i5 = zzym3.zza;
                } else {
                    int i32 = i31;
                    i5 = b;
                    i6 = i32;
                }
                int i33 = i5 >>> 3;
                int i34 = i5 & 7;
                if (i33 > i27) {
                    i7 = zzabj2.zzT(i33, i28 / 3);
                } else {
                    i7 = zzabj2.zzS(i33);
                }
                if (i7 == -1) {
                    i12 = i6;
                    i8 = i5;
                    i11 = i29;
                    i10 = i33;
                    unsafe = unsafe2;
                    i9 = 0;
                } else {
                    int i35 = zzabj2.zzc[i7 + 1];
                    int zzF = zzF(i35);
                    int i36 = i5;
                    int i37 = i6;
                    long j = (long) (i35 & 1048575);
                    if (zzF <= 17) {
                        int i38 = zzabj2.zzc[i7 + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & 1048575;
                        if (i40 != i30) {
                            if (i30 != 1048575) {
                                i18 = i7;
                                unsafe2.putInt(t4, (long) i30, i29);
                            } else {
                                i18 = i7;
                            }
                            i17 = i40;
                            i19 = unsafe2.getInt(t4, (long) i40);
                        } else {
                            i18 = i7;
                            i17 = i30;
                            i19 = i29;
                        }
                        switch (zzF) {
                            case 0:
                                i21 = i36;
                                i12 = i37;
                                long j2 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 == 1) {
                                    zzacr.zzm(t4, j2, Double.longBitsToDouble(zzyn.zze(bArr2, i12)));
                                    i25 = i12 + 8;
                                    i29 = i19 | i39;
                                    i28 = i22;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                                break;
                            case 1:
                                i21 = i36;
                                i12 = i37;
                                long j3 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 == 5) {
                                    zzacr.zzk(t4, j3, Float.intBitsToFloat(zzyn.zzd(bArr2, i12)));
                                    i25 = i12 + 4;
                                    i29 = i19 | i39;
                                    i28 = i22;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                                break;
                            case 2:
                            case 3:
                                i21 = i36;
                                i12 = i37;
                                long j4 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 == 0) {
                                    int zzc2 = zzyn.zzc(bArr2, i12, zzym3);
                                    unsafe2.putLong(t, j4, zzym3.zzb);
                                    i29 = i19 | i39;
                                    i28 = i22;
                                    i25 = zzc2;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                                break;
                            case 4:
                            case 11:
                                i21 = i36;
                                i12 = i37;
                                long j5 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 == 0) {
                                    i25 = zzyn.zza(bArr2, i12, zzym3);
                                    unsafe2.putInt(t4, j5, zzym3.zza);
                                    i29 = i19 | i39;
                                    i28 = i22;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                                break;
                            case 5:
                            case 14:
                                i21 = i36;
                                int i41 = i37;
                                long j6 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 != 1) {
                                    i12 = i41;
                                    break;
                                } else {
                                    unsafe2.putLong(t, j6, zzyn.zze(bArr2, i41));
                                    i25 = i41 + 8;
                                    i29 = i19 | i39;
                                    i28 = i22;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                            case 6:
                            case 13:
                                i21 = i36;
                                int i42 = i37;
                                long j7 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 != 5) {
                                    i12 = i42;
                                    break;
                                } else {
                                    unsafe2.putInt(t4, j7, zzyn.zzd(bArr2, i42));
                                    i25 = i42 + 4;
                                    i29 = i19 | i39;
                                    i28 = i22;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                            case 7:
                                i21 = i36;
                                int i43 = i37;
                                long j8 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 != 0) {
                                    i12 = i43;
                                    break;
                                } else {
                                    i25 = zzyn.zzc(bArr2, i43, zzym3);
                                    if (zzym3.zzb != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    zzacr.zzi(t4, j8, z);
                                    i29 = i19 | i39;
                                    i28 = i22;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                            case 8:
                                i21 = i36;
                                int i44 = i37;
                                long j9 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 != 2) {
                                    i12 = i44;
                                    break;
                                } else {
                                    if ((536870912 & i35) == 0) {
                                        i25 = zzyn.zzf(bArr2, i44, zzym3);
                                    } else {
                                        i25 = zzyn.zzg(bArr2, i44, zzym3);
                                    }
                                    unsafe2.putObject(t4, j9, zzym3.zzc);
                                    i29 = i19 | i39;
                                    i28 = i22;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                            case 9:
                                i21 = i36;
                                int i45 = i37;
                                long j10 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 != 2) {
                                    i12 = i45;
                                    break;
                                } else {
                                    i25 = zzyn.zzi(zzabj2.zzw(i22), bArr2, i45, i23, zzym3);
                                    if ((i19 & i39) == 0) {
                                        unsafe2.putObject(t4, j10, zzym3.zzc);
                                    } else {
                                        unsafe2.putObject(t4, j10, zzaaj.zzi(unsafe2.getObject(t4, j10), zzym3.zzc));
                                    }
                                    i29 = i19 | i39;
                                    i28 = i22;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                            case 10:
                                i21 = i36;
                                int i46 = i37;
                                long j11 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 != 2) {
                                    i12 = i46;
                                    break;
                                } else {
                                    i25 = zzyn.zzh(bArr2, i46, zzym3);
                                    unsafe2.putObject(t4, j11, zzym3.zzc);
                                    i29 = i19 | i39;
                                    i28 = i22;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                            case 12:
                                i21 = i36;
                                int i47 = i37;
                                long j12 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 != 0) {
                                    i12 = i47;
                                    break;
                                } else {
                                    i25 = zzyn.zza(bArr2, i47, zzym3);
                                    int i48 = zzym3.zza;
                                    zzaah zzy = zzabj2.zzy(i22);
                                    if (zzy == null || zzy.zza()) {
                                        unsafe2.putInt(t4, j12, i48);
                                        i29 = i19 | i39;
                                        i28 = i22;
                                        i26 = i21;
                                        i27 = i20;
                                        i30 = i17;
                                        i24 = i3;
                                        break;
                                    } else {
                                        zzg(t).zzh(i21, Long.valueOf((long) i48));
                                        i29 = i19;
                                        i28 = i22;
                                        i26 = i21;
                                        i27 = i20;
                                        i30 = i17;
                                        i24 = i3;
                                        continue;
                                    }
                                }
                                break;
                            case 15:
                                i21 = i36;
                                int i49 = i37;
                                long j13 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 != 0) {
                                    i12 = i49;
                                    break;
                                } else {
                                    i25 = zzyn.zza(bArr2, i49, zzym3);
                                    unsafe2.putInt(t4, j13, zzze.zzt(zzym3.zza));
                                    i29 = i19 | i39;
                                    i28 = i22;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                            case 16:
                                if (i34 != 0) {
                                    i21 = i36;
                                    i20 = i33;
                                    i22 = i18;
                                    i12 = i37;
                                    break;
                                } else {
                                    int zzc3 = zzyn.zzc(bArr2, i37, zzym3);
                                    Unsafe unsafe3 = unsafe2;
                                    int i50 = i36;
                                    T t5 = t;
                                    unsafe3.putLong(t5, j, zzze.zzu(zzym3.zzb));
                                    i29 = i19 | i39;
                                    i28 = i18;
                                    i25 = zzc3;
                                    i26 = i50;
                                    i27 = i33;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                            default:
                                i21 = i36;
                                i12 = i37;
                                long j14 = j;
                                i20 = i33;
                                i22 = i18;
                                if (i34 == 3) {
                                    long j15 = j14;
                                    i25 = zzyn.zzj(zzabj2.zzw(i22), bArr, i12, i2, (i20 << 3) | 4, zzym);
                                    if ((i19 & i39) == 0) {
                                        unsafe2.putObject(t4, j15, zzym3.zzc);
                                    } else {
                                        unsafe2.putObject(t4, j15, zzaaj.zzi(unsafe2.getObject(t4, j15), zzym3.zzc));
                                    }
                                    i29 = i19 | i39;
                                    bArr2 = bArr;
                                    i23 = i2;
                                    i28 = i22;
                                    i26 = i21;
                                    i27 = i20;
                                    i30 = i17;
                                    i24 = i3;
                                    continue;
                                }
                                break;
                        }
                        i11 = i19;
                        unsafe = unsafe2;
                        i8 = i21;
                        i10 = i20;
                        i30 = i17;
                        i9 = i22;
                    } else {
                        int i51 = i36;
                        long j16 = j;
                        int i52 = i33;
                        int i53 = i7;
                        int i54 = i37;
                        if (zzF != 27) {
                            i11 = i29;
                            i14 = i30;
                            int i55 = i54;
                            if (zzF <= 49) {
                                int i56 = i55;
                                int i57 = i52;
                                i10 = i52;
                                i9 = i53;
                                unsafe = unsafe2;
                                i8 = i51;
                                i25 = zzt(t, bArr, i55, i2, i51, i57, i34, i9, (long) i35, zzF, j16, zzym);
                                if (i25 != i56) {
                                    zzabj2 = this;
                                    t4 = t;
                                    bArr2 = bArr;
                                    i23 = i2;
                                    i24 = i3;
                                    zzym3 = zzym;
                                    i29 = i11;
                                    i27 = i10;
                                    i28 = i9;
                                    i26 = i8;
                                    i30 = i14;
                                    unsafe2 = unsafe;
                                } else {
                                    i12 = i25;
                                    i30 = i14;
                                }
                            } else {
                                i15 = i55;
                                unsafe = unsafe2;
                                i8 = i51;
                                i10 = i52;
                                i9 = i53;
                                int i58 = zzF;
                                if (i58 != 50) {
                                    i25 = zzv(t, bArr, i15, i2, i8, i10, i34, i35, i58, j16, i9, zzym);
                                    if (i25 != i15) {
                                        zzabj2 = this;
                                        t4 = t;
                                        bArr2 = bArr;
                                        i23 = i2;
                                        i24 = i3;
                                        zzym3 = zzym;
                                        i29 = i11;
                                        i27 = i10;
                                        i28 = i9;
                                        i26 = i8;
                                        i30 = i14;
                                        unsafe2 = unsafe;
                                    } else {
                                        i12 = i25;
                                        i30 = i14;
                                    }
                                } else if (i34 == 2) {
                                    i25 = zzu(t, bArr, i15, i2, i9, j16, zzym);
                                    if (i25 != i15) {
                                        zzabj2 = this;
                                        t4 = t;
                                        bArr2 = bArr;
                                        i23 = i2;
                                        i24 = i3;
                                        zzym3 = zzym;
                                        i29 = i11;
                                        i27 = i10;
                                        i28 = i9;
                                        i26 = i8;
                                        i30 = i14;
                                        unsafe2 = unsafe;
                                    } else {
                                        i12 = i25;
                                        i30 = i14;
                                    }
                                }
                            }
                        } else if (i34 == 2) {
                            zzaai zzaai = (zzaai) unsafe2.getObject(t4, j16);
                            if (!zzaai.zza()) {
                                int size = zzaai.size();
                                if (size == 0) {
                                    i16 = 10;
                                } else {
                                    i16 = size + size;
                                }
                                zzaai = zzaai.zze(i16);
                                unsafe2.putObject(t4, j16, zzaai);
                            }
                            i26 = i51;
                            int i59 = i54;
                            i25 = zzyn.zzm(zzabj2.zzw(i53), i26, bArr, i59, i2, zzaai, zzym);
                            bArr2 = bArr;
                            i23 = i2;
                            i28 = i53;
                            i29 = i29;
                            i27 = i52;
                            i30 = i30;
                            i24 = i3;
                        } else {
                            i11 = i29;
                            i14 = i30;
                            i15 = i54;
                            unsafe = unsafe2;
                            i8 = i51;
                            i10 = i52;
                            i9 = i53;
                        }
                        i12 = i15;
                        i30 = i14;
                    }
                }
                i4 = i3;
                int i60 = i8;
                if (i60 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzym2 = zzym;
                        if (zzym2.zzd != zzzq.zza()) {
                            i13 = i10;
                            if (zzym2.zzd.zzb(this.zzg, i13) == null) {
                                zzn2 = zzyn.zzn(i60, bArr, i12, i2, zzg(t), zzym);
                                t3 = t;
                                i23 = i2;
                                i26 = i60;
                                zzabj2 = this;
                                zzym3 = zzym2;
                                i27 = i13;
                                t4 = t3;
                                i29 = i11;
                                i28 = i9;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i24 = i4;
                            } else {
                                zzaaa zzaaa = (zzaaa) t;
                                throw null;
                            }
                        } else {
                            t3 = t;
                            i13 = i10;
                        }
                    } else {
                        t3 = t;
                        zzym2 = zzym;
                        i13 = i10;
                    }
                    zzn2 = zzyn.zzn(i60, bArr, i12, i2, zzg(t), zzym);
                    i23 = i2;
                    i26 = i60;
                    zzabj2 = this;
                    zzym3 = zzym2;
                    i27 = i13;
                    t4 = t3;
                    i29 = i11;
                    i28 = i9;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i24 = i4;
                } else {
                    zzabj = this;
                    t2 = t;
                    i25 = i12;
                    i26 = i60;
                    i29 = i11;
                    obj = null;
                }
            } else {
                int i61 = i29;
                int i62 = i30;
                unsafe = unsafe2;
                i4 = i24;
                t2 = t4;
                zzabj = zzabj2;
                obj = null;
            }
        }
        if (i30 != 1048575) {
            unsafe.putInt(t2, (long) i30, i29);
        }
        for (int i63 = zzabj.zzl; i63 < zzabj.zzm; i63++) {
            zzabj.zzA(t2, zzabj.zzk[i63], obj, zzabj.zzo);
        }
        if (i4 == 0) {
            if (i25 != i2) {
                throw zzaal.zzh();
            }
        } else if (i25 > i2 || i26 != i4) {
            throw zzaal.zzh();
        }
        return i25;
    }

    public final void zzi(T t, byte[] bArr, int i, int i2, zzym zzym) throws IOException {
        if (this.zzj) {
            zzz(t, bArr, i, i2, zzym);
        } else {
            zzh(t, bArr, i, i2, 0, zzym);
        }
    }

    public final void zzj(T t) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long zzD = (long) (zzD(this.zzk[i2]) & 1048575);
            Object zzn2 = zzacr.zzn(t, zzD);
            if (zzn2 != null) {
                ((zzaba) zzn2).zzd();
                zzacr.zzo(t, zzD, zzn2);
            }
            i2++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(t, (long) this.zzk[i]);
            i++;
        }
        this.zzo.zzm(t);
        if (this.zzh) {
            this.zzp.zzd(t);
        }
    }

    public final boolean zzk(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzD = zzD(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 == i3) {
                i2 = i3;
                i = i4;
            } else if (i9 != 1048575) {
                i = zzb.getInt(t2, (long) i9);
                i2 = i9;
            } else {
                i = i4;
                i2 = i9;
            }
            if ((268435456 & zzD) != 0 && !zzN(t, i6, i2, i, i10)) {
                return false;
            }
            int zzF = zzF(zzD);
            if (zzF != 9 && zzF != 17) {
                if (zzF != 27) {
                    if (zzF == 60 || zzF == 68) {
                        if (zzQ(t2, i7, i6) && !zzB(t2, zzD, zzw(i6))) {
                            return false;
                        }
                    } else if (zzF != 49) {
                        if (zzF == 50 && !((zzaba) zzacr.zzn(t2, (long) (zzD & 1048575))).isEmpty()) {
                            zzaaz zzaaz = (zzaaz) zzx(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzacr.zzn(t2, (long) (zzD & 1048575));
                if (!list.isEmpty()) {
                    zzabs zzw = zzw(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzw.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzN(t, i6, i2, i, i10) && !zzB(t2, zzD, zzw(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zzb(t2);
        throw null;
    }

    public final void zzn(T t, zzzm zzzm) throws IOException {
        if (!this.zzj) {
            zzV(t, zzzm);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzD = zzD(i);
                int i2 = this.zzc[i];
                switch (zzF(zzD)) {
                    case 0:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzf(i2, zzacr.zzl(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 1:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zze(i2, zzacr.zzj(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 2:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzc(i2, zzacr.zzf(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 3:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzh(i2, zzacr.zzf(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 4:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzi(i2, zzacr.zzd(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 5:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzj(i2, zzacr.zzf(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 6:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzk(i2, zzacr.zzd(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 7:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzl(i2, zzacr.zzh(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 8:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzX(i2, zzacr.zzn(t, (long) (zzD & 1048575)), zzzm);
                            break;
                        }
                    case 9:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzr(i2, zzacr.zzn(t, (long) (zzD & 1048575)), zzw(i));
                            break;
                        }
                    case 10:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzn(i2, (zzzb) zzacr.zzn(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 11:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzo(i2, zzacr.zzd(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 12:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzg(i2, zzacr.zzd(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 13:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzb(i2, zzacr.zzd(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 14:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzd(i2, zzacr.zzf(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 15:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzp(i2, zzacr.zzd(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 16:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzq(i2, zzacr.zzf(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 17:
                        if (!zzO(t, i)) {
                            break;
                        } else {
                            zzzm.zzs(i2, zzacr.zzn(t, (long) (zzD & 1048575)), zzw(i));
                            break;
                        }
                    case 18:
                        zzabu.zzJ(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 19:
                        zzabu.zzK(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 20:
                        zzabu.zzL(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 21:
                        zzabu.zzM(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 22:
                        zzabu.zzQ(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 23:
                        zzabu.zzO(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 24:
                        zzabu.zzT(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 25:
                        zzabu.zzW(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 26:
                        zzabu.zzX(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm);
                        break;
                    case 27:
                        zzabu.zzZ(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, zzw(i));
                        break;
                    case 28:
                        zzabu.zzY(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm);
                        break;
                    case 29:
                        zzabu.zzR(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 30:
                        zzabu.zzV(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 31:
                        zzabu.zzU(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 32:
                        zzabu.zzP(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 33:
                        zzabu.zzS(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 34:
                        zzabu.zzN(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, false);
                        break;
                    case 35:
                        zzabu.zzJ(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 36:
                        zzabu.zzK(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 37:
                        zzabu.zzL(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 38:
                        zzabu.zzM(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 39:
                        zzabu.zzQ(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 40:
                        zzabu.zzO(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 41:
                        zzabu.zzT(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 42:
                        zzabu.zzW(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 43:
                        zzabu.zzR(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 44:
                        zzabu.zzV(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 45:
                        zzabu.zzU(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 46:
                        zzabu.zzP(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 47:
                        zzabu.zzS(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 48:
                        zzabu.zzN(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, true);
                        break;
                    case 49:
                        zzabu.zzaa(this.zzc[i], (List) zzacr.zzn(t, (long) (zzD & 1048575)), zzzm, zzw(i));
                        break;
                    case 50:
                        zzW(zzzm, i2, zzacr.zzn(t, (long) (zzD & 1048575)), i);
                        break;
                    case 51:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzf(i2, zzH(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 52:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zze(i2, zzI(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 53:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzc(i2, zzK(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 54:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzh(i2, zzK(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 55:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzi(i2, zzJ(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 56:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzj(i2, zzK(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 57:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzk(i2, zzJ(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 58:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzl(i2, zzL(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 59:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzX(i2, zzacr.zzn(t, (long) (zzD & 1048575)), zzzm);
                            break;
                        }
                    case 60:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzr(i2, zzacr.zzn(t, (long) (zzD & 1048575)), zzw(i));
                            break;
                        }
                    case 61:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzn(i2, (zzzb) zzacr.zzn(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 62:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzo(i2, zzJ(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 63:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzg(i2, zzJ(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 64:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzb(i2, zzJ(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 65:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzd(i2, zzK(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 66:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzp(i2, zzJ(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 67:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzq(i2, zzK(t, (long) (zzD & 1048575)));
                            break;
                        }
                    case 68:
                        if (!zzQ(t, i2, i)) {
                            break;
                        } else {
                            zzzm.zzs(i2, zzacr.zzn(t, (long) (zzD & 1048575)), zzw(i));
                            break;
                        }
                }
            }
            zzacg<?, ?> zzacg = this.zzo;
            zzacg.zzr(zzacg.zzj(t), zzzm);
        } else {
            this.zzp.zzb(t);
            throw null;
        }
    }

    private final <K, V> void zzW(zzzm zzzm, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzaaz zzaaz = (zzaaz) zzx(i2);
            throw null;
        }
    }
}
