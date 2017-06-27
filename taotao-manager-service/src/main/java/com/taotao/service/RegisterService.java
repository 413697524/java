package com.taotao.service;

/**
 * Created by Administrator on 2016/11/28.
 */
public interface RegisterService {
    String showIndex(String userName,String passWord);
    void register(String name,String password,int sex,String tel);
}
