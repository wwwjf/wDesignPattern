package com.wengjianfeng.wdesignpatterns.strategy;

public class TrafficStrategy {

    CalculateStrategy calculateStrategy;

    private TrafficStrategy() {
    }

    public TrafficStrategy(CalculateStrategy calculateStrategy) {

        this.calculateStrategy = calculateStrategy;
    }


    /**
     * 计算价格
     *
     * @param km
     * @return
     */
    public int calculatePrice(int km) {
        return calculateStrategy.calculatePrice(km);
    }
}
