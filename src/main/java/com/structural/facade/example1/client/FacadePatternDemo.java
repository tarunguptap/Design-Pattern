package com.structural.facade.example1.client;

import com.structural.facade.example1.facade.ShapeMakerFacade;

public class FacadePatternDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ShapeMakerFacade shapeMaker = new ShapeMakerFacade();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
