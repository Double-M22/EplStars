package com.google.android.gms.internal.p001firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzdm {
    public static final zzih zza = zza(zzhj.NIST_P256, zzho.SHA256, zzgp.UNCOMPRESSED, zzbo.zza, zzji.TINK, zzd);
    public static final zzih zzb = zza(zzhj.NIST_P256, zzho.SHA256, zzgp.COMPRESSED, zzbo.zza, zzji.RAW, zzd);
    public static final zzih zzc = zza(zzhj.NIST_P256, zzho.SHA256, zzgp.UNCOMPRESSED, zzbo.zze, zzji.TINK, zzd);
    private static final byte[] zzd = new byte[0];

    public static zzih zza(zzhj zzhj, zzho zzho, zzgp zzgp, zzih zzih, zzji zzji, byte[] bArr) {
        zzgu zzc2 = zzgv.zzc();
        zzhg zzd2 = zzhh.zzd();
        zzd2.zza(zzhj);
        zzd2.zzb(zzho);
        zzd2.zzc(zzzb.zzm(bArr));
        zzgr zzb2 = zzgs.zzb();
        zzb2.zza(zzih);
        zzgx zzd3 = zzgy.zzd();
        zzd3.zza((zzhh) zzd2.zzl());
        zzd3.zzb((zzgs) zzb2.zzl());
        zzd3.zzc(zzgp);
        zzc2.zza((zzgy) zzd3.zzl());
        zzig zzd4 = zzih.zzd();
        new zzde();
        zzd4.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zzd4.zzc(zzji);
        zzd4.zzb(((zzgv) zzc2.zzl()).zzn());
        return (zzih) zzd4.zzl();
    }
}
