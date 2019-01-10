package inheritance;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Animal {

    //declare necessary fieldd
    private Integer age;
    private Integer numberOfLegs;
    private Boolean vegetarian;

    //constructor with 3 parameters
    public Animal(Integer age, Integer numberOfLegs, Boolean vegetarian){
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.vegetarian = vegetarian;
    }

    //getters and setters for the fields
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    //method eat() with specific output display
    public void eat(){
        System.out.println("Animal is eating");
    }
   //5
    @Override
    public String toString() {return "Age: " + age + " Number of legs: " + numberOfLegs + " Is vegetarian? " + vegetarian;}

}
