import java.util.Scanner;

public class PatratPerfectNNumere {
    public static void main(String[] args) {
//        Tema2.S2.
//        Afisati patratul perfect al tuturor numerelor de la 0 la n, unde n este citit de voi de la consola.

        Scanner sc = new Scanner(System.in);

        //citesc numarul de numere pana la care se calculeaza patratul perfect
        System.out.println("Dati numarul de numere pentru a calcula patratul perfect: ");
        int n = sc.nextInt();

        System.out.println("Afisare patrate perfecte pana la n citit de la tastatura/consola: ");
        for (int i = 0; i <=n ; i++) {
            System.out.print(i*i + " ");

        }



    }
}
