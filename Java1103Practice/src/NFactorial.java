import java.util.Scanner;

public class NFactorial {
    public static void main(String[] args) {
//        Tema1.E3.
//        Calculati intr-un program java valoarea N! pentru o valoare n

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int nFactorial = 1;
        int i = 1;
        while(n > 0){
            nFactorial *= n;
            n -= 1;
        }
        System.out.println(nFactorial);
    }
}
