# Encapsulation:
1.  Create a class User with the following fields: username, firstName, lastName.
   - a.  Make the fields private
   - b.  Write getters and setters
   - c.  Write a constructor with 3 parameters
   - d.  Make the object immutable
   - e.  Write a public method generateDisplayName that returns a string with the full name of the user.
   
# Inheritance:

1.  Create a class Animal with the following fields: age, numberOfLegs, vegetarian.
   - a.  Write a constructor with parameters
   - b.  Write getters and setters
   - c.  Write a method called eat that will print the message "Animal is eating".
   - d.  Instantiate an Animal object and print using getters.
   
2.  Create a class Dog that extends class Animal
   - a.  Add private field color
   - b.  Write a constructor with parameters
   - c.  Write getters and setters
   - d.  Instantiate a Dog object and print using getters
   
3.  Instantiate a Dog object and assign it to an Animal instance.
4.  Create a new public method named "bark" in class Dog
   - a.  Call the method using the dog object
   - b.  Call the method using the animal object
5.  Override toString() method in class Animal
6.  Override toString() method in class Dog. In this implementation call the parent implementation.
7.  Instantiate 2 objects Animal and Dog and assign it to an Animal instance.
   - a.  Call toString() method for both objects.
8.  In the Main class create a method that receives an Animal object and print the details of that object.
   - a.  Call the method by passing an animal object
   - b.  Call the method by passing a dog object
