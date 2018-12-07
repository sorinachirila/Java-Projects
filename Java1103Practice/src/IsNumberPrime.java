import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
//        Tema1.E5.
//        Realizati un program java ce determina daca un numar n este prim sau nu si afiseaza la consola mesajul corespunzator.


        System.out.println("Please, give a number: ");
        Scanner scanner = new Scanner(System.in);
        //citesc numarul pentru care fac verficarea de Prim
        int n = scanner.nextInt();
        boolean isPrime = true;
        int possibleDivisor = 2;

        while(possibleDivisor <= 2 && isPrime){
                if(n % possibleDivisor == 0){
                    isPrime = false;
                }
                possibleDivisor++;
                if(isPrime){
                    System.out.println(n + ", is prime number! ");
                }else{
                    System.out.println(n + ", is not a prime number! ");
                }
            }

    }

}
