package com.structural.facade.example1.inf.impl;

import com.structural.facade.example1.inf.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }

}
