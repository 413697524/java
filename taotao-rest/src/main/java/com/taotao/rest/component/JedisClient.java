package com.taotao.rest.component;

/**
 * Created by Administrator on 2017/6/30.
 */
public interface JedisClient {

    String set(String key ,String value);
    String get(String key);
    long hset(String key,String item,String value);
    String hget(String key,String item);
    long incr(String key);
    long decr(String key);
    long expire(String key,int second);
    long ttl(String key);


}
