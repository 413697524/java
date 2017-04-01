package com.taotao.controller;

import com.taotao.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/11/28.
 */
@Controller
public class RegisterController {
    @Autowired
    private RegisterService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(String userName,String passWord){
        String info = testService.showIndex(userName,passWord);

        return info;
    }





}
