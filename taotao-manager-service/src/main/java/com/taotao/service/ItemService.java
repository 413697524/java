package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;

/**
 * Created by Administrator on 2016/11/25.
 */
public interface ItemService {
    EasyUIDataGridResult getItemList(int page,int rows);
    TaotaoResult createItem(TbItem item ,String desc);
    TaotaoResult createItem(TbItem item ,String desc,String itemParam);
}
