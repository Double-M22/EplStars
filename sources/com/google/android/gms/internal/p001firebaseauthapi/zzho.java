package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzho  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public enum zzho implements zzaaf {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    private static final zzaag<zzho> zzg = null;
    private final int zzh;

    static {
        zzg = new zzhn();
    }

    private zzho(int i) {
        this.zzh = i;
    }

    public static zzho zzb(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
