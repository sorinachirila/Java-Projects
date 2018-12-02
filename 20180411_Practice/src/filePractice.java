import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//tutorial at: http://www.java67.com/2012/11/how-to-read-file-in-java-using-scanner-example.html
//Java program to read file using Scanner class in Java
public class filePractice {

    public static void main(String[] args) throws FileNotFoundException {

        //creating File instance to reference text file in Java
        File text = new File("Amazon.txt");

        //creating Scanner instance to read File in Java
        Scanner scanner = new Scanner(text);

        //Reading each line of file using Scanner class
        int lineNumber = 1;
        while(scanner.hasNextLine()){
            String line =  scanner.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }
    }
}
