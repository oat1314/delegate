package com.iverson.model.strategy.promotion;

/**
 * @program: delegate
 * @author: ouguoxin
 * @create: 2020-12-28 14:37
 **/

public class CashbackStrategy implements PromotionStrategy{


    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}

