package com.wengjianfeng.wdesignpatterns.strategy;

/**
 * 地铁价格计算策略：
 * 6公里内3元，6-12公里4元，12-22公里5元，22-32公里6元，超过32公里7元
 */
public class SubwayStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int price = 0;
        if (km > 0 && km <= 6) {
            price = 3;
        } else if (km > 6 && km <= 12) {
            price = 4;
        } else if (km > 12 && km <= 22) {
            price = 5;
        } else if (km > 22 && km <= 32) {
            price = 6;
        } else {
            price = 7;
        }
        return price;
    }
}
