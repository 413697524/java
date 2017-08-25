package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/17.
 */
@Controller
public class DemoController {

    @RequestMapping("/")
    @ResponseBody
    public User hehe(){
        User user = new User();
        user.setName("haha");
        return user;
    }


    class User{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
