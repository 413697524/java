package com.taotao.controller;

import com.taotao.common.pojo.Person;
import com.taotao.service.HtmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/3/28.
 */
@Controller
@RequestMapping("/test")
public class HtmlController {

    @Autowired
    private HtmlService htmlService;

    @RequestMapping("/html")
    @ResponseBody
    public Person testHtml(){
        htmlService.playBasketball();
        Person person = new Person();
        person.setName("黄河鸟");


        return person;
    }

}
