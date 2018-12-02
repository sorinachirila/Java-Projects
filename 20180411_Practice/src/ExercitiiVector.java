import java.util.Scanner;

public class ExercitiiVector {
    public static void main(String[] args) {
//        Tema2.S3.
//        Cititi un array de numere de la consola.
//        a. Convertiti fiecare numar din array la valoarea lui la patrat.
//        Afisati array-ul.
//        b. Construiti un array separat (aSquared) cu valoarea numerelor la puterea 2.
//        Construiti un array separat (aCubed) cu valoarea numerelor la puterea 3.
//        Afisati array-ul aSquared si array-ul aCubed.

        Scanner scanner = new Scanner(System.in);

        //citesc dimensiunea array-ului
        System.out.println("Dati dimensiunea vectorului: ");
        int n = scanner.nextInt();

        //declar si instantiez  vectorul
        int[] a = new int[n];

        //citesc valorile vectorului a
        System.out.println("Dati valorile vectorului: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        //afisare valori din a
        System.out.println("Afisare vector: ");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);

        }

        //valori la patrat in vector
        System.out.println("Valori la patrat in vector: ");
        for (int i = 0; i < n; i++) {
           // a[i] = a[i] * a[i];
            System.out.print(a[i]*a[i] + " ");
        }

        //afisare valori din a
//        System.out.println("Afisare vector: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i] + " ");
//
//        }

        int[] aSquared = new int[n];
        for (int i = 0; i < aSquared.length; i++) {
            aSquared[i] = a[i]*a[i];

        }
        //afisare valori din aSquared
        System.out.println("Afisare vector aSquared: ");
        for (int i = 0; i < n; i++) {
            System.out.print(aSquared[i] + " ");
        }
//        //valori la puterea a 3-a in vector
        int [] aCubed = new int[n];
        System.out.println("Valori la puterea a treia in vector: ");
        for (int i = 0; i < n; i++) {
            aCubed[i] = a[i] * a[i] * a[i];
        }
        //afisare valori din aCubed
        System.out.println("Afisare vector aCubed: ");
        for (int i = 0; i < n; i++) {
            System.out.print(aCubed[i] + " ");
        }


    }
}
