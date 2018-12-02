import java.util.Scanner;

public class DivizibilTrei {
    public static void main(String[] args) {
//        Tema2.E4.
//        Realizati un proiect Java ce citeste de la tastatura un array si afisati numerele din array ce sunt divizibile cu 3.
//        Similar cu ce am mai facut si la clasa.

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

//        //afisare valori din a
//        System.out.println("Afisare vector: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println("a[ " + i + " ] = " + a[i]);
//        }

        //afisare valori vector divizibile cu 3
        for (int i = 0; i <  n; i++) {
            if(a[i] % 3 == 0){
                System.out.print(a[i] + " ");
            }
        }


    }
}
