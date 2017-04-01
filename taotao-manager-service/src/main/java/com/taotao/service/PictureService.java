package com.taotao.service;

import com.sun.tools.internal.xjc.model.Multiplicity;
import com.taotao.common.pojo.PictureResult;
import org.csource.common.MyException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/4.
 */
public interface  PictureService {
    PictureResult uploadPic(MultipartFile picFile);


}
