package com.taotao.service;

import com.taotao.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * Created by Administrator on 2016/11/29.
 */
public interface ItemCatService {
    List<EasyUITreeNode> getItemCatList(long parentID);
}
