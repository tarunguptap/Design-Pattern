# Facade Design Pattern :
   1. Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system
   2. This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.

   
# Common Mistakes while Implementing Facade Design Pattern :
   a. just for the sake of introducing a facade layer developers tend to create additional classes. Layered architecture is good but assess the need for every layer. Just naming a class as ABCDFacade.java doesn’r really make it a facade.
   b. Creating a java class and ‘forcing’ the UI to interact with other layers through it and calling it a facade layer is one more popular mistake. Facade layer should not be forced and its always optional. If the client wishes to interact with components directly it should be allowed to bypass the facade layer.
   c. Methods in facade layer has only one or two lines which calls the other components. If facade is going to be so simple it invalidates its purpose and clients can directly do that by themselves.
   d. A controller is not a facade
   e. Facade is ‘not’ a layer that imposes security and hides important data and implementation.
   f. Subsystems are not aware of facade and there should be no reference for facade in subsystems.

# Summary of Facade Design Pattern
   a. Facade provides a single interface.
   b. Programmers comfort & Simplicity is the aim of facade pattern.
   c. Facade design pattern is used for promoting subsystem independence and portability.
   d. Subsystem may be dependent with one another. In such case, facade can act as a coordinator and decouple the dependencies between the subsystems.
   
##### Facade Design Pattern : The facade pattern is used when you want to hide an implementation or it is about changing interface of some class or set of classes. Builder hides the process of construction by decomposing it in smaller steps.

##### Abstarct factory pattern : Abstarct factory pattern is used when you want to hide the details on constructing instances.Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
	
##### Facades are all around us in the real world.  Operating systems are one such example - you don't see all the inner workings of your computer, but the OS provides a simplified interface to use the machine. 
	
##### Lets take a car, starting a car involves multiple steps. Imagine how it would be if you had to adjust n number of valves and controllers. The facade you have got is just a key hole. On turn of a key it send instruction to multiple subsystems and executes a sequence of operation and completes the objective. All you know is a key turn which acts as a facade and simplifies your job.
   
## Facade Example :
	/* Complex parts */

	class CPU {
    public void freeze() { ... }
    public void jump(long position) { ... }
    public void execute() { ... }
	}

	class Memory {
    public void load(long position, byte[] data) { ... }
	}

	class HardDrive {
    public byte[] read(long lba, int size) { ... }
	}

	/* Facade */

	class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
	}
