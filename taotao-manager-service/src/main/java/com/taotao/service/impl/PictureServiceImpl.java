package com.taotao.service.impl;

import com.taotao.common.pojo.PictureResult;
import com.taotao.service.PictureService;
import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/4.
 */
@Service
public class PictureServiceImpl implements PictureService {
    @Value("${IMAGE_SERVER_BASE_URL}")
    private String IMAGE_SERVER_BASE_URL;

    @Override
    public PictureResult uploadPic(MultipartFile picFile) {
        PictureResult pictureResult = new PictureResult();
        if (picFile.isEmpty()){
            pictureResult.setError(1);
            pictureResult.setMessage("图片为空");
            return pictureResult;
        }
        try {
            //上传到图片服务器
            String classpath = "D:\\taotao\\taotao-manager-web\\src\\main\\resources\\properties\\client.conf";
//            ClientGlobal.init("D:\\taotao\\taotao-manager-web\\src\\main\\resources\\properties\\client.conf");
            ClientGlobal.init(classpath);
            //        3、创建一个TrackerClient对象。
            TrackerClient trackerClient = new TrackerClient();
//        4、创建一个TrackerServer对象。
            TrackerServer trackerServer = trackerClient.getConnection();
//        5、声明一个StorageServer对象，null。
            StorageServer storageServer = null;
//        6、获得StorageClient对象。
//            StorageClient storageClient = new StorageClient(trackerServer,storageServer);
            StorageClient1 storageClient1 = new StorageClient1(trackerServer,storageServer);
//        7、直接调用StorageClient对象方法上传文件即可。
            String originalFilename = picFile.getOriginalFilename();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);

//        String  strings = storageClient.upload_file(picFile.getBytes(), extName, null);
            String  url = storageClient1.upload_file1(picFile.getBytes(), extName, null);
            url = IMAGE_SERVER_BASE_URL + url;
//            拼接ip地址
//        storageClient.upload_file
            pictureResult.setError(0);
            pictureResult.setUrl(url);
        } catch (Exception e) {
            e.printStackTrace();
            pictureResult.setError(1);
            pictureResult.setMessage("图片上传失败");
        }

        return pictureResult;



    }
}
