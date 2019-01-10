package zoo;

public class Cat extends Animal {

    //define members
    private Integer nrLives;

    //constructor
    public Cat(Integer nrLives, Integer age, String color){
        super(age, color);
        this.nrLives = nrLives;
    }
    @Override
    public void move(){
        System.out.println("Cat is walking...");
    }

    @Override
    public void sound() {
        System.out.println("miau miau");
    }

    @Override
    public Integer healthCheck() {
        return nrLives;
    }

    @Override
    public String toString() {
        return super.toString() + " nrLives: " + nrLives;
    }

    public void jump(){
        System.out.println("Cat is jumping...");
    }
}
