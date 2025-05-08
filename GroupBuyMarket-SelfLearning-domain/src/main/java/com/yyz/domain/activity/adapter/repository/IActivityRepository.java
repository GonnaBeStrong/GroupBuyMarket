package com.yyz.domain.activity.adapter.repository;


import com.yyz.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.yyz.domain.activity.model.valobj.SkuVO;

/**
 * @description 活动仓储
 */
public interface IActivityRepository {

    //用于获取业务流程中需要的信息，从数据库中查询
    GroupBuyActivityDiscountVO queryGroupBuyActivityDiscountVO(String source, String channel);

    SkuVO querySkuByGoodsId(String goodsId);

}
