package zoo;

public class Fish extends Animal{

    //define members
    private Integer nrScale;

    //constructor
    public Fish(Integer nrScale, Integer age, String color){
        super(age, color);
        this.nrScale = nrScale;
    }
    @Override
    public void move(){
        System.out.println("Fish is swimming...");
    }

    @Override
    public void sound() {
        System.out.println("aquaman");
    }

    @Override
    public Integer healthCheck() {
        return nrScale;
    }

    @Override
    public String toString() {
        return super.toString() + " nrScale: " + nrScale;
    }
}
