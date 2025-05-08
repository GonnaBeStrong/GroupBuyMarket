package com.yyz.types.design.framework.tree;

/**
 * @description 受理策略处理
 * T 入参类型
 * D 上下文参数
 * R 返参类型
 */
public interface StrategyHandler<T, D, R> {

    //这是一个默认实现，没有实现类的时候就调用这个apply方法，apply方法返回null值
    StrategyHandler DEFAULT = (T, D) -> null;

    R apply(T requestParameter, D dynamicContext) throws Exception;

}