package com.iverson.model.strategy.promotion;

/**
 * @program: delegate
 * @author: ouguoxin
 * @create: 2020-12-28 14:39
 **/

public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        promotionStrategy.doPromotion();
    }
}

