package com.creational.builder;

import com.creational.builder.items.burger.ChickenBurger;
import com.creational.builder.items.burger.VegBurger;
import com.creational.builder.items.colddrink.Coke;
import com.creational.builder.items.colddrink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

     public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
