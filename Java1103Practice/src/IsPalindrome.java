import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
//        Tema1.E6.
//        Realizati un program java ce determina daca un numar n este palindrom sau nu si afiseaza la consola valoarea de adevar sau fals corespunzatoare.
        System.out.println("Please, give a number: ");
        Scanner scanner = new Scanner(System.in);
        //citesc numarul pentru care fac verficarea de Palindrom
        int n = scanner.nextInt();
        //declar variabile necesare
        //auxiliar retine valoarea initiala n
        //invers retine inversul lui n
        int auxiliar = n;
        int invers = 0;
        //bucla while, atat timp cat n diferit de 0
        while(auxiliar != 0){
            invers = invers*10 + auxiliar%10;
            auxiliar = auxiliar/10;
            //System.out.println(invers);
        }
        //System.out.println(n + " " + auxiliar + " " + invers);
        //testare valoare initiala n si valoare calculata
        if(n == invers){
            System.out.println("The number " + n + " is a palindrome!");
        }else{
            System.out.println("The number " + n + " is not a palindrome!");
        }

    }
}
