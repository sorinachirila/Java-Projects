import java.util.Scanner;
/*      Homework3.E2.
        Ask the user to input a String.
        Show the reverse of that string.
        Lookup:
        https://beginnersbook.com/2013/12/java-string-charat-method-example/
        https://www.javatpoint.com/java-string-length*/

/*      Homework3.E3.
        Realizati un program java ce citeste de la tastatura o propozitie si inverseaza fiecare cuvant in parte.
        Create a java program that reads a sentence and reverses each word separately.*/
public class InputReversed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give a sequence of characters: ");

        String mySequence = scanner.nextLine();
        System.out.println(mySequence);

        for (int i = mySequence.length()-1; i >= 0; i--) {
            System.out.print(mySequence.charAt(i));
        }
        /*hekko world now
        won dlrow okkeh*/
    }
}
