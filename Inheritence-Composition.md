# Inheritence & Composition :

## Inheritence : 
   a. In Inheritance, a new class, which wants to reuse code, inherit an existing class, known as super class. This new class is then known as sub class.
   b. The inhertence relationship is referred as "IS-A" relationship because in this simple example, class Apple is related to class Fruit by inheritance
   c. If sub class is depending on super class behavior for its operation, it suddenly becomes fragile.
e.g :

	class Fruit {
	
	}
	class Apple extends Fruit {
	
	//... }

## Composition :
   a. On composition, a class, which desire to use functionality of an existing class, doesn't inherit, instead it holds a reference of that class in a member variable, that’s why the name composition.
   b. The composition relationship is referred as "HAS-A" relationship because in the example above, class Apple is related to class Fruit by composition, because Apple has an instance variable that holds a reference to a Fruit object.
e.g :

	class Fruit {

	//... }
	class Apple {

		private Fruit fruit = new Fruit(); //... 

	}
   In this example, Apple is called the front-end class and Fruit is called the back-end class. In a composition relationship, the front-end class holds a reference in one of its instance variables to a back-end class.

