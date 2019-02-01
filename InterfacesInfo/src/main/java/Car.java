public class Car implements Info, IStartable {

    //define necessary fields
    private String model;
    private String licensePlate;

    //constructor
    public Car(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
    }

    //getters
    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void start() {
        System.out.println("The car " + this.getModel() + " state is: START...");
    }

    public void doSomething() {
        System.out.println("The car " + this.getModel() + " state is: DOING BUSINESS ON THE ROAD...");
    }

    public void stop() {
        System.out.println("The car " + this.getModel() + " state is: STOP...");
    }

    public void showInfo() {
        System.out.println("Car: " + this.getModel() + " has license plate: " + this.getLicensePlate());
    }
}
