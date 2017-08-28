package com.taotao.service.impl;

import com.taotao.common.pojo.NfcModel;
import com.taotao.common.utils.JsonUtils;
import com.taotao.mapper.BooksMapper;
import com.taotao.mapper.NfcMapper;
import com.taotao.pojo.Books;
import com.taotao.pojo.NfcExample;
import com.taotao.service.NfcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2017/1/7.
 */
@Service
public class NfcServiceImpl implements NfcService{
    @Autowired
    private NfcMapper nfcMapper;


    @Override
    public NfcModel CreateUpdateMessage() {

        NfcExample example = new NfcExample();
        NfcExample.Criteria criteria = example.createCriteria();
        criteria.andImIsNull();
        nfcMapper.countByExample(example);
        return null;
    }


    @Autowired
    private BooksMapper booksMapper;

    @Override
    public void addBook() {
        Books books = new Books();
        books.setBookName("老人与海");
        books.setBookPic("pic");
        books.setBookAuthor("author");
        books.setBookPub("2017");
        books.setBookSort("hehe");
        books.setBookOwner("owner");
        books.setBookBorrowerTime(new Date(System.currentTimeMillis()));
        System.out.println("==="+ JsonUtils.objectToJson(books));
//        booksMapper.insert(books);
    }





}
