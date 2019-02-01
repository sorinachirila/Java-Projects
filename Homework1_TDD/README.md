# Homework1_TDD 
This repository contains a TDD Java project using junit 4.12 library.

# Project requirements
1. Create a class that will test the methods of a Stack
   - Name this class - CustomStackTest
2. Create the implementation of a Stack
   - Name this class - CustomStack
3. Methods that will be tested
   - empty() - test if stack is empty 
   - peek() - returns the object from the top of the Stack WITHOUT removing it from the stack
   - pop() - returns the object fro the top of the stack AND REMOVE it from the stack
      - make a test function for a stack with one element 
      - make a test function for a stack with more elements (2 elements should be enough)
   - push() - add an object to the top of the stack (and return it)
   - search(object) - search an object inside a stack and return its position. If object is not fond, -1 is returned
      - make a test function for searching in a stack with one element
      - make a test function for searching in a stack with more elements (2 should be enough)
      - make a test function to test if -1 is returned when object is not found
4. Name methods having in mind 'GIVEN - WHEN - THEN' style

**TDD class**
- CustomStack
  - CustomStackTest

