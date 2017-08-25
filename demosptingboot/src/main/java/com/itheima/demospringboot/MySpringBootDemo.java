package com.itheima.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/17.
 */
@Controller
@EnableAutoConfiguration
public class MySpringBootDemo {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MySpringBootDemo.class, args);
    }



    @RequestMapping("/")
    @ResponseBody
    public List<User> getUser(){
        ArrayList<User> userArrayList = new ArrayList<User>();
        for (int i = 0;i<10;i++){
            User user = new User();
            user.setName("name"+i);
            user.setAge("21"+i);
            user.setSex("男"+i);
            userArrayList.add(user);
        }

        return userArrayList;
    }


    class User{
        private String name;
        private String age;
        private String sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }





}
