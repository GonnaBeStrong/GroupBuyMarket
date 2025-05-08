package com.yyz.types.design.framework.tree;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * @description 异步资源加载策略
 */
public abstract class AbstractMultiThreadStrategyRouter<T, D, R> implements StrategyMapper<T, D, R>, StrategyHandler<T, D, R> {

    @Getter
    @Setter
    protected StrategyHandler<T, D, R> defaultStrategyHandler = StrategyHandler.DEFAULT;

    public R router(T requestParameter, D dynamicContext) throws Exception {
        StrategyHandler<T, D, R> strategyHandler = get(requestParameter, dynamicContext);
        if(null != strategyHandler) return strategyHandler.apply(requestParameter, dynamicContext);
        return defaultStrategyHandler.apply(requestParameter, dynamicContext);
    }

    @Override
    public R apply(T requestParameter, D dynamicContext) throws Exception {
        // 异步加载数据 子类实现
        multiThread(requestParameter, dynamicContext);
        // 业务流程受理 子类实现
        return doApply(requestParameter, dynamicContext);
    }

    /**
     * 异步加载数据 需要子类实现(被它的抽象子类实现了)
     */
    protected abstract void multiThread(T requestParameter, D dynamicContext) throws ExecutionException, InterruptedException, TimeoutException;

    /**
     * 业务流程受理 这个是子类要实现的，但是子类调用的时候是直接调用apply方法，apply再来调用子类实现的doApply方法
     */
    protected abstract R doApply(T requestParameter, D dynamicContext) throws Exception;

}
