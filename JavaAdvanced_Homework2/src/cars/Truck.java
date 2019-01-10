package cars;

public class Truck  extends Vehicle{

    //constructors
    public Truck(){
        super();
    }

    public Truck(int speed, int gear){
        super(speed, gear);
    }

    @Override
    public void printState() {
        System.out.println("Truck state: .... something like running.. Speed is:" + getSpeed());
    }
}
