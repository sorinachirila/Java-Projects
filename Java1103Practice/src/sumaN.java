import java.util.Scanner;

public class sumaN {
    public static void main(String[] args) {
//        Tema1.E2.
//        Realizati un program Java ce calculeaza suma primelor n numere din sirul numerelor naturale.

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;

        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("suma primelor "+ n + " numere este: " + sum);


    }

}
