public class Application {
    public static void main(String[] args) {

        System.out.println("\n=== PERSONS ===");
        Person person1 = new Person("John", "10203040");
        Person person2 = new Person("Mary", "90807060");

        person1.showInfo();
        person2.showInfo();

        //=== PERSONS ===
        // Person: John has CNP: 10203040
       //  Person: Mary has CNP: 90807060

        System.out.println("\n=== CAMERAS ===");
        Camera camera1 = new Camera("Canon", "12345");
        Camera camera2 = new Camera("Nikon", "67890");

        camera1.showInfo();
        camera1.start();
        camera1.doSomething();
        camera1.stop();
        camera2.showInfo();

/*
        === CAMERAS ===
        Camera: Canon has serial number: 12345
        The camera Canon state is: ON...
        The camera Canon is in state: OF DOING SMTH...
        The camera Canon is: OFF...
        Camera: Nikon has serial number: 67890
*/
        System.out.println("\n=== CARS ===");
        Car car1 = new Car("BMV", "B-10-ABC");
        Car car2 = new Car("Audi", "IS-20-XYZ");

        car1.showInfo();
        car1.start();
        car1.doSomething();
        car1.stop();
        car2.showInfo();

/*        === CARS ===
        Car: BMV has license plate: B-10-ABC
        The car BMV state is: START...
        The car BMV state is: DOING BUSINESS ON THE ROAD...
        The car BMV state is: STOP...
        Car: Audi has license plate: IS-20-XYZ*/

    }
}
