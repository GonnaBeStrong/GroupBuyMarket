package com.yyz.domain.activity.service.trial.node;

import com.yyz.domain.activity.model.entity.MarketProductEntity;
import com.yyz.domain.activity.model.entity.TrialBalanceEntity;
import com.yyz.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.yyz.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.yyz.types.design.framework.tree.StrategyHandler;

import javax.annotation.Resource;

/**
 * @description 开关节点
 */
@Slf4j
@Service
public class SwitchNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {

    @Resource
    private MarketNode marketNode;

    @Override
    public TrialBalanceEntity doApply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return router(requestParameter, dynamicContext);
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return marketNode;
    }

}
