package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/1/7.
 */
@Controller
public class NfcController {



    @RequestMapping("CreateUpdateMessage")
    @ResponseBody
    public String createUpdateMessage(@RequestParam(value = "Function",defaultValue = "0")long Function,
                                      @RequestParam(value = "uid",defaultValue = "0")long uid,
                                      @RequestParam(value = "count_status",defaultValue = "0")long count_status,
                                      @RequestParam(value = "im",defaultValue = "0")String im,
                                      @RequestParam(value = "status",defaultValue = "0")long status){



        return "----------wobuhui";

    }









}
