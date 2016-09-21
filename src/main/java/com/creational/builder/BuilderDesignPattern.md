# Builder Design Pattern :
## Problems : 
Builder design pattern is a creational design pattern like Factory Pattern
and Abstract Factory Pattern. This pattern was introduced to solve some
of the problems with Factory and Abstract Factory design patterns when the
Object contains a lot of attributes.
There are three major issues with Factory and Abstract Factory design
patterns when the Object contains a lot of attributes.
1. Too Many arguments to pass from client program to the Factory class
that can be error prone because most of the time, the type of
arguments are same and from client side it’s hard to maintain the
order of the argument.
2. Some of the parameters might be optional but in Factory pattern, we
are forced to send all the parameters and optional parameters need to
send as NULL.
3. If the object is heavy and its creation is complex, then all that
complexity will be part of Factory classes that is confusing.
  
## Solution :
Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

	A Builder class builds the final object step by step. This builder is independent of other objects.  
   