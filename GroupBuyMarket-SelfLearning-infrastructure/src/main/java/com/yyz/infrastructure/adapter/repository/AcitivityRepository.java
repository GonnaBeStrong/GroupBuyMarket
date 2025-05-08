package com.yyz.infrastructure.adapter.repository;

import com.google.common.collect.Iterables;
import com.yyz.domain.activity.adapter.repository.IActivityRepository;
import com.yyz.domain.activity.model.valobj.DiscountTypeEnum;
import com.yyz.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.yyz.domain.activity.model.valobj.SkuVO;
import com.yyz.infrastructure.dao.GroupBuyActivityMapper;
import com.yyz.infrastructure.dao.GroupBuyDiscountMapper;
import com.yyz.infrastructure.dao.SkuMapper;
import com.yyz.infrastructure.dao.po.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Repository
public class AcitivityRepository implements IActivityRepository {


    @Resource
    GroupBuyActivityMapper groupBuyActivityMapper;

    @Resource
    GroupBuyDiscountMapper groupBuyDiscountMapper;

    @Resource
    SkuMapper skuMapper;



    @Override
    public GroupBuyActivityDiscountVO queryGroupBuyActivityDiscountVO(String source, String channel) {
        GroupBuyActivityExample groupBuyActivityExample = new GroupBuyActivityExample();
        groupBuyActivityExample.setOrderByClause("id desc");
        groupBuyActivityExample.createCriteria()
                .andSourceEqualTo(source)
                .andChannelEqualTo(channel);
        List<GroupBuyActivity> groupBuyActivities = groupBuyActivityMapper.selectByExample(groupBuyActivityExample);
        GroupBuyActivity activity = null;

        if(Iterables.isEmpty(groupBuyActivities)){
            log.info("查不到活动最新记录");
            return null;
        }
        else{
            activity = groupBuyActivities.get(0);
        }

        String discountId = activity.getDiscountId();

        GroupBuyDiscountExample groupBuyDiscountExample = new GroupBuyDiscountExample();
        groupBuyDiscountExample.createCriteria()
                .andDiscountIdEqualTo(discountId);
        List<GroupBuyDiscount> groupBuyDiscounts = groupBuyDiscountMapper.selectByExample(groupBuyDiscountExample);
        GroupBuyDiscount  discount = null;

        if(Iterables.isEmpty(groupBuyDiscounts)){
            log.info("查不到活动最新记录");
            return null;
        }
        else {
            discount = groupBuyDiscounts.get(0);
        }

        GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount = GroupBuyActivityDiscountVO.GroupBuyDiscount.builder()
                .discountName(discount.getDiscountName())
                .discountDesc(discount.getDiscountDesc())
                .discountType(DiscountTypeEnum.get(discount.getDiscountType()))
                .marketPlan(discount.getMarketPlan())
                .marketExpr(discount.getMarketExpr())
                .tagId(discount.getTagId())
                .build();

        return GroupBuyActivityDiscountVO.builder()
                .activityId(activity.getActivityId())
                .activityName(activity.getActivityName())
                .source(activity.getSource())
                .channel(activity.getChannel())
                .goodsId(activity.getGoodsId())
                .groupBuyDiscount(groupBuyDiscount)
                .groupType(activity.getGroupType())
                .takeLimitCount(activity.getTakeLimitCount())
                .target(activity.getTarget())
                .validTime(activity.getValidTime())
                .status(activity.getStatus())
                .startTime(activity.getStartTime())
                .endTime(activity.getEndTime())
                .tagId(activity.getTagId())
                .tagScope(activity.getTagScope())
                .build();



    }

    @Override
    public SkuVO querySkuByGoodsId(String goodsId) {
        SkuExample skuExample = new SkuExample();
        skuExample.createCriteria()
                .andGoodsIdEqualTo(goodsId);
        List<Sku> skus = skuMapper.selectByExample(skuExample);
        if(Iterables.isEmpty(skus))
            return new SkuVO();
        else{
            Sku sku = skus.get(0);
            return SkuVO.builder()
                    .goodsId(sku.getGoodsId())
                    .goodsName(sku.getGoodsName())
                    .originalPrice(sku.getOriginalPrice())
                    .build();
        }
    }
}
