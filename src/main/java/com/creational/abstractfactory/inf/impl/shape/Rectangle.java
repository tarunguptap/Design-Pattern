package com.creational.abstractfactory.inf.impl.shape;

import com.creational.abstractfactory.inf.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}
