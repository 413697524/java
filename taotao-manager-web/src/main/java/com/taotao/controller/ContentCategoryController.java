package com.taotao.controller;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.service.ContentCategoryService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 */
@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

    @Autowired
    private ContentCategoryService contentCategoryService;

//    @RequestMapping("/list")
//    @ResponseBody
//    public List<EasyUITreeNode> getContentCatList(@RequestParam(value = "id",defaultValue = )){
//        List<EasyUITreeNode> list = contentCategoryService.insertCategory()
//    }


    @RequestMapping("/create")
    @ResponseBody
    public TaotaoResult createNode(long parentId,String name){

        TaotaoResult result = contentCategoryService.insertCategory(parentId, name);

        return result;
    }

}
