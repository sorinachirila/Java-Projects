import java.util.Scanner;

public class CalculPitagora{
    public static void main(String[] args){
//        Tema2.S1.
//        Pitagora: a² + b² = c².
//        Cititi doua numere a si b si afisati c².

        Scanner sc = new Scanner(System.in);
        //citesc doua numere de la tastatura
        System.out.println("Dati primul numar: ");
        int a = sc.nextInt();
        System.out.println("Dati cel de-al doilea numar: ");
        int b = sc.nextInt();

        //rezultat calcul Pitagora
        int cPatrat;
        cPatrat = a*a + b*b;
        System.out.println("Pitagora calcul: " + cPatrat);


    }
}
