package com.yyz.domain.activity.service;


import com.yyz.domain.activity.model.entity.MarketProductEntity;
import com.yyz.domain.activity.model.entity.TrialBalanceEntity;

/**
 * @description 首页营销服务接口
 */
public interface IIndexGroupBuyMarketService {

    TrialBalanceEntity indexMarketTrial(MarketProductEntity marketProductEntity) throws Exception;

}
