package org.redisson.debug;

import org.junit.Test;
import org.redisson.Redisson;
import org.redisson.RedissonLock;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.client.protocol.RedisCommands;
import org.redisson.config.Config;
import org.redisson.util.SleepUtil;

import java.util.concurrent.TimeUnit;

public class LockTest {


    private static Config config = new Config();
    static {
        config.useSingleServer().setAddress("redis://"+"192.168.153.134"+":6379").setDatabase(2);
    }
    Redisson redissonClient = (Redisson)Redisson.create(config);


    @Test
    public void test(){
        Thread.currentThread().setName("t1");

        RedissonLock myLock = (RedissonLock)redissonClient.getLock("myLock");

        myLock.lock();

        SleepUtil.sleep60();

        myLock.unlock();
    }

    @Test
    public void test2(){
        Thread.currentThread().setName("t2");

        RedissonLock myLock = (RedissonLock)redissonClient.getLock("myLock");

        myLock.lock();

        SleepUtil.sleep60();

        myLock.unlock();
    }
}
