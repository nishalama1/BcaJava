package Classwork;
import java.util.Scanner;

public class TicTacToe {
    public static char[][] board = {
            { '_', '_', '_' },
            { '_', '_', '_' },
            { '_', '_', '_' },
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X or O");

        char player = sc.nextLine().charAt(0);

        char opponent = 'O';
        char user = 'X';

        if (player == 'X') {
            opponent = 'O';
        } else if (player == 'O') {
            opponent = 'X';
        } else {
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("player is " + player + " opponent is " + opponent);

        while(true){
            System.out.println("enter the position for x:");
            int x = sc.nextInt();
            System.out.println("enter the position for y :");
            int y = sc.nextInt();
    
            board[x][y] = player;
            printBoard();
    
            System.out.println("Computer moves");
            computermoves(opponent);
            printBoard();
    
        }
    }

    static void computermoves(char opponent) {
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_') {
                    board[i][j] = opponent;
                    return;
                }
            }
        }
    }

    // }

    public static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();
        }

        // sc.close();
    }

}
