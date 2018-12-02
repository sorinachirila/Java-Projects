import java.util.Scanner;

public class NrPrimeArray {
    public static void main(String[] args) {
//        Tema2.E7.
//        Cititi un array de numere.
//        Realizati un program ce afiseaza pentru fiecare numar din array daca este prim sau nu.

        Scanner scanner = new Scanner(System.in);

        //citesc dimensiunea array-ului
        System.out.println("Dati dimensiunea vectorului: ");
        int n = scanner.nextInt();

        //declar si instantiez  vectorul
        int [] a = new int [n];

        //citesc valorile vectorului a
        System.out.println("Dati valorile vectorului: ");
        for (int i = 0; i < n ; i++) {
            a[i] = scanner.nextInt();
        }

        //afisare valori din a
        System.out.println("Afisare vector: ");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        //testez elemente prime vector
        for (int i = 0; i < a.length; i++) {
            boolean estePrim = true;

            for (int j = 2; j < a[i]/2; j++) {
                if (a[i]%j == 0) {
                    estePrim = false;
                    break;
                }
            }

            if(estePrim){

                System.out.println(a[i] + " este prim");}
            else{
                System.out.println(a[i] + " nu este prim");}
        }

    }
}


