package com.jagex;

import com.jagex.sign.signlink;

public class Class21
{

    public Class13_Sub1 aClass13_Sub1_361;
    public Class13_Sub1 aClass13_Sub1_362;

    public Class21(int i)
    {
        aClass13_Sub1_361 = new Class13_Sub1();
        try
        {
            aClass13_Sub1_361.aClass13_Sub1_1336 = aClass13_Sub1_361;
            if(i != 14716)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            aClass13_Sub1_361.aClass13_Sub1_1337 = aClass13_Sub1_361;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("71610, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method439(Class13_Sub1 class13_sub1)
    {
        if(class13_sub1.aClass13_Sub1_1337 != null)
        {
            class13_sub1.method254();
        }
        class13_sub1.aClass13_Sub1_1337 = aClass13_Sub1_361.aClass13_Sub1_1337;
        class13_sub1.aClass13_Sub1_1336 = aClass13_Sub1_361;
        class13_sub1.aClass13_Sub1_1337.aClass13_Sub1_1336 = class13_sub1;
        class13_sub1.aClass13_Sub1_1336.aClass13_Sub1_1337 = class13_sub1;
    }

    public Class13_Sub1 method440()
    {
        Class13_Sub1 class13_sub1 = aClass13_Sub1_361.aClass13_Sub1_1336;
        if(class13_sub1 == aClass13_Sub1_361)
        {
            return null;
        } else
        {
            class13_sub1.method254();
            return class13_sub1;
        }
    }

    public Class13_Sub1 method441()
    {
        Class13_Sub1 class13_sub1 = aClass13_Sub1_361.aClass13_Sub1_1336;
        if(class13_sub1 == aClass13_Sub1_361)
        {
            aClass13_Sub1_362 = null;
            return null;
        } else
        {
            aClass13_Sub1_362 = class13_sub1.aClass13_Sub1_1336;
            return class13_sub1;
        }
    }

    public Class13_Sub1 method442(int i)
    {
        try
        {
            if(i >= 0)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            Class13_Sub1 class13_sub1 = aClass13_Sub1_362;
            if(class13_sub1 == aClass13_Sub1_361)
            {
                aClass13_Sub1_362 = null;
                return null;
            } else
            {
                aClass13_Sub1_362 = class13_sub1.aClass13_Sub1_1336;
                return class13_sub1;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("87633, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method443()
    {
        int i = 0;
        for(Class13_Sub1 class13_sub1 = aClass13_Sub1_361.aClass13_Sub1_1336; class13_sub1 != aClass13_Sub1_361; class13_sub1 = class13_sub1.aClass13_Sub1_1336)
        {
            i++;
        }
        return i;
    }
}
