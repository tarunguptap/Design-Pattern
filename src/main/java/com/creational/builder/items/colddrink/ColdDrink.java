package com.creational.builder.items.colddrink;

import com.creational.builder.items.Item;
import com.creational.builder.packing.Bottle;
import com.creational.builder.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
