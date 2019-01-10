package zoo;

public class Dog extends Animal {

    //define member variables
   private Boolean isFighting;

   public Dog(Boolean isFighting, Integer age, String color){
       //constructor from base class/Animal - called, and also the methods - super
       super(age, color);
       this.isFighting = isFighting;
   }

   @Override
    public void move(){
        System.out.println("Dog is moving...");
    }

    @Override
    public void sound() {
        System.out.println("Bark bark");
    }

    @Override
    public Integer healthCheck() {
       if(this.getAge() < 3) {
           return 10;
       }
        return 5;
    }

    @Override
    public String toString(){
       return super.toString() + "IsFighting: " + isFighting;
   }




}
