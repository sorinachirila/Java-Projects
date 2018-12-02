import java.util.Scanner;
public class MatExercitii {

    public static void main(String[] args) {

        //O serie de operatii/exercitii pentru matrici

        Scanner scanner = new Scanner(System.in);

        //citesc dimensiunile matricei
        System.out.print("introduceti nr de linii:");
        int l = scanner.nextInt();
        System.out.print("introduceti nr de coloane: ");
        int c = scanner.nextInt();

        //initializare matrice
        int[][] a = new int[l][c];
        //citesc valorile din matrice
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = scanner.nextInt();
            }

        }
        System.out.println();
//
//        for (int i = 0; i <= a.length - 1; i++) {
//            for (int j = 0; j <= a[i].length - 1; j++) {
//                //System.out.print("a[" + i + "][" + j + "] = ");
//                a[i][j] = i * a.length + j;
//            }
//
//        }
        //afisez matricea
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();

        }

        //suma pe linii, produs pe coloane
        int sum = 0;
        int produs = 1;

        //calcul suma si produs - matrice patratica-- altfel doua for-uri separate
        for (int i = 0; i < a.length; i++) {
            //System.out.println(a.length);
            sum = 0; produs = 1;
            for (int j = 0; j < a[i].length; j++) {
               // System.out.println(a[i].length);
                sum = sum + a[i][j];
                produs = produs * a[j][i];
            }
            System.out.println("suma pe linia " + i + " este: " + sum);
            System.out.println("produs pe coloana " +  i + " este: " + produs);

        }
        //suma matrice nepatratica
        for (int i = 0; i < l; i++) {
            sum = 0;
            for (int j = 0; j < c; j++) {
                sum = sum + a[i][j];
            }
            System.out.println("suma pe linia varianta a doua " + i + " este: " + sum);
        }
        //produs pe coloana
        for (int j = 0; j < c; j++) {
            produs = 1;
            for (int i = 0; i < l; i++) {
                produs = produs * a[i][j];
            }
            System.out.println("produs pe coloana varianta a doua " + j + " este: " + produs);
        }





    }
}

