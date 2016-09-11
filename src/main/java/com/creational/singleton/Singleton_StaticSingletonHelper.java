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

public class Singleton_StaticSingletonHelper {
	private Singleton_StaticSingletonHelper() {
		
	}

	private static class SingletonHelper {
		private static final Singleton_StaticSingletonHelper INSTANCE = new
				Singleton_StaticSingletonHelper();
	}
	
	public static Singleton_StaticSingletonHelper getInstance(){
		return SingletonHelper.INSTANCE;
	}

}
