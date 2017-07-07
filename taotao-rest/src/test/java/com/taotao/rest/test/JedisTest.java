//package com.taotao.rest.test;
//
//import com.taotao.rest.component.JedisClient;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import redis.clients.jedis.HostAndPort;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisCluster;
//import redis.clients.jedis.JedisPool;
//
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * Created by Administrator on 2017/6/30.
// */
//public class JedisTest {
//    public static int port = 6379;
//    public static String host = "172.16.56.250";
//
//
//    //单机版测试
//
//    @Test
//    public void testJedisSingle() throws Exception{
//
////        3 41.72
////        4 42.12
//
////        String host = "172.16.81.88";
//        Jedis jedis = new Jedis(host,port);
//        jedis.set("test","hello jedis");
//        String str = jedis.get("test");
//        System.out.println(str);
//        jedis.close();
//
//    }
//
//    @Test
//    public void testJedisPool() throws Exception{
////        创建一个连接池对象
//        JedisPool jedisPool = new JedisPool(host,port);
//        Jedis jedis = jedisPool.getResource();
//        String str = jedis.get("test");
//        System.out.println(str);
////        jedis每次都要关闭
//
//
//        jedis.close();
//        jedisPool.close();
//    }
//
//
////    连接集群
//    @Test
//    public void testJedisCluster() throws Exception{
////        创建一个jedisCluster对象
//        Set<HostAndPort> nodes = new HashSet<>();
//        int port1 = 7001;
//        int port2 = 7002;
//        int port3 = 7003;
//        int port4 = 7004;
//        int port5 = 7005;
//        int port6 = 7006;
//        nodes.add(new HostAndPort(host,port1));
//        nodes.add(new HostAndPort(host,port2));
//        nodes.add(new HostAndPort(host,port3));
//        nodes.add(new HostAndPort(host,port4));
//        nodes.add(new HostAndPort(host,port5));
//        nodes.add(new HostAndPort(host,port6));
//
//
////        jedisCluster在系统中是单利的
//        JedisCluster jedisCluster = new JedisCluster(nodes);
//
//        jedisCluster.set("name","张山2");
//        jedisCluster.set("value","1000");
//
//        String name = jedisCluster.get("name");
//        String value = jedisCluster.get("value");
//        System.out.println(name);
//        System.out.println(value);
////        系统关闭的时候才关闭
//        jedisCluster.close();
//    }
//
//
//    @Test
//    public void testJedisClientSpring() throws Exception{
////        创建一个spring容器
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
//        JedisClient jedisClient = applicationContext.getBean(JedisClient.class);
//        jedisClient.set("client1","10321");
//        String result = jedisClient.get("client1");
//        System.out.println(result);
//    }
//
//
//}
