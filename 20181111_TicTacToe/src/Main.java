import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jucatorul 1:");
        String player1 = scanner.nextLine();
        System.out.println("Jucatorul 2:");
        String player2 = scanner.nextLine();

        MyTicTacToe myTicTacToe = new MyTicTacToe(3, player1, player2);
        myTicTacToe.showBoard();
        myTicTacToe.playGame();



    }
}
