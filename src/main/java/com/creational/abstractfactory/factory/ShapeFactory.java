package com.creational.abstractfactory.factory;

import com.creational.abstractfactory.AbstractFactory;
import com.creational.abstractfactory.inf.Printer;
import com.creational.abstractfactory.inf.Shape;
import com.creational.abstractfactory.inf.impl.shape.Circle;
import com.creational.abstractfactory.inf.impl.shape.Rectangle;
import com.creational.abstractfactory.inf.impl.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
	  if(shapeType == null){
	      return null;
      }    
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
	}
	
	@Override
	public Printer getPrinter(String type) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
