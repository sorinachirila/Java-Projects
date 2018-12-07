import java.util.Scanner;

public class SumMeanNumbers {
    public static void main(String[] args) {
//        Tema1.E11.
//        Scrieti un program java ce citeste de la consola numere cat timp utilizatorul introduce valori > 0.
//        In momentul in care utilizatorul a introdus valoarea 0 afisati suma totala si media numerelor citite.
        System.out.println("Please, give a number: ");
        Scanner scanner = new Scanner(System.in);
        //citesc numarul pentru care fac afisarea pattern
        int n = scanner.nextInt();
        //declar variabile necesare
        int sum = 0;
        int nrValues = 0;

        while(n != 0 ){
            sum += n;
            nrValues++;
            System.out.println("Please, give another number: ");
            n = scanner.nextInt();
        }
        //!!!! Integer Division
        System.out.println("Sum of the numbers greater than zero is: " + sum + " and their mean is: "+ sum/(double)nrValues);

    }
}
