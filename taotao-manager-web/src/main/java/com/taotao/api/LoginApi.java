package com.taotao.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/11.
 */
@Controller
public class LoginApi {



//    @RequestMapping(value = "/api/login")
//    public void login(@RequestBody Users users){
//
//    }


    @RequestMapping(value = "/u")
    public void user(@PathVariable String name){

        //查询缓存



        //判断是否存在
        //度过存在则直接用否则查询数据库

//        查询数据库



    }





}
