package com.taotao.controller;

import com.taotao.mapper.CurtainMapper;
import com.taotao.pojo.Curtain;
import com.taotao.pojo.CurtainExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/8.
 */
@Controller
public class HuangYuController {


    @Autowired
    CurtainMapper curtainMapper;


    @RequestMapping("/huangyu")
    @ResponseBody
    public Curtain getCurtainInfo(){




        Curtain curtain = new Curtain();
        curtain.setColor("五彩斑斓的黑色");
        curtain.setSize(21);
        curtainMapper.insert(curtain);

        CurtainExample example = new CurtainExample();
        CurtainExample.Criteria criteria = example.createCriteria();
        curtainMapper.selectByExample(example);

//        Users users = new Users();
//        users.setTel("133131313");
//        users.setSex(1);
//        users.setName("哈哈大熊啊");




        return curtain;
    }

}
