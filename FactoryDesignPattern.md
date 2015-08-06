# Factory & Abstract Factory Design Pattern :
## Problems : 
   Some time our application or framework will not know that what kind of object it has to create at run-time it knows only the interface or abstract class and as we know we can not create object of interface or abstract class so main problem is frame work knows when it has to create but don't know what kind of object.
   
## Solution :  
   Factory pattern solve this problem very easily by model an interface for creating an object which at creation time can let its subclasses decide which class to instantiate, Factory Pattern promotes loose coupling by eliminating the need to bind application-specific classes into the code. The factory methods are typically implemented as virtual methods, so this pattern is also referred to as the Virtual Constructor. These methods create the objects of the products or target classes.
   
## Factory & Abstract Factory Design Pattern :
   Both Abstract Factory and Factory design pattern are creational design pattern and use to decouple clients from creating object they need, But there is a significant difference between Factory and Abstract Factory design pattern
   
### Factory Design Pattern :  
   Factory design pattern produces implementation of Products e.g. Garment Factory produce different kinds of clothes.
   
### Abstract Factory design pattern : 
   Abstract Factory design pattern adds another layer of abstraction over Factory Pattern and Abstract Factory implementation itself e.g. Abstract Factory will allow you to choose a particular Factory implementation based upon need which will then produce different kinds of products.
   
## When to use Factory design pattern in Java : 
   a. Static Factory methods are common in frameworks where library code needs to create objects of types which may be sub classed by applications using the framework.
   b. Some or all concrete products can be created in multiple ways, or we want to leave open the option that in the future there may be new ways to create the concrete product.
   c. Factory method is used when Products don't need to know how they are created.

In short
	1) Abstract Factory design pattern  creates Factory
	2) Factory design pattern creates Products i.e where we have to create an object of any one of sub-classes depending on the data provided.

