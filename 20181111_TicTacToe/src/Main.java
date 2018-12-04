import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //citirea datelor pentru jucatori de la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jucatorul 1:");
        //citire nume jucator 1
        String player1 = scanner.nextLine();
        System.out.println("Jucatorul 2:");
        //citire nume jucator 2
        String player2 = scanner.nextLine();
        //declarare si initializare variabila pentru a retine preferinta de repetare joc
        char playAgain = 'y';
        //parcurgere cu bucla while cat timp raspunsul pentru playAgain nu este negativ (n)

        while(playAgain != 'n'){
            //instantiere obiect myTicTacToe, din clasa MyTicTacToe folosind constructorul
            MyTicTacToe myTicTacToe = new MyTicTacToe(3, player1, player2);
            //afisare board/tabela initiala de joc
            myTicTacToe.showBoard();
            //apelare metoda de joc/play pentru TicTacToe, cei doi playeri
            myTicTacToe.playGame();
            //afisare mesaj utilizator
            System.out.println("Vrei sa joci din nou? Apasa y pentru da sau n pentru nu:");
            //citire preferinta utilizator pentru repetare joc (y/n)
            playAgain = scanner.next().charAt(0);
        }


    }
}
