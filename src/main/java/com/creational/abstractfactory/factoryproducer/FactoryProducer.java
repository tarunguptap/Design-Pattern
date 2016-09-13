package com.creational.abstractfactory.factoryproducer;

import com.creational.abstractfactory.AbstractFactory;
import com.creational.abstractfactory.factory.PrinterFactory;
import com.creational.abstractfactory.factory.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("Printer")) {
			return new PrinterFactory();
		}
		return null;
	}
}
