package com.taotao.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 */
@Controller
public class GetUserInfoController {

    @RequestMapping(value = "/api/user/getUserInfo")
    @ResponseBody
    private List<TestBean> getUserInfo(){
        ArrayList list = new ArrayList();
        String name = "帅哥：";
        String address = "我的地址是：";
        String header_icon = "我这个是头像:";
        String desc = "我这个是描述：";
        int max = 50;
        for (int i = 0; i<max; i++){
            list.add(new TestBean(name+i,i,address+i,header_icon+i,desc+i));
        }
        return list;

    }

//    @Autowired
//    UserMapper userMapper;
//
//    @RequestMapping(value = "/api/test/aliyun/taotao")
//    @ResponseBody
//    private void SaveUser(){
//        User userTest = new User();
//        userTest.setName("ahahaha");
//        userTest.setAge(11);
//        userTest.setSex(1);
//        userTest.setAddress("广东");
//        userMapper.insert(userTest);
//    }





    class TestBean{
        private String name;
        private int age;
        private String address;
        private String header_icon;
        private String desc;

        public TestBean(String name, int age, String address, String header_icon, String desc) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.header_icon = header_icon;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getHeader_icon() {
            return header_icon;
        }

        public void setHeader_icon(String header_icon) {
            this.header_icon = header_icon;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
