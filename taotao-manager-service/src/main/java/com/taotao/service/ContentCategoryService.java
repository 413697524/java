package com.taotao.service;

import com.taotao.common.pojo.TaotaoResult;

/**
 * Created by Administrator on 2017/4/6.
 */
public interface ContentCategoryService {

    TaotaoResult insertCategory(Long parentId ,String name);


}
