package com.creational.abstractfactory.inf.impl.printer;

import com.creational.abstractfactory.inf.Printer;

public class ScreenPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("Screen");
	}

}
