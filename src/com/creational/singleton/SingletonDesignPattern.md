# Singleton Design Pattern :
Singleton pattern restricts the instantiation of a class and ensures that only
one instance of the class exists in the java virtual machine. The singleton
class must provide a global access point to get the instance of the class.
Singleton pattern is used for logging, driver objects, caching and thread
pool.
Singleton design pattern is also used in other design patterns like Abstract
Factory, Builder, Prototype, Facade etc. Singleton design pattern is used in
core java classes also, for example java.lang.Runtime, java.awt.Desktop.

## To implement Singleton pattern, we have different approaches but all of
them have following common concepts.
##* Private constructor to restrict instantiation of the class from other
classes.
##* Private static variable of the same class that is the only instance of the
class.
##* Public static method that returns the instance of the class, this is the
global access point for outer world to get the instance of the singleton
class.

### Eager initialization
In eager initialization, the instance of Singleton Class is created at the time
of class loading, this is the easiest method to create a singleton class but it
has a drawback that instance is created even though client application might
not be using it.
If your singleton class is not using a lot of resources, this is the approach to
use.
Also this method doesn’t provide any options for exception handling.

### Static block initialization
Static block initialization implementation is similar to eager initialization,
except that instance of class is created in the static block that provides option
for exception handling.

Both eager initialization and static block initialization creates the instance
even before it’s being used and that is not the best practice to use. So in
further sections, we will learn how to create Singleton class that supports
lazy initialization.

### Lazy Initialization
Lazy initialization method to implement Singleton pattern creates the
instance in the global access method.
This implementation works fine in case of single threaded
environment but when it comes to multithreaded systems, it can cause issues
if multiple threads are inside the if loop at the same time. It will destroy the
singleton pattern and both threads will get the different instances of
singleton class. So to avoid this we have thread safe singleton class.

### Thread Safe Singleton
The easier way to create a thread-safe singleton class is to make the global
access method synchronized, so that only one thread can execute this
method at a time. 