package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
class zzacc<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    /* access modifiers changed from: private */
    public List<zzabz> zzb = Collections.emptyList();
    /* access modifiers changed from: private */
    public Map<K, V> zzc = Collections.emptyMap();
    private boolean zzd;
    private volatile zzacb zze;
    private Map<K, V> zzf = Collections.emptyMap();

    /* synthetic */ zzacc(int i, zzabv zzabv) {
        this.zza = i;
    }

    /* access modifiers changed from: private */
    public final V zzk(int i) {
        zzm();
        V value = this.zzb.remove(i).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator it = zzn().entrySet().iterator();
            List<zzabz> list = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzabz(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final int zzl(K k) {
        int size = this.zzb.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.zzb.get(size).zza());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.zzb.get(i2).zza());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    public final void zzm() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzn() {
        zzm();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    public final void clear() {
        zzm();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzacb(this, (zzabv) null);
        }
        return this.zze;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzacc)) {
            return super.equals(obj);
        }
        zzacc zzacc = (zzacc) obj;
        int size = size();
        if (size != zzacc.size()) {
            return false;
        }
        int zzc2 = zzc();
        if (zzc2 != zzacc.zzc()) {
            return entrySet().equals(zzacc.entrySet());
        }
        for (int i = 0; i < zzc2; i++) {
            if (!zzd(i).equals(zzacc.zzd(i))) {
                return false;
            }
        }
        if (zzc2 != size) {
            return this.zzc.equals(zzacc.zzc);
        }
        return true;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return this.zzb.get(zzl).getValue();
        }
        return this.zzc.get(comparable);
    }

    public final int hashCode() {
        int zzc2 = zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc2; i2++) {
            i += this.zzb.get(i2).hashCode();
        }
        return this.zzc.size() > 0 ? i + this.zzc.hashCode() : i;
    }

    public final V remove(Object obj) {
        zzm();
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return zzk(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    public final int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public void zza() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.zzc);
            }
            this.zzc = map;
            if (this.zzf.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.zzf);
            }
            this.zzf = map2;
            this.zzd = true;
        }
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final Map.Entry<K, V> zzd(int i) {
        return this.zzb.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zze() {
        if (this.zzc.isEmpty()) {
            return zzaby.zza();
        }
        return this.zzc.entrySet();
    }

    /* renamed from: zzf */
    public final V put(K k, V v) {
        zzm();
        int zzl = zzl(k);
        if (zzl >= 0) {
            return this.zzb.get(zzl).setValue(v);
        }
        zzm();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i = -(zzl + 1);
        if (i >= this.zza) {
            return zzn().put(k, v);
        }
        int size = this.zzb.size();
        int i2 = this.zza;
        if (size == i2) {
            zzabz remove = this.zzb.remove(i2 - 1);
            zzn().put(remove.zza(), remove.getValue());
        }
        this.zzb.add(i, new zzabz(this, k, v));
        return null;
    }
}
