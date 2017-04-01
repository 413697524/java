package com.taotao.controller;

import com.alibaba.druid.support.logging.Log;
import com.taotao.common.pojo.PictureResult;
import com.taotao.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2017/2/4.
 */
@Controller
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public PictureResult uploadFile(MultipartFile uploadFile){
        PictureResult result = pictureService.uploadPic(uploadFile);

        System.out.println("-------------"+result.getUrl());
        return result;
    }

}
