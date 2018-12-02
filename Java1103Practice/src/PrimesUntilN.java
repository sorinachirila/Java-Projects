import java.util.Scanner;

public class PrimesUntilN {

    public static void main(String[] args) {

//        Tema1.E7.
//        Realizati un program java ce afiseaza numerele prime din sirul numerelor naturale pana la 1000.
//        Sau, pana la o valoare n citita la consola.
        System.out.println(("Primes until n: "));
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 2;

        while(i <= n){

            boolean isPrime = true;

            int possibleDivisor = 2;
            while(possibleDivisor <= i/2 && isPrime){
                if(i % possibleDivisor == 0){
                    isPrime = false;
                }
                possibleDivisor++;
            }
            if(isPrime){
                System.out.print(i + " ");
            }

            i++;
        }

    }
}
