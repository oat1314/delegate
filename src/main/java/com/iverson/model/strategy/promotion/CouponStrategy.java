package com.iverson.model.strategy.promotion;

/**
 * @program: delegate
 * @author: ouguoxin
 * @create: 2020-12-28 14:37
 **/

public class CouponStrategy implements PromotionStrategy{


    @Override
    public void doPromotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}

