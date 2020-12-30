package com.iverson.model.strategy.promotion;

/**
 * @program: delegate
 * @author: ouguoxin
 * @create: 2020-12-28 14:37
 **/

public class EmptyStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}

