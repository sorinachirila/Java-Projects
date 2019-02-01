# Interfaces
This repository contains a project made with:
 - Java,
 - Maven.

# Project requirements
1. Add an interface Info with one method 
   - void showInfo()
2. Add an interface IStartable with three methods 
   - void start()
   - void doSomething()
   - void stop()
3. Add a class Person (with two fields) that implements Info 
   - private String name
   - private String CNP
4. Add a class Car (with two fields) that implements Info, IStartable
   - private String model 
   - private String licensePlate
5. Add a class Camera (with two fields) that implements Info, IStartable
   - private String model 
   - private String serialNumber
6. Add a class Application that contains main method that will have:
   - sout(“\n=== PERSONS ===");
   - Person person1 = new Person("John", "10203040");
   - Person person2 = new Person("Mary", "90807060");
     - person1.showInfo();
     - person2.showInfo();
     - sout(“\n=== CAMERAS ===");
   - Camera camera1 = new Camera("Canon", "12345");
   - Camera camera2 = new Camera("Nikon", "67890");
     - camera1.showInfo();
     - camera1.start();
     - camera1.doSomething();
     - camera1.stop();
     - camera2.showInfo();
         - sout(“\n=== CARS ===");
   - Car car1 = new Car("BMV", "B-10-ABC");
   - Car car2 = new Car("Audi", "IS-20-XYZ");
     - car1.showInfo();
     - car1.start();
     - car1.doSomething();
     - car1.stop();
     - car2.showInfo();







