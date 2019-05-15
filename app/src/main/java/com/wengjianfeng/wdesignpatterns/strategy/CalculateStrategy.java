package com.wengjianfeng.wdesignpatterns.strategy;

public interface CalculateStrategy {

    /**
     * 按距离计算价格
     * @param km
     * @return
     */
    int calculatePrice(int km);
}
