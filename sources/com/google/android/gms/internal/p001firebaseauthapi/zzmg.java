package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzmg implements Parcelable.Creator<zzmf> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        PhoneAuthCredential phoneAuthCredential = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                phoneAuthCredential = (PhoneAuthCredential) SafeParcelReader.createParcelable(parcel, readHeader, PhoneAuthCredential.CREATOR);
            } else if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzmf(phoneAuthCredential, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzmf[i];
    }
}
