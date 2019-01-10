package garage;

import java.util.ArrayList;
import java.util.List;

public class Garage<T> {
    //Generics
//    private T object;
//
//    public Garage(T object) {
//        this.object = object;
//    }
//
//    public T getObject(){
//        return this.object;
//    }

    private List<T> vehicles;

    public Garage(){
        this.vehicles = new ArrayList<>();

    }

    public void addVehicle(T vehicle){
        vehicles.add(vehicle);
    }
}

