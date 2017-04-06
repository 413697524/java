package com.taotao.service.impl;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.TbContentCategory;
import com.taotao.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {


    @Autowired
    private TbContentCategoryMapper tbContentCategoryMapper;




    @Override
    public TaotaoResult insertCategory(Long parentId, String name) {

        TbContentCategory contentCategory = new TbContentCategory();
        contentCategory.setParentId(parentId);
        contentCategory.setName(name);

        contentCategory.setStatus(1);
        contentCategory.setIsParent(false);

        contentCategory.setSortOrder(1);
        contentCategory.setCreated(new Date());
        contentCategory.setUpdated(new Date());

        //插入数据
        tbContentCategoryMapper.insert(contentCategory);

        Long id = contentCategory.getId();
        return TaotaoResult.ok(id);
    }



}
