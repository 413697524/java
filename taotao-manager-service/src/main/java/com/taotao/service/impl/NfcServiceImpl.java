package com.taotao.service.impl;

import com.taotao.common.pojo.NfcModel;
import com.taotao.mapper.NfcMapper;
import com.taotao.pojo.NfcExample;
import com.taotao.service.NfcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
