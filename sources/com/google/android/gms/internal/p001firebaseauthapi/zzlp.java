package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@20.0.2 */
public final class zzlp {
    static final zzlj zza;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0017 }
            java.lang.String r2 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x0017 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0017 }
            r0 = r1
            goto L_0x0024
        L_0x0015:
            r1 = move-exception
            goto L_0x0049
        L_0x0017:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0015 }
            java.lang.String r3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
            r2.println(r3)     // Catch:{ all -> 0x0015 }
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0015 }
            r1.printStackTrace(r2)     // Catch:{ all -> 0x0015 }
        L_0x0024:
            if (r0 == 0) goto L_0x0034
            int r1 = r0.intValue()     // Catch:{ all -> 0x0048 }
            r2 = 19
            if (r1 < r2) goto L_0x0034
            com.google.android.gms.internal.firebase-auth-api.zzlo r1 = new com.google.android.gms.internal.firebase-auth-api.zzlo     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
            goto L_0x0047
        L_0x0034:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0042
            com.google.android.gms.internal.firebase-auth-api.zzlm r1 = new com.google.android.gms.internal.firebase-auth-api.zzlm     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
            goto L_0x0047
        L_0x0042:
            com.google.android.gms.internal.firebase-auth-api.zzln r1 = new com.google.android.gms.internal.firebase-auth-api.zzln     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
        L_0x0047:
            goto L_0x007e
        L_0x0048:
            r1 = move-exception
        L_0x0049:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.zzln> r3 = com.google.android.gms.internal.p001firebaseauthapi.zzln.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 133
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            com.google.android.gms.internal.firebase-auth-api.zzln r1 = new com.google.android.gms.internal.firebase-auth-api.zzln
            r1.<init>()
        L_0x007e:
            zza = r1
            if (r0 != 0) goto L_0x0083
            return
        L_0x0083:
            r0.intValue()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzlp.<clinit>():void");
    }

    public static void zza(Throwable th, Throwable th2) {
        zza.zza(th, th2);
    }
}
