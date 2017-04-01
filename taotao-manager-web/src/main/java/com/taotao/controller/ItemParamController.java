package com.taotao.controller;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/3/31.
 * 商品规格参数模板管理
 */
@Controller
@RequestMapping("/item/param")
public class ItemParamController {

    @Autowired
    private ItemParamService itemParamService;


    @RequestMapping("/query/itemcatid/{cid}")
    @ResponseBody
    public TaotaoResult getItemCatByCid(@PathVariable long cid){
        TaotaoResult result = itemParamService.getItemParamByCid(cid);
        return result;
    }


    @RequestMapping("/save/{cid}")
    @ResponseBody
    public TaotaoResult insertItemParam(@PathVariable long cid,String paramData){
        TaotaoResult taotaoResult = itemParamService.insertItemParam(cid,paramData);
        System.out.println("------------"+cid);
        System.out.println("------------"+paramData);
        System.out.println("------------"+taotaoResult.getData());
        System.out.println("------------"+taotaoResult.getStatus());
        System.out.println("------------"+taotaoResult.getMsg());
        return taotaoResult;
    }

    @RequestMapping("/cid/{cid}")
    @ResponseBody
    public TaotaoResult getsssss(@PathVariable long cid){
        TaotaoResult result = itemParamService.getItemParamByCid(cid);
        return result;
    }

}
