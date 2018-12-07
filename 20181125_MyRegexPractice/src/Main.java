public class Main {

    public static void main(String[] args) {

        String s = "Hello World";

        System.out.println(s.matches("Hello World"));
        System.out.println(s.matches("Hello World!"));

        //unul sau mai multe caractere
        System.out.println(s.matches(".+"));
        //String s  = ""; //nu returneaza nimic

        //true pentru orice String de lungime 2
        String one = "98";
        System.out.println(one.matches("."));

        //. inlocuieste orice caracter
        String points = "...";
        System.out.println(points.matches("\\.+")); //true

        //sirul meu contine doar a, b ,c? oricare dintre caracterele a, b, sau c
        String letters = "abababaaaabbbbbbbbbababaaab";
        System.out.println(letters.matches("[abc]+"));

        String chessMove = "E7";
        System.out.println(chessMove.matches("[a-zA-Z][0-8]"));

        String ticTacToeMove = "2,1";
        System.out.println(ticTacToeMove.matches("[0-2],[0-2]"));//true

        String firstName = "Sorina Georgiana";//Sorina, Sorina Georgiana Sorina-Georgiana
        System.out.println(firstName.matches("([A-Z][a-z]+|[ -])+[a-z]"));//true

        String emailAddress = "chirila.sorina@gmail.co.uk";
        System.out.println(emailAddress.matches("[a-zA-Z0-9\\.-]{3,}@{1}[a-zA-Z0-9-]{3,}(\\.{1}[a-z]{2,}){1,2}"));


    }
}
