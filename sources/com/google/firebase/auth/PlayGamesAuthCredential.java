package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p001firebaseauthapi.zzxv;

/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public class PlayGamesAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new zzaf();
    private final String zza;

    PlayGamesAuthCredential(String str) {
        this.zza = Preconditions.checkNotEmpty(str);
    }

    public static zzxv zzb(PlayGamesAuthCredential playGamesAuthCredential, String str) {
        Preconditions.checkNotNull(playGamesAuthCredential);
        return new zzxv((String) null, (String) null, playGamesAuthCredential.getProvider(), (String) null, (String) null, playGamesAuthCredential.zza, str, (String) null, (String) null);
    }

    public String getProvider() {
        return "playgames.google.com";
    }

    public String getSignInMethod() {
        return "playgames.google.com";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final AuthCredential zza() {
        return new PlayGamesAuthCredential(this.zza);
    }
}
