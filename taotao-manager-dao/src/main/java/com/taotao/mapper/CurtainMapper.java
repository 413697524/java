package com.taotao.mapper;

import com.taotao.pojo.Curtain;
import com.taotao.pojo.CurtainExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CurtainMapper {
    int countByExample(CurtainExample example);

    int deleteByExample(CurtainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Curtain record);

    int insertSelective(Curtain record);

    List<Curtain> selectByExample(CurtainExample example);

    Curtain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Curtain record, @Param("example") CurtainExample example);

    int updateByExample(@Param("record") Curtain record, @Param("example") CurtainExample example);

    int updateByPrimaryKeySelective(Curtain record);

    int updateByPrimaryKey(Curtain record);
}