package com.behavioral.strategy.example;

public class TestPurchase {

    public static void main(String[] args) {

        Item item = new Item();
        item.purchase("table", "debitCard");

        StrategicItem strategicItem = new StrategicItem();
        strategicItem.purchase("table", new DebitCard());
        /*
         * the above can also be done by initializing payment method when StrategicItem is initialized and changing the
         * purchase() method signature to have only item. this is not a good practice as this contradicts the statement
         * of strategy design pattern that client should be able to choose from any algorithm implementation at runtime
         */

    }

}
