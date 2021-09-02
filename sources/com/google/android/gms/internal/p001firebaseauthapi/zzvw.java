package com.google.android.gms.internal.p001firebaseauthapi;

import androidx.collection.ArrayMap;
import com.google.firebase.FirebaseApp;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzvw {
    private static final Map<String, zzvu> zza = new ArrayMap();
    private static final Map<String, WeakReference<zzvv>> zzb = new ArrayMap();

    public static void zza(FirebaseApp firebaseApp, String str, int i) {
        String apiKey = firebaseApp.getOptions().getApiKey();
        synchronized (zza) {
            zza.put(apiKey, new zzvu(str, i));
        }
        synchronized (zzb) {
            if (zzb.containsKey(apiKey)) {
                zzvv zzvv = (zzvv) zzb.get(apiKey).get();
                if (zzvv != null) {
                    zzvv.zza();
                } else {
                    zza.remove(apiKey);
                }
            }
        }
    }

    public static boolean zzb(FirebaseApp firebaseApp) {
        return zza.containsKey(firebaseApp.getOptions().getApiKey());
    }

    public static void zzc(String str, zzvv zzvv) {
        synchronized (zzb) {
            zzb.put(str, new WeakReference(zzvv));
        }
    }

    public static String zzd(String str) {
        zzvu zzvu;
        String str2;
        synchronized (zza) {
            zzvu = zza.get(str);
        }
        if (zzvu != null) {
            String valueOf = String.valueOf(zzh(zzvu.zza(), zzvu.zzb(), zzvu.zza().contains(":")));
            str2 = valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        } else {
            str2 = "https://";
        }
        return String.valueOf(str2).concat("securetoken.googleapis.com/v1");
    }

    public static String zze(String str) {
        zzvu zzvu;
        String str2;
        synchronized (zza) {
            zzvu = zza.get(str);
        }
        if (zzvu != null) {
            String valueOf = String.valueOf(zzh(zzvu.zza(), zzvu.zzb(), zzvu.zza().contains(":")));
            str2 = valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        } else {
            str2 = "https://";
        }
        return String.valueOf(str2).concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzf(String str) {
        zzvu zzvu;
        String str2;
        synchronized (zza) {
            zzvu = zza.get(str);
        }
        if (zzvu != null) {
            String valueOf = String.valueOf(zzh(zzvu.zza(), zzvu.zzb(), zzvu.zza().contains(":")));
            str2 = valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        } else {
            str2 = "https://";
        }
        return String.valueOf(str2).concat("identitytoolkit.googleapis.com/v2/accounts");
    }

    public static String zzg(String str) {
        zzvu zzvu;
        synchronized (zza) {
            zzvu = zza.get(str);
        }
        if (zzvu != null) {
            return String.valueOf(zzh(zzvu.zza(), zzvu.zzb(), zzvu.zza().contains(":"))).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    private static String zzh(String str, int i, boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("http://[");
            sb.append(str);
            sb.append("]:");
            sb.append(i);
            sb.append("/");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20);
        sb2.append("http://");
        sb2.append(str);
        sb2.append(":");
        sb2.append(i);
        sb2.append("/");
        return sb2.toString();
    }
}
