package com.taotao.service;

import com.taotao.common.pojo.TaotaoResult;

/**
 * Created by Administrator on 2017/3/31.
 */
public interface ItemParamService {
    TaotaoResult getItemParamByCid(long cid);
    TaotaoResult insertItemParam(long cid,String paramData);
}
