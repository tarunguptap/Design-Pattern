package com.structural.adapter.example1;

public class Socket {
	public Volt getVolt(){
		return new Volt(120);
		}
	/**
	 * Now we want to build an adapter that can produce 3 volts, 12 volts and
default 120 volts. So first of all we will create an adapter interface with these
methods.
	 */
}
