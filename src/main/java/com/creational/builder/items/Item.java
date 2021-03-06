package com.creational.builder.items;

import com.creational.builder.packing.Packing;

public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
