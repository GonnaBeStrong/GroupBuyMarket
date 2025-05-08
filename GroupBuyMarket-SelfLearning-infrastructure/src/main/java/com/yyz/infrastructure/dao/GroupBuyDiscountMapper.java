package com.yyz.infrastructure.dao;

import com.yyz.infrastructure.dao.po.GroupBuyDiscount;
import com.yyz.infrastructure.dao.po.GroupBuyDiscountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface GroupBuyDiscountMapper {
    long countByExample(GroupBuyDiscountExample example);

    int deleteByExample(GroupBuyDiscountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GroupBuyDiscount record);

    int insertSelective(GroupBuyDiscount record);

    List<GroupBuyDiscount> selectByExample(GroupBuyDiscountExample example);

    GroupBuyDiscount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GroupBuyDiscount record, @Param("example") GroupBuyDiscountExample example);

    int updateByExample(@Param("record") GroupBuyDiscount record, @Param("example") GroupBuyDiscountExample example);

    int updateByPrimaryKeySelective(GroupBuyDiscount record);

    int updateByPrimaryKey(GroupBuyDiscount record);
}