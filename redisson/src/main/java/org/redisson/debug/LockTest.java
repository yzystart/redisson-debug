package org.redisson.debug;

import org.junit.Test;
import org.redisson.Redisson;
import org.redisson.RedissonLock;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.util.SleepUtil;

import java.util.concurrent.TimeUnit;

public class LockTest {


    private static Config config = new Config();

    @Test
    public void test(){
        config.useSingleServer().setAddress("redis://"+"192.168.0.25"+":6379").setPassword("123456").setDatabase(2);

        Redisson redissonClient = (Redisson)Redisson.create(config);

        RedissonLock myLock = (RedissonLock)redissonClient.getLock("myLock");

        myLock.lock();

        SleepUtil.sleep60();

        myLock.unlock();
    }
}
