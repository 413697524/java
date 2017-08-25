package com.taotao.controller;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.Users;
import com.taotao.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Administrator on 2016/11/28.
 */
@Controller
public class RegisterController {
//    @Autowired
//    private RegisterService registerService;

    @RequestMapping(value = "/api/register",method = RequestMethod.POST)
    @ResponseBody
    public TaotaoResult register(@RequestBody Users users){
        registerService.register(users.getName(),users.getPassword(),users.getSex(),users.getTel());
//        ,@PathVariable Integer pwd
//        ,
//        System.out.println("----------pathVa------"+users);
        return TaotaoResult.ok();
    }








    @RequestMapping("/test/pagehelper")
    public void pagehelper(){

        registerService.pageHelper();

    }


    @RequestMapping("/register")
    public String register(){
        return "register";
    }


    @Autowired
    public RegisterService registerService;

    @RequestMapping("/regisetTest")
    @ResponseBody
    public TaotaoResult registerTest(){

        String name = "gts";
        String password = "123456";
        int sex = 1;
        String tel = "13631057423";
        registerService.register(name,password,sex,tel);

        return TaotaoResult.ok();


    }





}
