package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.utils.JsonUtils;
import com.taotao.mapper.TbItemMapper;
import com.taotao.mapper.TbUserMapper;
import com.taotao.mapper.UsersMapper;
import com.taotao.pojo.*;
import com.taotao.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


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

    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void register(String name, String password, int sex, String tel) {

        System.out.println("-----------------name---"+name);
        System.out.println("-----------------password---"+password);
        System.out.println("-----------------tel---"+sex);
        System.out.println("-----------------1---"+tel);

        Users users = new Users();
//        users.setId(null);
        users.setName(name);
        users.setPassword(password);
        users.setSex(sex);
        users.setTel(tel);
//        usersMapper.insert(users);

        Users userData = usersMapper.selectByPrimaryKey(1);
        Integer myid = userData.getId();

        UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andIdBetween(1,5);
        List<Users> userList = usersMapper.selectByExample(example);

        System.out.println("---------userData:"+ JsonUtils.objectToJson(userList));



    }


    @Autowired
    private TbItemMapper mapper;

    @Override
    public void pageHelper() {

        //主要是根据example查询出来的结果 按startPage开始排序  总数除以pagesize page代表要的页数


//        设置分页
        PageHelper.startPage(1,20);
//        不设置example则查询所有
        TbItemExample example = new TbItemExample();
        List<TbItem> list = mapper.selectByExample(example);
//        UsersExample example = new UsersExample();
//        List<Users> list = usersMapper.selectByExample(example);

//        取分页后的结果
        PageInfo<TbItem> pageInfo = new PageInfo(list);
//        总共记录数
        long total = pageInfo.getTotal();
//        页数
        int page = pageInfo.getPages();
        int pageSize = pageInfo.getPageSize();
        List<TbItem> pageList = pageInfo.getList();
        int firstPage = pageInfo.getFirstPage();
        System.out.println("---------toral--------"+total);
        System.out.println("---------page--------"+page);
        System.out.println("---------pageSize--------"+pageSize);
        System.out.println("---------firstPage--------"+firstPage);

        for (int i =0;i<pageList.size();i++){
        System.out.println("---------pageList--------"+pageList.get(i).getId());

        }
    }


}
