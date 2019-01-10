public class Person {


    public static Integer count = 0;
    //state
    String name;
    String cnp;

    //constructors
    //implicit - cand nu sunt alti constructori in clasa

    public Person(){
        name = "Andrei";
        cnp = "123456789";
        count = count + 1;
    }
    //another constructor
    public Person(String name, String cnp){
        //this - current instance
        this.name = name;
        this.cnp = cnp;
        count = count + 1;
    }

    //display current object state
    public void display() {
        System.out.println("Name: " + name + " cnp: " + cnp);
    }

    public void displayName(){
        System.out.println("Name: " + name);
        //displayCnp();
        //this.displayCnp();
        this.displayCnp();
    }

    public void displayName(String prefix){
        System.out.println("Name: " + prefix + name);
        //displayCnp();
        //this.displayCnp();
    }

    public void displayName(Integer prefix){
        System.out.println("Name: " + prefix + name);
        //displayCnp();
        //this.displayCnp();
    }
    private void displayCnp(){
        System.out.println("Cnp: " + cnp);
        //displayStatic();
    }

//    public void display2(){
//        this.display();
//    }
    public static void displayStatic(){
        //this, name nu sunt accesibile, sunt contexte diferite
       // System.out.println(this.name);

    }

    public Person returnInstance(){
        //return current instance
        return this;
    }


}
