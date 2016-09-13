package com.creational.factory.example0;

import com.creational.factory.example0.inf.Shape;
import com.creational.factory.example0.inf.impl.shape.Circle;
import com.creational.factory.example0.inf.impl.shape.Rectangle;
import com.creational.factory.example0.inf.impl.shape.Square;


public class ShapeFactory {

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
}
