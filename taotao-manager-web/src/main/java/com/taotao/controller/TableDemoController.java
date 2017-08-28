package com.taotao.controller;

import com.taotao.pojo.Books;
import com.taotao.service.NfcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/28.
 */
@Controller
public class TableDemoController {


    @Autowired
    NfcService nfcService;

    @RequestMapping(value = "/table",method = RequestMethod.GET)
    public void addBook(){
//        增加一本数

        nfcService.addBook();

    }
}
