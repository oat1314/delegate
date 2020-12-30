package com.iverson.model.strategy.promotion;

/**
 * @program: delegate
 * @author: ouguoxin
 * @create: 2020-12-28 14:40
 **/

public class PromotionActivityTest {
    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());

        activity618.execute();
        activity1111.execute();
    }

    //工厂模式
    //    public static void main(String[] args) {
//        String promotionKey = "GROUPBUY";
//        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
//        promotionActivity.execute();
//    }

}

