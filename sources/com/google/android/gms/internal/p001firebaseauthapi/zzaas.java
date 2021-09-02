package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaas  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
final class zzaas extends zzaau {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzaas() {
        super((zzaar) null);
    }

    /* synthetic */ zzaas(zzaar zzaar) {
        super((zzaar) null);
    }

    private static <L> List<L> zzf(Object obj, long j, int i) {
        List<L> list;
        List<L> list2 = (List) zzacr.zzn(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzaaq) {
                list = new zzaap(i);
            } else if (!(list2 instanceof zzabn) || !(list2 instanceof zzaai)) {
                list = new ArrayList<>(i);
            } else {
                list = ((zzaai) list2).zze(i);
            }
            zzacr.zzo(obj, j, list);
            return list;
        } else if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i);
            arrayList.addAll(list2);
            zzacr.zzo(obj, j, arrayList);
            return arrayList;
        } else if (list2 instanceof zzacl) {
            zzaap zzaap = new zzaap(list2.size() + i);
            zzaap.addAll(zzaap.size(), (zzacl) list2);
            zzacr.zzo(obj, j, zzaap);
            return zzaap;
        } else if (!(list2 instanceof zzabn) || !(list2 instanceof zzaai)) {
            return list2;
        } else {
            zzaai zzaai = (zzaai) list2;
            if (zzaai.zza()) {
                return list2;
            }
            zzaai zze = zzaai.zze(list2.size() + i);
            zzacr.zzo(obj, j, zze);
            return zze;
        }
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        Object obj2;
        List list = (List) zzacr.zzn(obj, j);
        if (list instanceof zzaaq) {
            obj2 = ((zzaaq) list).zzi();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzabn) || !(list instanceof zzaai)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzaai zzaai = (zzaai) list;
                if (zzaai.zza()) {
                    zzaai.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzacr.zzo(obj, j, obj2);
    }

    /* access modifiers changed from: package-private */
    public final <E> void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzacr.zzn(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzacr.zzo(obj, j, list);
    }
}
