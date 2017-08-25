package com.itheima.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/17.
 */
@Controller
@EnableAutoConfiguration
public class home {

    @RequestMapping("/page")
    @ResponseBody
    String page(){
        return "page";

    }
}
