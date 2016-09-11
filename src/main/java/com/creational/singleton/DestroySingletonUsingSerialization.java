package com.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DestroySingletonUsingSerialization implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private DestroySingletonUsingSerialization(){
		
	}
	private static class SingletonHelper{
		private static final DestroySingletonUsingSerialization instance = new
				DestroySingletonUsingSerialization();
	}
	public static DestroySingletonUsingSerialization getInstance(){
		return SingletonHelper.instance;
	}
	
	protected static Object readResolve() {
		return getInstance();
	}
	
	public static void main(String[] args) throws
	FileNotFoundException, IOException, ClassNotFoundException {
		
		DestroySingletonUsingSerialization instanceOne = DestroySingletonUsingSerialization.getInstance();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();
		
		//deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		DestroySingletonUsingSerialization instanceTwo = (DestroySingletonUsingSerialization)in.readObject();
		in.close();
		
		System.out.println("instanceOne hashCode="+instanceOne.hashCode());
		System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
		
		/**
		 * To overcome this we will give the implementation of readResolve 
		 */
		
	}
}
