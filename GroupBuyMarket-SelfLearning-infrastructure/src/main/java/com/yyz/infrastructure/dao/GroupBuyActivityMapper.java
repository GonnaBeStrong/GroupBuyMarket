package com.yyz.infrastructure.dao;

import com.yyz.infrastructure.dao.po.GroupBuyActivity;
import com.yyz.infrastructure.dao.po.GroupBuyActivityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GroupBuyActivityMapper {
    long countByExample(GroupBuyActivityExample example);

    int deleteByExample(GroupBuyActivityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GroupBuyActivity record);

    int insertSelective(GroupBuyActivity record);

    List<GroupBuyActivity> selectByExample(GroupBuyActivityExample example);

    GroupBuyActivity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GroupBuyActivity record, @Param("example") GroupBuyActivityExample example);

    int updateByExample(@Param("record") GroupBuyActivity record, @Param("example") GroupBuyActivityExample example);

    int updateByPrimaryKeySelective(GroupBuyActivity record);

    int updateByPrimaryKey(GroupBuyActivity record);
}