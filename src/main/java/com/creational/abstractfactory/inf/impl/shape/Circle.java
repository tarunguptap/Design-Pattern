package com.creational.abstractfactory.inf.impl.shape;

import com.creational.abstractfactory.inf.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}

}
