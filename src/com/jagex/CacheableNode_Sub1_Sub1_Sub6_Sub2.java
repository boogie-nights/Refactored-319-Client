package com.jagex;

import com.jagex.sign.Signlink;

public class CacheableNode_Sub1_Sub1_Sub6_Sub2 extends CacheableNode_Sub1_Sub1_Sub6 {

    public Class47 aClass47_1717;

    public CacheableNode_Sub1_Sub1_Sub6_Sub2() {
    }

    public Model method298(int i) {
        try {
            if (super.anInt1597 >= 0 && super.anInt1600 == 0) {
                int j = Class50.aClass50Array800[super.anInt1597].anIntArray802[super.anInt1598];
                int l = -1;
                if (super.anInt1620 >= 0 && super.anInt1620 != super.anInt1584) {
                    l = Class50.aClass50Array800[super.anInt1620].anIntArray802[super.anInt1621];
                }
                return aClass47_1717.method582(l, j, true, Class50.aClass50Array800[super.anInt1597].anIntArray806);
            }
            int k = -1;
            if (i != -37578) {
                throw new NullPointerException();
            }
            if (super.anInt1620 >= 0) {
                k = Class50.aClass50Array800[super.anInt1620].anIntArray802[super.anInt1621];
            }
            return aClass47_1717.method582(-1, k, true, null);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("45943, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method291(boolean flag) {
        try {
            if (!flag) {
                throw new NullPointerException();
            }
            return aClass47_1717 != null;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("19439, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method256(int i) {
        try {
            if (aClass47_1717 == null) {
                return null;
            }
            Model class13_sub1_sub1_sub4 = method298(-37578);
            if (i <= 0) {
                for (int j = 1; j > 0; j++) {
                }
            }
            if (class13_sub1_sub1_sub4 == null) {
                return null;
            }
            super.anInt1590 = class13_sub1_sub1_sub4.anInt1377;
            if (super.anInt1592 != -1 && super.anInt1593 != -1) {
                Class40 class40 = Class40.aClass40Array685[super.anInt1592];
                Model class13_sub1_sub1_sub4_1 = class40.method530();
                if (class13_sub1_sub1_sub4_1 != null) {
                    int k = class40.aClass50_689.anIntArray802[super.anInt1593];
                    Model class13_sub1_sub1_sub4_2 = new Model(false, Class8.method189(k, 19953), 629, class13_sub1_sub1_sub4_1, true);
                    class13_sub1_sub1_sub4_2.method278(0, -991, -super.anInt1596, 0);
                    class13_sub1_sub1_sub4_2.method272(true);
                    class13_sub1_sub1_sub4_2.method273(k, false);
                    class13_sub1_sub1_sub4_2.anIntArrayArray1528 = null;
                    class13_sub1_sub1_sub4_2.anIntArrayArray1527 = null;
                    if (class40.anInt692 != 128 || class40.anInt693 != 128) {
                        class13_sub1_sub1_sub4_2.method281(class40.anInt692, class40.anInt692, class40.anInt693, (byte) 0);
                    }
                    class13_sub1_sub1_sub4_2.method282(64 + class40.anInt695, 850 + class40.anInt696, -30, -50, -30, true);
                    Model[] aclass13_sub1_sub1_sub4 = {
                            class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_2
                    };
                    class13_sub1_sub1_sub4 = new Model(aclass13_sub1_sub1_sub4, 0, true, 2);
                }
            }
            if (aClass47_1717.aByte768 == 1) {
                class13_sub1_sub1_sub4.aBoolean1529 = true;
            }
            return class13_sub1_sub1_sub4;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("82665, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}