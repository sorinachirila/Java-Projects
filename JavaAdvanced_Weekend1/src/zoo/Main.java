package zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog(true, 2, "negru");
////        Animal is moving...
////        Age: 2 Color: negru
//        dog.move();
//        System.out.println(dog.toString());
//        //after modification of toString()
//        System.out.println(dog.toString());
//        //Age: 2 Color: negruIsFighting: true
//        //cat
//        Cat cat = new Cat(9, 4, "alb");
//        cat.move();
//        System.out.println(cat.toString());
//        //fish
//        Fish fish = new Fish(20, 5, "negru");
//        fish.move();
//        System.out.println(fish.toString());
//
//        //polimorfism - runtime
//        Animal a1 = new Cat(9, 5, "white");
//        System.out.println(cat.getClass()); // class zoo.Cat
//        System.out.println(cat.toString()); //call from cat
//         //a1.jump();
//        ((Cat) a1).jump();
//        Animal a2 = new Dog(true, 6, "black");
//        System.out.println(dog.getClass()); //class zoo.Dog
//        ((Cat)a2).jump(); //zoo.Dog cannot be cast to zoo.Cat

        //lists - Generics -- polimorfism
        List<Animal> animals  = new ArrayList<>();
        animals.add(new Cat(10, 4, "black"));
        animals.add(new Cat(11, 4, "black"));
        animals.add(new Cat(12, 4, "black"));
        animals.add(new Cat(13, 6, "white"));
        animals.add(new Dog(true, 6, "white"));
        animals.add(new Dog(false, 6, "black"));
        animals.add(new Dog(true, 6, "white"));

        for(Animal a: animals){
            a.sound();
        }

//        for(Animal a: animals){
//            System.out.println(a.healthCheck());
//        }

    }
}
