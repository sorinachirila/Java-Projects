import java.util.Scanner;

public class InversArray {
    public static void main(String[] args) {
        // Tema2.E1.
        //Realizati un proiect Java ce citeste de la tastatura dimensiunea unui array,
        // iar apoi array-ul si il afiseaza in ordinea inversa a elementelor.

        //Scanner pentru a citi de la tastatura numerele necesare
        Scanner scanner = new Scanner(System.in);

        //citesc dimensiune array
        System.out.println("Dati dimensiunea array-ului:");
        int n = scanner.nextInt();

        //declar si instantiez array
        int [] invers = new int [n];

        //citesc valori pentru invers
        for (int i = 0; i < n; i++) {
            invers[i] = scanner.nextInt();
        }

        System.out.println("Array-ul in ordine prestabilita:");
        //valori in ordine prestabilita
        for (int i = 0; i < n ; i++) {
            System.out.println(invers[i]);
        }
        //afisare vector in ordine inversa
        System.out.println("Array-ul in ordine inversa:");
        //afisare elemente in ordine inversa
        for (int i = n-1; i >=0 ; i--) {
            System.out.println(invers[i]);
        }

    }
}
