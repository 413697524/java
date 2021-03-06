package com.taotao.rest.component.impl;

import com.taotao.rest.component.JedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by Administrator on 2017/6/30.
 *
 * redis单机版实现类
 */
public class JedisClientSingle implements JedisClient{
    @Autowired
    private JedisPool jedisPool;

    @Override
    public String set(String key, String value) {
        Jedis jedis = jedisPool.getResource();
        String result = jedis.set(key,value);
        jedis.close();
        return result;
    }

    @Override
    public String get(String key) {
        Jedis jedis = jedisPool.getResource();
        String result = jedis.get(key);
        jedis.close();
        return result;
    }

    @Override
    public long hset(String key, String item, String value) {
        Jedis jedis = jedisPool.getResource();
        long result = jedis.hset(key,item,value);
        jedis.close();
        return result;
    }

    @Override
    public String hget(String key, String item) {
        Jedis jedis = jedisPool.getResource();
        String result = jedis.hget(key,item);
        jedis.close();
        return result;
    }

    @Override
    public long incr(String key) {
        Jedis jedis = jedisPool.getResource();
        long result = jedis.incr(key);
        jedis.close();
        return result;
    }

    @Override
    public long decr(String key) {
        Jedis jedis = jedisPool.getResource();
        long result = jedis.decr(key);
        jedis.close();
        return result;
    }

    @Override
    public long expire(String key, int second) {
        Jedis jedis = jedisPool.getResource();
        long result = jedis.expire(key,second);
        jedis.close();
        return result;
    }

    @Override
    public long ttl(String key) {
        Jedis jedis = jedisPool.getResource();
        long result = jedis.ttl(key);
        jedis.close();
        return result;
    }
}
