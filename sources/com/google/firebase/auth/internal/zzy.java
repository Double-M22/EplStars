package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p001firebaseauthapi.zzwv;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzy implements Parcelable.Creator<zzx> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzwv zzwv = null;
        zzt zzt = null;
        String str = null;
        String str2 = null;
        ArrayList<zzt> arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzz zzz = null;
        zze zze = null;
        zzbb zzbb = null;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzwv = (zzwv) SafeParcelReader.createParcelable(parcel2, readHeader, zzwv.CREATOR);
                    break;
                case 2:
                    zzt = (zzt) SafeParcelReader.createParcelable(parcel2, readHeader, zzt.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 5:
                    arrayList = SafeParcelReader.createTypedList(parcel2, readHeader, zzt.CREATOR);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 7:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 8:
                    bool = SafeParcelReader.readBooleanObject(parcel2, readHeader);
                    break;
                case 9:
                    zzz = (zzz) SafeParcelReader.createParcelable(parcel2, readHeader, zzz.CREATOR);
                    break;
                case 10:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 11:
                    zze = (zze) SafeParcelReader.createParcelable(parcel2, readHeader, zze.CREATOR);
                    break;
                case 12:
                    zzbb = (zzbb) SafeParcelReader.createParcelable(parcel2, readHeader, zzbb.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzx(zzwv, zzt, str, str2, arrayList, arrayList2, str3, bool, zzz, z, zze, zzbb);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzx[i];
    }
}
