package com.wengjianfeng.wdesignpatterns.strategy;

/**
 * 公交价格计算策略：十公里内一元，超过十公里后，每加一元，可以坐五公里
 */
public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        //超过10km的距离
        int extraTotal = km - 10;
        //
        int extraFactor = extraTotal / 5;
        //
        int fraction = extraTotal % 5;

        int price = 1 + extraFactor * 1;

        return fraction > 0 ? ++price : price;
    }
}
