# Factory Design Pattern :
Factory design pattern is used when we have a super class with multiple subclasses
and based on input, we need to return one of the sub-class. This
pattern take out the responsibility of instantiation of a class from client
program to the factory class.

Super class in factory pattern can be an interface, abstract class or a normal
java class.

1. We can keep Factory class Singleton or we can keep the method that
returns the subclass as static.