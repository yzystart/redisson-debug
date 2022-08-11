package org.redisson.util;

import java.util.concurrent.TimeUnit;

public final class SleepUtil {



    public static void sleep1()   {
        try {
            TimeUnit.SECONDS.sleep(1);

        }catch (InterruptedException ignored){

        }
    }

    public static void sleep60()   {
        try {
            TimeUnit.MINUTES.sleep(1);

        }catch (InterruptedException i){}
    }

    public static void sleep3(){

        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException ignored){}

    }

}
