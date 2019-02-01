public class Camera implements Info, IStartable {

    //define necessary members
    private String model;
    private String serialNumber;

    //constructor
    public Camera(String model, String serialNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
    }

    //getters
    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void start() {
        System.out.println("The camera " + this.getModel() + " state is: ON...");
    }

    public void doSomething() {
        System.out.println("The camera " + this.getModel() + " is in state: OF DOING SMTH...");
    }

    public void stop() {
        System.out.println("The camera " + this.getModel() + " is: OFF...");
    }

    public void showInfo() {
        System.out.println("Camera: " + this.getModel() + " has serial number: " + this.getSerialNumber());
    }
}
