package com.google.firebase.auth.internal;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzbl {
    static final Map<String, String> zza;

    static {
        HashMap hashMap = new HashMap();
        zza = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        zza.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        zza.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        zza.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        zza.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static void zza(Intent intent, Status status) {
        SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean zzb(Intent intent) {
        Preconditions.checkNotNull(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }

    public static Status zzc(Intent intent) {
        Preconditions.checkNotNull(intent);
        Preconditions.checkArgument(zzb(intent));
        return (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    public static Status zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || !zza.containsKey(string)) {
                String valueOf = String.valueOf(str);
                return zzai.zza(valueOf.length() != 0 ? "WEB_INTERNAL_ERROR:".concat(valueOf) : new String("WEB_INTERNAL_ERROR:"));
            }
            String str2 = zza.get(string);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string2).length());
            sb.append(str2);
            sb.append(":");
            sb.append(string2);
            return zzai.zza(sb.toString());
        } catch (JSONException e) {
            String localizedMessage = e.getLocalizedMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(localizedMessage).length());
            sb2.append("WEB_INTERNAL_ERROR:");
            sb2.append(str);
            sb2.append("[ ");
            sb2.append(localizedMessage);
            sb2.append(" ]");
            return zzai.zza(sb2.toString());
        }
    }
}
