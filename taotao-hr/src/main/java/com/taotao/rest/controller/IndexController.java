package com.taotao.rest.controller;

import com.taotao.rest.pojo.Spitter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Administrator on 2017/5/29.
 */
@Controller
public class IndexController {


    @RequestMapping(value = "/")
    public String showDetial(){
        System.out.println("------------------showDetial--");

        return "home";
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix();
//        resolver.setSuffix();


    }


    @RequestMapping(value = "/register" ,method = RequestMethod.POST)
    public String showRegistrationForm(Model model){
        model.addAttribute(new Spitter());
        return "registerForm";
    }

}
