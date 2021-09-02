package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzacw extends zzact {
    zzacw() {
    }

    private static int zze(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return zzacx.zzj(i);
        }
        if (i2 == 1) {
            return zzacx.zzk(i, zzacr.zzp(bArr, j));
        }
        if (i2 == 2) {
            return zzacx.zzl(i, zzacr.zzp(bArr, j), zzacr.zzp(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0090, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(int r16, byte[] r17, int r18, int r19) {
        /*
            r15 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.length
            r4 = r1 | r2
            int r5 = r3 - r2
            r4 = r4 | r5
            r5 = 2
            r6 = 3
            r7 = 0
            if (r4 < 0) goto L_0x00c2
            long r3 = (long) r1
            long r1 = (long) r2
            long r1 = r1 - r3
            int r2 = (int) r1
            r1 = 16
            r8 = 1
            if (r2 >= r1) goto L_0x001d
            r1 = 0
            goto L_0x002e
        L_0x001d:
            r10 = r3
            r1 = 0
        L_0x001f:
            if (r1 >= r2) goto L_0x002d
            long r12 = r10 + r8
            byte r10 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzp(r0, r10)
            if (r10 < 0) goto L_0x002e
            int r1 = r1 + 1
            r10 = r12
            goto L_0x001f
        L_0x002d:
            r1 = r2
        L_0x002e:
            int r2 = r2 - r1
            long r10 = (long) r1
            long r3 = r3 + r10
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r2 <= 0) goto L_0x0042
            long r10 = r3 + r8
            byte r1 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzp(r0, r3)
            if (r1 < 0) goto L_0x0040
            int r2 = r2 + -1
            r3 = r10
            goto L_0x0032
        L_0x0040:
            r3 = r10
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            r10 = -1
            if (r2 != 0) goto L_0x0048
            goto L_0x00c1
        L_0x0048:
            int r2 = r2 + -1
            r11 = -32
            r12 = -65
            if (r1 >= r11) goto L_0x0067
            if (r2 == 0) goto L_0x0065
            int r2 = r2 + -1
            r11 = -62
            if (r1 < r11) goto L_0x0063
            long r13 = r3 + r8
            byte r1 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzp(r0, r3)
            if (r1 <= r12) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r3 = r13
            goto L_0x00be
        L_0x0063:
            r7 = -1
            goto L_0x00c1
        L_0x0065:
            r7 = r1
            goto L_0x00c1
        L_0x0067:
            r13 = -16
            if (r1 >= r13) goto L_0x0092
            if (r2 >= r5) goto L_0x0072
            int r7 = zze(r0, r1, r3, r2)
            goto L_0x00c1
        L_0x0072:
            int r2 = r2 + -2
            long r13 = r3 + r8
            byte r3 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzp(r0, r3)
            if (r3 > r12) goto L_0x0090
            r4 = -96
            if (r1 != r11) goto L_0x0082
            if (r3 < r4) goto L_0x0090
        L_0x0082:
            r11 = -19
            if (r1 != r11) goto L_0x0088
            if (r3 >= r4) goto L_0x0090
        L_0x0088:
            long r3 = r13 + r8
            byte r1 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzp(r0, r13)
            if (r1 <= r12) goto L_0x00be
        L_0x0090:
            r7 = -1
            goto L_0x00c1
        L_0x0092:
            if (r2 >= r6) goto L_0x0099
            int r7 = zze(r0, r1, r3, r2)
            goto L_0x00c1
        L_0x0099:
            int r2 = r2 + -3
            long r13 = r3 + r8
            byte r3 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzp(r0, r3)
            if (r3 > r12) goto L_0x00c0
            int r1 = r1 << 28
            int r3 = r3 + 112
            int r1 = r1 + r3
            int r1 = r1 >> 30
            if (r1 != 0) goto L_0x00c0
            long r3 = r13 + r8
            byte r1 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzp(r0, r13)
            if (r1 > r12) goto L_0x00c0
            long r13 = r3 + r8
            byte r1 = com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzp(r0, r3)
            if (r1 <= r12) goto L_0x00bd
            goto L_0x00c0
        L_0x00bd:
            r3 = r13
        L_0x00be:
            goto L_0x0031
        L_0x00c0:
            r7 = -1
        L_0x00c1:
            return r7
        L_0x00c2:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r7] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r3 = 1
            r4[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r4[r5] = r1
            java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r0.<init>(r1)
            goto L_0x00e4
        L_0x00e3:
            throw r0
        L_0x00e4:
            goto L_0x00e3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzacw.zzb(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    public final String zzc(byte[] bArr, int i, int i2) throws zzaal {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r12 < i4) {
                byte zzp = zzacr.zzp(bArr, (long) r12);
                if (!zzacs.zza(zzp)) {
                    break;
                }
                i = r12 + 1;
                cArr[i3] = (char) zzp;
                i5 = i3 + 1;
            }
            while (r12 < i4) {
                int i6 = r12 + 1;
                byte zzp2 = zzacr.zzp(bArr, (long) r12);
                if (zzacs.zza(zzp2)) {
                    cArr[i3] = (char) zzp2;
                    r12 = i6;
                    i3++;
                    while (r12 < i4) {
                        byte zzp3 = zzacr.zzp(bArr, (long) r12);
                        if (!zzacs.zza(zzp3)) {
                            break;
                        }
                        r12++;
                        cArr[i3] = (char) zzp3;
                        i3++;
                    }
                } else if (zzacs.zzb(zzp2)) {
                    if (i6 < i4) {
                        zzacs.zzc(zzp2, zzacr.zzp(bArr, (long) i6), cArr, i3);
                        r12 = i6 + 1;
                        i3++;
                    } else {
                        throw zzaal.zzi();
                    }
                } else if (zzacs.zzd(zzp2)) {
                    if (i6 < i4 - 1) {
                        int i7 = i6 + 1;
                        zzacs.zze(zzp2, zzacr.zzp(bArr, (long) i6), zzacr.zzp(bArr, (long) i7), cArr, i3);
                        r12 = i7 + 1;
                        i3++;
                    } else {
                        throw zzaal.zzi();
                    }
                } else if (i6 < i4 - 2) {
                    int i8 = i6 + 1;
                    int i9 = i8 + 1;
                    zzacs.zzf(zzp2, zzacr.zzp(bArr, (long) i6), zzacr.zzp(bArr, (long) i8), zzacr.zzp(bArr, (long) i9), cArr, i3);
                    i3 += 2;
                    r12 = i9 + 1;
                } else {
                    throw zzaal.zzi();
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031 A[LOOP:1: B:11:0x0031->B:35:0x00f8, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:35:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:35:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v4 long) = (r4v2 long), (r4v6 long) binds: [B:10:0x002f, B:35:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:35:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzd(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            long r4 = (long) r2
            long r6 = (long) r3
            long r6 = r6 + r4
            int r8 = r23.length()
            java.lang.String r9 = " at index "
            java.lang.String r10 = "Failed writing "
            if (r8 > r3) goto L_0x0145
            int r11 = r1.length
            int r11 = r11 - r3
            if (r11 < r2) goto L_0x0145
            r2 = 0
        L_0x001a:
            r3 = 128(0x80, float:1.794E-43)
            r11 = 1
            if (r2 >= r8) goto L_0x002f
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x002f
            long r11 = r11 + r4
            byte r3 = (byte) r13
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzq(r1, r4, r3)
            int r2 = r2 + 1
            r4 = r11
            goto L_0x001a
        L_0x002f:
            if (r2 == r8) goto L_0x0143
        L_0x0031:
            if (r2 >= r8) goto L_0x0143
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x0049
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x0049
            long r14 = r4 + r11
            byte r13 = (byte) r13
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzq(r1, r4, r13)
            r4 = r11
            r12 = r14
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00f8
        L_0x0049:
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 >= r14) goto L_0x0072
            r14 = -2
            long r14 = r14 + r6
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x0072
            long r14 = r4 + r11
            int r3 = r13 >>> 6
            r3 = r3 | 960(0x3c0, float:1.345E-42)
            byte r3 = (byte) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzq(r1, r4, r3)
            long r3 = r14 + r11
            r5 = r13 & 63
            r13 = 128(0x80, float:1.794E-43)
            r5 = r5 | r13
            byte r5 = (byte) r5
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzq(r1, r14, r5)
            r20 = r11
            r11 = 128(0x80, float:1.794E-43)
            r12 = r3
            r4 = r20
            goto L_0x00f8
        L_0x0072:
            r3 = 57343(0xdfff, float:8.0355E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r14) goto L_0x007c
            if (r13 <= r3) goto L_0x00ac
        L_0x007c:
            r15 = -3
            long r15 = r15 + r6
            int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r17 > 0) goto L_0x00ac
            long r14 = r4 + r11
            int r3 = r13 >>> 12
            r3 = r3 | 480(0x1e0, float:6.73E-43)
            byte r3 = (byte) r3
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzq(r1, r4, r3)
            long r3 = r14 + r11
            int r5 = r13 >>> 6
            r5 = r5 & 63
            r11 = 128(0x80, float:1.794E-43)
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzq(r1, r14, r5)
            r14 = 1
            long r18 = r3 + r14
            r5 = r13 & 63
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzq(r1, r3, r5)
            r12 = r18
            r4 = 1
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00f8
        L_0x00ac:
            r11 = -4
            long r11 = r11 + r6
            int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x010e
            int r3 = r2 + 1
            if (r3 == r8) goto L_0x0105
            char r2 = r0.charAt(r3)
            boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
            if (r11 == 0) goto L_0x0103
            int r2 = java.lang.Character.toCodePoint(r13, r2)
            r11 = 1
            long r13 = r4 + r11
            int r15 = r2 >>> 18
            r15 = r15 | 240(0xf0, float:3.36E-43)
            byte r15 = (byte) r15
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzq(r1, r4, r15)
            long r4 = r13 + r11
            int r15 = r2 >>> 12
            r15 = r15 & 63
            r11 = 128(0x80, float:1.794E-43)
            r12 = r15 | 128(0x80, float:1.794E-43)
            byte r12 = (byte) r12
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzq(r1, r13, r12)
            r12 = 1
            long r14 = r4 + r12
            int r16 = r2 >>> 6
            r12 = r16 & 63
            r12 = r12 | r11
            byte r12 = (byte) r12
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzq(r1, r4, r12)
            r4 = 1
            long r12 = r14 + r4
            r2 = r2 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            com.google.android.gms.internal.p001firebaseauthapi.zzacr.zzq(r1, r14, r2)
            r2 = r3
        L_0x00f8:
            int r2 = r2 + 1
            r3 = 128(0x80, float:1.794E-43)
            r20 = r4
            r4 = r12
            r11 = r20
            goto L_0x0031
        L_0x0103:
            r2 = r3
            goto L_0x0106
        L_0x0105:
        L_0x0106:
            com.google.android.gms.internal.firebase-auth-api.zzacv r0 = new com.google.android.gms.internal.firebase-auth-api.zzacv
            int r2 = r2 + -1
            r0.<init>(r2, r8)
            throw r0
        L_0x010e:
            if (r13 < r14) goto L_0x0126
            if (r13 > r3) goto L_0x0126
            int r1 = r2 + 1
            if (r1 == r8) goto L_0x0120
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0126
        L_0x0120:
            com.google.android.gms.internal.firebase-auth-api.zzacv r0 = new com.google.android.gms.internal.firebase-auth-api.zzacv
            r0.<init>(r2, r8)
            throw r0
        L_0x0126:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 46
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r13)
            r1.append(r9)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0143:
            int r0 = (int) r4
            return r0
        L_0x0145:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            int r8 = r8 + -1
            char r0 = r0.charAt(r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 37
            r4.<init>(r5)
            r4.append(r10)
            r4.append(r0)
            r4.append(r9)
            int r0 = r2 + r3
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            goto L_0x016b
        L_0x016a:
            throw r1
        L_0x016b:
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzacw.zzd(java.lang.CharSequence, byte[], int, int):int");
    }
}
