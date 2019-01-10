package garage;

public class Car extends Vehicle {

    public Car(Integer speed){
        super(speed);
    }

    @Override
    public void speedUp(Integer value) {
        this.setSpeed(this.getSpeed() + value);
        System.out.println("Car speed up by " + value);
    }


    @Override
    public void breakDown(Integer value) {
        this.setSpeed(this.getSpeed() - value);
        System.out.println("Car speed down by " + value);
    }
}
