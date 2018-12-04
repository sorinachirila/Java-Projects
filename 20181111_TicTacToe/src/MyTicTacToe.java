import javax.swing.plaf.ColorUIResource;
import java.util.Scanner;

public class MyTicTacToe {

    //definim proprietati Tic Tac Toe
    static char SYMBOL_X = 'X';
    static char SYMBOL_0 = '0';
    static char[] SYMBOLS = new char[]{SYMBOL_X, SYMBOL_0};

    Player player1;

    Player player2;

    char [][] board;

    int size;


    MyTicTacToe(int size, String player1, String player2){
        this.size = size;
        this.board = new char[size][size];
        this.player1 = new Player(player1, SYMBOL_X);
        this.player2 = new Player(player2, SYMBOL_0);
        initBoard();
    }

    public void initBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = (char)(48 + size * i + 1 +j);
            }
        }
    }

    public void showBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int readMove(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jucatorul " + player.name + " muta:");
        return scanner.nextInt();
    }

    public void makeMove(Player player, int move){

        int i = (move - 1) / size;
        int j = (move - 1) % size;
        board[i][j] = player.symbol;
    }

    public boolean isWinLine(Player player, int line){
        boolean win = true;
        int i = 0;
        while(i < size && win){
            if (board[line][i] != player.symbol){
                win = false;
            }
            i++;
        }
        return win;
    }

    public boolean isWinCol(){
        return false;
    }

    public boolean isWinDiag1(Player player){

        boolean win = true;
        int i = 0;
        while(i < size){
            if(board[i][i] != player.symbol){
                win = false;
            }
            i++;
        }
        return win;
    }

    public boolean isWinDiag2(){
        return false;
    }

    public boolean isWin(Player player, int move){
        // determine coordinates
        int i = (move - 1) / size;
        int j = (move - 1) % size;

        // test win
        boolean win = false;
        win = isWinLine(player, i);
        if(!win){
            win = isWinCol();
        }
        if(!win && i == j){
            win = isWinDiag1(player);
        }
        if(!win && i == (size - 1 - j)){
            win = isWinDiag2();
        }

        return win;
    }

    public void playGame(){

        int nrMoves = 0;
        Player currentPlayer = player1;
        boolean win = false;
        while(nrMoves < (size * size) && !win){

            int move = readMove(currentPlayer);
            makeMove(currentPlayer, move);
            nrMoves++;

            showBoard();
            // not testing for sirst 4 moves on 3 x 3
            if(nrMoves >= 2 * size - 1){
                win = isWin(currentPlayer, move);
            }
            if(!win){

                // switch players
                if(currentPlayer == player1){
                    currentPlayer = player2;
                }else{
                    currentPlayer = player1;
                }
            }

        }
        if(win == false){
            System.out.println("Remiza!");
        } else {
            System.out.println("Castigator: " + currentPlayer.name + " !!!");
        }

    }

}
