package com.taotao.service.impl;

import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import com.taotao.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * Created by Administrator on 2016/11/28.
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public String showIndex(String userName, String passWord) {
        TbUser register = new TbUser();
        register.setUsername(userName);
        register.setPassword(passWord);
        Date date = new Date();
        register.setCreated(date);
        register.setUpdated(date);
        register.setPhone(String.valueOf(136000000));
        register.setEmail("413697524@qq.com");
        tbUserMapper.insert(register);


        return "{\n" +
                "    \"status\": \"\",\n" +
                "    \"data\": \"\"\n" +
                "}";
    }
}
