import java.util.Scanner;

public class MatricePatraticaElementeOrizontalaVerticala {
    public static void main(String[] args) {
//        Tema2.E5.
//        Realizati un program Java ce citeste de la tastatura o matrice patratica de dimensiune n.
//        Afisati matricea in oglinda fata de orizontala si verticala.
//        extra: Daca este posibil incercati sa afisati si inversa matricei
//        exemplu:
//        3 7 9
//        5 8 2
//        4 1 6
//        oglinda verticala:
//        9 7 3
//        2 8 5
//        6 1 4
//        oglinda orizontala:
//        4 1 6
//        5 8 2
//        3 7 9


        Scanner scanner = new Scanner(System.in);

        //citesc dimensiunea matricei
        System.out.println("Dati dimensiunea matricei: ");
        int n = scanner.nextInt();

        //declar si instantiez matrice patratica
        int [][] a = new int [n][n];


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

        //oglinda orizontala
        System.out.println("Matricea in oglinda pe orizontala este: ");
        for (int j = n-1; j >= 0; j--) {
            for (int i = 0; i < n ; i++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
//      oglinda orizontala:
//        4 1 6
//        5 8 2
//        3 7 9


        //oglinda verticala
        System.out.println("Matricea in oglinda pe verticala este: ");
        for (int i = 0; i < n  ; i++) {
            for (int j = n-1; j >= 0 ; j--) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
//        oglinda verticala:
//        9 7 3
//        2 8 5
//        6 1 4


        //inversa matrice??? i si j, cobor
        System.out.println("Inversa matricei este: ");
        for (int i = n-1; i >= 0 ; i--) {
            for (int j = 0; j < n ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //       inversa matricei
//        6 1 4
//        2 8 5
//        9 7 3




    }
}
