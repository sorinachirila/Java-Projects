import java.util.Scanner;

public class ForFibonnaci {
    public static void main(String[] args) {
//
//        Tema1.E9.
//        Realizati un program ce calculeaza primele n valori din sirul lui Fibonacci.
//        https://en.wikipedia.org/wiki/Fibonacci_number


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n ; i++) {
            int sum = a + b;
            System.out.print(a + " ");
            a = b;
            b = sum;
            //System.out.println(sum + " ");
        }


    }
}
