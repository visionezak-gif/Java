import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        char player = 'X';
        char computer = 'O';

        while (true) {

            printBoard();

            // Player's turn
            System.out.print("Choose a position (1-9): ");
            int position = input.nextInt();

            if (!makeMove(position, player)) {
                System.out.println("That position is already taken!");
                continue;
            }

            if (checkWinner(player)) {
                printBoard();
                System.out.println("You win!");
                break;
            }

            if (boardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // Computer's turn
            computerMove(computer);

            if (checkWinner(computer)) {
                printBoard();
                System.out.println("Computer wins!");
                break;
            }

            if (boardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
        }
    }

    static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println();
    }

    static boolean makeMove(int position, char symbol) {

        int row = (position - 1) / 3;
        int column = (position - 1) % 3;

        if (position < 1 || position > 9) {
            return false;
        }

        if (board[row][column] == 'X' || board[row][column] == 'O') {
            return false;
        }

        board[row][column] = symbol;
        return true;
    }

    static void computerMove(char symbol) {

        int position;

        do {
            position = random.nextInt(9) + 1;
        } while (!makeMove(position, symbol));

        System.out.println("Computer chose: " + position);
    }

    static boolean checkWinner(char symbol) {

        // Rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == symbol &&
                board[row][1] == symbol &&
                board[row][2] == symbol) {
                return true;
            }
        }

        // Columns
        for (int column = 0; column < 3; column++) {
            if (board[0][column] == symbol &&
                board[1][column] == symbol &&
                board[2][column] == symbol) {
                return true;
            }
        }

        // Diagonal
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        // Other diagonal
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    static boolean boardFull() {

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {

                if (board[row][column] != 'X' &&
                    board[row][column] != 'O') {
                    return false;
                }
            }
        }

        return true;
    }
}
