package carRetail;

public class Main {
    public static void main(String[] args) {
        //object instantiation
        Car c = new Car("Nissan", "blue", 15000);
        //getter
        System.out.println(c.getColor());
        //setter
        c.setColor("black");
        System.out.println(c.getColor());

        c.toString();

        //object instantiation Owner
        Owner owner = new Owner(new Name("Andrei", "Alex", "Popescu"), new Address("Iasi", "Petre Andrei", 9));
        System.out.println(owner);
        //getter
        System.out.println(owner.getName()); //carRetail.Name@4554617c - adresa de memorie
        System.out.println(owner.getName().getFirstName()); //Andrei
    }
}
