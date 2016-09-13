package com.creational.abstractfactory.factory;

import com.creational.abstractfactory.AbstractFactory;
import com.creational.abstractfactory.inf.Printer;
import com.creational.abstractfactory.inf.Shape;
import com.creational.abstractfactory.inf.impl.printer.PaperPrinter;
import com.creational.abstractfactory.inf.impl.printer.ScreenPrinter;
import com.creational.abstractfactory.inf.impl.printer.WebPrinter;

public class PrinterFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Printer getPrinter(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("paper")) {
			return new PaperPrinter();
		} else if (type.equalsIgnoreCase("web")) {
			return new WebPrinter();
		} else if (type.equalsIgnoreCase("Screen")) {
			return new ScreenPrinter();
		}
		return null;
	}

}
