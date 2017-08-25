//package com.taotao.fastdfs;
//
//import org.junit.Test;
//
//import javax.xml.bind.JAXB;
//import java.beans.XMLDecoder;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.util.List;
//
///**
// * Created by Administrator on 2017/8/7.
// */
//public class XmlParserTest {
//
//
//
//
//    @Test
//    public void xmlParser(){
//
//        String xmlFile = "classpath:parser.xml";
////        PureDataObject pdo4Out = new PureDataObject(1024, "Hello, JAXB !", 1.732, true);     // 创建待序列化的对象
////        JAXB.marshal(pdo4Out, xmlFile);
//
////        反序列化
//
//        FileInputStream ifs = null;
//        try {
//            ifs = new FileInputStream(xmlFile);
//            IDCardInfo idCardInfo = (IDCardInfo)deserializeSingleObject(ifs);
//            System.out.println("--------------"+idCardInfo.getName());
//            System.out.println("--------------"+idCardInfo.getIDCard());
//            System.out.println("--------------"+idCardInfo.getBeginDate());
//            System.out.println("--------------"+idCardInfo.getImage());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public Object deserializeSingleObject(InputStream is)       // 反序列化单个Java对象
//    {
//        XMLDecoder xd = new XMLDecoder(is);
//        Object obj = xd.readObject();       // 从XML序列中解码为Java对象
//        xd.close();
//        return obj;
//    }
//
//
//
//
//
//
//
//
//
//
//}
