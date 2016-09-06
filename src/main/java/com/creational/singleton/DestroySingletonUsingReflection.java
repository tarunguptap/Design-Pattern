package com.creational.singleton;

import java.lang.reflect.Constructor;

public class DestroySingletonUsingReflection {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Singleton_EagerInitialization instanceOne =
				Singleton_EagerInitialization.getInstance();
		Singleton_EagerInitialization instanceTwo = null;
		try {
			Constructor[] constructors =
					Singleton_EagerInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (Singleton_EagerInitialization)constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
