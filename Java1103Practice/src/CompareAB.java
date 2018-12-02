import java.util.Scanner;

public class CompareAB {

    public static void main(String[] args) {

//        Tema1.E1.
//        Realizati un program ce determina maximul dintre 2 numere

        Scanner scanner = new Scanner(System.in);
        //citesc cele doua numere
        int a = scanner.nextInt();
        int b = scanner.nextInt();
       //compar cele doua numere si afisez maximul
        if(a > b){
            System.out.println("a este mai mare ca b");
        } else {
            System.out.println("b este mai mare ca a");
        }
    }


}
