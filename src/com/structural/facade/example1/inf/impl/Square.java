package com.structural.facade.example1.inf.impl;

import com.structural.facade.example1.inf.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }

}
