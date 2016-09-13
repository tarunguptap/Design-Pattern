package com.creational.abstractfactory.inf.impl.printer;

import com.creational.abstractfactory.inf.Printer;

public class PaperPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("paper");
	}

}
