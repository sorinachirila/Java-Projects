package cars;

public class Main {
    public static void main(String[] args) {
        //2

        Truck  truck = new Truck();
        truck.changeGear(2);
        truck.speedUp(3);
        truck.applyBrakes(1);
        truck.printState();//Truck state: .... something like running.. Speed is:2

        System.out.println();

        Bus bus = new Bus();
        bus.changeGear(1);
        bus.speedUp(4);
        bus.applyBrakes(3);
        bus.printState();//Bus state:  .. is in the parking lot. Gear is.... 1


    }
}
