package com.taotao.mapper;

import com.taotao.pojo.Nfc;
import com.taotao.pojo.NfcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NfcMapper {
    int countByExample(NfcExample example);

    int deleteByExample(NfcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Nfc record);

    int insertSelective(Nfc record);

    List<Nfc> selectByExample(NfcExample example);

    Nfc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Nfc record, @Param("example") NfcExample example);

    int updateByExample(@Param("record") Nfc record, @Param("example") NfcExample example);

    int updateByPrimaryKeySelective(Nfc record);

    int updateByPrimaryKey(Nfc record);
}