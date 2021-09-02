package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzlb implements zzei {
    private final ThreadLocal<Mac> zza = new zzla(this);
    /* access modifiers changed from: private */
    public final String zzb;
    /* access modifiers changed from: private */
    public final Key zzc;
    private final int zzd;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzlb(java.lang.String r4, java.security.Key r5) throws java.security.GeneralSecurityException {
        /*
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.firebase-auth-api.zzla r0 = new com.google.android.gms.internal.firebase-auth-api.zzla
            r0.<init>(r3)
            r3.zza = r0
            r3.zzb = r4
            r3.zzc = r5
            byte[] r5 = r5.getEncoded()
            int r5 = r5.length
            r0 = 16
            if (r5 < r0) goto L_0x0080
            int r5 = r4.hashCode()
            r0 = 3
            r1 = 2
            r2 = 1
            switch(r5) {
                case -1823053428: goto L_0x0040;
                case 392315118: goto L_0x0036;
                case 392316170: goto L_0x002c;
                case 392317873: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x004a
        L_0x0022:
            java.lang.String r5 = "HMACSHA512"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x004a
            r5 = 3
            goto L_0x004b
        L_0x002c:
            java.lang.String r5 = "HMACSHA384"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x004a
            r5 = 2
            goto L_0x004b
        L_0x0036:
            java.lang.String r5 = "HMACSHA256"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x004a
            r5 = 1
            goto L_0x004b
        L_0x0040:
            java.lang.String r5 = "HMACSHA1"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x004a
            r5 = 0
            goto L_0x004b
        L_0x004a:
            r5 = -1
        L_0x004b:
            if (r5 == 0) goto L_0x0076
            if (r5 == r2) goto L_0x0073
            if (r5 == r1) goto L_0x0070
            if (r5 == r0) goto L_0x006b
            java.security.NoSuchAlgorithmException r5 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0062
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0067
        L_0x0062:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0067:
            r5.<init>(r4)
            throw r5
        L_0x006b:
            r4 = 64
            r3.zzd = r4
            goto L_0x007a
        L_0x0070:
            r4 = 48
            goto L_0x0078
        L_0x0073:
            r4 = 32
            goto L_0x0078
        L_0x0076:
            r4 = 20
        L_0x0078:
            r3.zzd = r4
        L_0x007a:
            java.lang.ThreadLocal<javax.crypto.Mac> r4 = r3.zza
            r4.get()
            return
        L_0x0080:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r5 = "key size too small, need at least 16 bytes"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzlb.<init>(java.lang.String, java.security.Key):void");
    }

    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (i <= this.zzd) {
            this.zza.get().update(bArr);
            return Arrays.copyOf(this.zza.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
