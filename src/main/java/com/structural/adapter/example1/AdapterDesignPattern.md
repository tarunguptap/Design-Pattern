# Adapter Design Pattern :
Adapter design pattern is one of the structural design pattern and it’s
used so that two unrelated interfaces can work together. The object that joins
these unrelated interface is called an Adapter. As a real life example, we
can think of a mobile charger as an adapter because mobile battery needs 3
volts to charge but the normal socket produces either 120V (US) or 240V
(India). So the mobile charger works as an adapter between mobile charging
socket and the wall socket.

We have class volt , class socket which produces 120volt, Now we want to build 
an adapter that can produce 3 volts, 12 volts and default 120 volts. 
So first of all we will create an SocketAdapterInf interface with these
methods.
While implementing Adapter pattern, there are two approaches – class
adapter and object adapter, however both these approaches produce same
result.
1. Class Adapter – This form uses java inheritance and extends the
source interface, in our case Socket class.
2. Object Adapter – This form uses Java Composition and adapter
contains the source object.