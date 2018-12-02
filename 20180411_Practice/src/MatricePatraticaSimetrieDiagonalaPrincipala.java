import sun.font.TrueTypeFont;

import java.util.Scanner;

public class MatricePatraticaSimetrieDiagonalaPrincipala {
    public static void main(String[] args) {
//        Tema2.E6.
//        Cititi o matrice patratica.
//        Realizati un algoritm ce determina daca matricea este simetrica fata de diagonala principala.
//        Afisati mesaj corespunzator.
//        1 2 3
//        2 1 2
//        3 2 1
//        matricea este simetrica
//        1 2 5
//        3 1 2
//        3 2 1
//        matricea nu este simetrica

        Scanner scanner = new Scanner(System.in);

        //citesc dimensiunea matricei
        System.out.println("Dati dimensiunea matricei: ");
        int n = scanner.nextInt();

        //declar si instantiez matrice patratica
        int[][] a = new int[n][n];


        //citesc valori in matrice
        System.out.println("Dati valori matrice: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        //afisez matricea
        System.out.println("Valorile matricei sunt: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //testare matrice simetrica fata de diagonala principala
        //relatia dintre i si j, i < j la elementele din partea superioara a diagonalei
        boolean esteSimetrica = true;
        for (int i = 0; i < n; i++) {  //i merge de la 0
            for (int j = n - 1 - i; j >= 0; j--) {  // j > i - sa nu fac comparatii duble
                if (a[i][j] != a[j][i]) {
                    esteSimetrica = false;
                }
            }

        }
//        for (int i = 0; i <a.length-1 ; i++) {
//            for (int j = i+1; j <a.length ; j++) {
//                if(a[i][j] != a[j][i]){
//                    esteSimetrica = false;
//                }
//            }
//        }
        if (esteSimetrica) {
            System.out.println("Matricea este simetrica!!!");
        }else{
            System.out.println("Matricea nu este simetrica!!!");
        }

    }
}
