package com.creational.singleton;
/*Creational design patterns provide solution to instantiate an object in the best
possible way for specific situations.*/

/*Singleton pattern restricts the instantiation of a class and ensures that only
one instance of the class exists in the java virtual machine.*/

/* The below implementation works fine in case of single threaded
environment but when it comes to multithreaded systems, it can cause issues
if multiple threads are inside the if loop at the same time. It will destroy the
singleton pattern and both threads will get the different instances of
singleton class. So we can have thread safe singleton class*/

public class Singleton_LazyInitialization {
	private static Singleton_LazyInitialization instance;

	private Singleton_LazyInitialization(){
		
	}
	public void displayHash(){
		System.out.println(this.hashCode());
	}
	static public Singleton_LazyInitialization getInstance(){
		if(instance==null){
			instance=new Singleton_LazyInitialization();
		}
		return instance;
	}
	public static void main(String[] args) {
		Singleton_LazyInitialization.getInstance().displayHash();
	}

}
