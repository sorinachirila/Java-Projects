package inheritance;

public class Main {
    public static void main(String[] args) {
        // inheritance

        //1
        //create a new Animal instance
        Animal lion = new Animal(3, 4,false);
        //print with getters
        //age
        System.out.println("Current lion has: " + lion.getAge() + " years, " + lion.getNumberOfLegs() + " legs" );
        //vegetarian
        System.out.println("Is vegetarian? " + lion.getVegetarian());
        //2
        //create a new Dog instance
        Dog Terra = new Dog("black", 3, 4, false);
        System.out.println("This dog is " + Terra.getColor() + " and is " + Terra.getAge() + " years old and has " + Terra.getNumberOfLegs()+" legs.");
        System.out.println("Is vegetarian? " + Terra.getVegetarian());
       // 3
        Animal dog = new Dog("black", 10, 4,true );
        //print with getters
        System.out.println("A " + ((Dog) dog).getColor() + " dog: " + dog.getAge() + " years, " + dog.getNumberOfLegs() + " legs");
        System.out.println("Is vegetarian? " + dog.getVegetarian());
        //4
        //a
        Terra.bark(); //ham ham
        //b
        ((Dog) dog).bark(); //ham ham
        //7
        Animal tiger = new Animal(10, 4, false);
        Animal dalmatian = new Dog("whiteBlack", 12, 4, false);
        //a
        System.out.println(tiger.toString()); //Age: 10 Number of legs: 4 Is vegetarian? false
        System.out.println(dalmatian.toString());//Age: 12 Number of legs: 4 Is vegetarian? false Color: whiteBlack
        //8
        System.out.println();
        //a. - Animal object
        displayAnimalDetails(tiger); //Age: 10 Number of legs: 4 Is vegetarian? false
        //b. - Dog object
        displayAnimalDetails(dalmatian);//Age: 12 Number of legs: 4 Is vegetarian? false Color: whiteBlack

    }

    public static void displayAnimalDetails(Animal animal){
        System.out.println(animal.toString());
    }
}
