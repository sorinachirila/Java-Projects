package cars;

public class Bus  extends Vehicle{

   //constructors
    public Bus(){
        super();
    }

    public Bus(int speed, int gear){
        super(speed, gear);
    }


    @Override
    public void printState() {
        System.out.println("Bus state:  .. is in the parking lot. Gear is.... " + getGear());
    }
}
