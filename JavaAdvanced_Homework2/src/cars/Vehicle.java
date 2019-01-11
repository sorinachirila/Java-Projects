package cars;

public abstract class Vehicle {

    //define necessary fields
    private int speed;
    private int gear;

    //constructors
    public Vehicle(){
        this.speed = 0;
        this.gear = 0;
    }

    public Vehicle(Integer speed, Integer gear){
        this.speed = speed;
        this.gear = gear;
    }
     //getters, setters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public abstract void printState();


    //asta e un fel de setter??????
    public void changeGear(int newGear){
        gear = newGear;
    }

    public void speedUp(int increment){
        speed += increment;
    }
     public  void applyBrakes(int decrement){
        if(speed > 0){
            speed -= decrement;
        }
     }

}
