package garage;

public class Main {
    public static void main(String[] args) {

        Garage<Car> garage = new Garage<>();
        garage.addVehicle(new Car(100));

        Garage<Bike> garageBike = new Garage<>();
        garageBike.addVehicle(new Bike(10));

    }






}
