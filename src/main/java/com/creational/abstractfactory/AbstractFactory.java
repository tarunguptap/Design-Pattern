package com.creational.abstractfactory;

import com.creational.abstractfactory.inf.Printer;
import com.creational.abstractfactory.inf.Shape;

public abstract class AbstractFactory {
	public abstract Printer getPrinter(String type);
	public abstract Shape getShape(String shape) ;
}
