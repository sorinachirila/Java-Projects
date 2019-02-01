public class Person implements Info{

    //define necessary memebers
    private String name;
    private String CNP;

    //constructor
    public Person(String name, String CNP) {
        this.name = name;
        this.CNP = CNP;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getCNP() {
        return CNP;
    }
    // method
    public void showInfo() {
        System.out.println("Person: " + this.getName() + " has CNP: " + this.getCNP());
    }
}
