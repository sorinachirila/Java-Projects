import java.util.Scanner;

public class ValoareMaiMareDecatZero {
    public static void main(String[] args) {
        //Tema2.E2.
        // Realizati un proiect Java ce citeste de la tastatura un array (dimensiune + valori,
        // cum s-a facut pana acum) si apoi, afiseaza elementele cu o valoare mai mare decat 0.
        //Daca se poate inlocuiti 0 cu un numar citit tot de la tastatura.

        //Scanner pentru a citi de la tastatura numerele necesare
        Scanner scanner = new Scanner(System.in);

        //citire dimensiune array
        System.out.println("Dati dimensiunea array-ului: ");
        int n = scanner.nextInt();

        //declarare si instantiere vector
        int[] valoareMare = new int[n];

        //citire valori array
        System.out.println("Citesc valori array: ");
        for (int i = 0; i < n; i++) {
            valoareMare[i] = scanner.nextInt();
        }
        //citesc numarul ce-l compar cu valoarea din array
        System.out.println("Dati numarul de comparat: ");
        int numarComparare = scanner.nextInt();

        //afisare valori mai mari ca zero sau un numar citit
        System.out.println("Numerele din array, mai mari ca (zero) un numar dat: ");
        for (int i = 0; i < n; i++) {
            if(valoareMare[i] > numarComparare){
                System.out.print(valoareMare[i] + " ");
            }

        }


    }
}
