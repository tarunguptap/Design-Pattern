package com.structural.facade.example1.facade;

import com.structural.facade.example1.inf.Shape;
import com.structural.facade.example1.inf.impl.Circle;
import com.structural.facade.example1.inf.impl.Rectangle;
import com.structural.facade.example1.inf.impl.Square;

public class ShapeMakerFacade {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    public ShapeMakerFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
