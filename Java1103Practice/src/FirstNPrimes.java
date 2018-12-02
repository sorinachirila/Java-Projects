import javax.sound.midi.Soundbank;
import java.security.SignedObject;
import java.util.Scanner;

public class FirstNPrimes {

    public static void main(String[] args) {

//        Tema1.E8.
//        Realizati un program java ce afiseaza primele n numere PRIME din sirul numerelor naturale.
//        Sa-mi spuneti ce diferenta notam intre rezolvarile problemelor 7 si 8.


        System.out.println("First N primes:");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 2;
        int nrPrimesFound = 0;
        while(nrPrimesFound < n){
            boolean isPrime = true;
            int possibleDivisor = 2;
            while(possibleDivisor <= 2 && isPrime){
                if(i % possibleDivisor == 0){
                    isPrime = false;
                }
                possibleDivisor++;
                if(isPrime){
                    System.out.println(i + " ");
                    nrPrimesFound++;
                }
                i++;
            }
        }


    }

}
