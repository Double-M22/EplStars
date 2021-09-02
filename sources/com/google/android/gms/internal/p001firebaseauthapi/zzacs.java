package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzacs {
    static /* synthetic */ boolean zza(byte b) {
        return b >= 0;
    }

    static /* synthetic */ boolean zzb(byte b) {
        return b < -32;
    }

    static /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i) throws zzaal {
        if (b < -62 || zzg(b2)) {
            throw zzaal.zzi();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    static /* synthetic */ boolean zzd(byte b) {
        return b < -16;
    }

    static /* synthetic */ void zze(byte b, byte b2, byte b3, char[] cArr, int i) throws zzaal {
        if (!zzg(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!zzg(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzaal.zzi();
    }

    static /* synthetic */ void zzf(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzaal {
        if (zzg(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || zzg(b3) || zzg(b4)) {
            throw zzaal.zzi();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }
}
