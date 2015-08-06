package com.structural.facade.example1.inf.impl;

import com.structural.facade.example1.inf.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }

}
