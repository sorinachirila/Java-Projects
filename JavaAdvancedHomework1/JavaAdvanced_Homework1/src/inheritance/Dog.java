package inheritance;

public class Dog extends Animal{

    //declare necessary fields
    private String color;

    //constructor with parameters
    public Dog(String color, Integer age, Integer numberOfLegs, Boolean vegetarian ){
        super(age, numberOfLegs, vegetarian);
        this.color = color;
    }

    //getter + setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //bark method
    public void bark(){
        System.out.println("ham ham");
    }
    //6
    @Override
    public String toString(){return super.toString() + " Color: " + color;}


}
