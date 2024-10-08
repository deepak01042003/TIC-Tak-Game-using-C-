import java.util.Scanner;

public class TicTacToe {
    static char[] square = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};

    public static int checkWin() {
        if (square[0] == square[1] && square[1] == square[2]) {
            if (square[0] == 'X')
                return 1;
            else
                return 2;
        } else if (square[3] == square[4] && square[4] == square[5]) {
            if (square[3] == 'X')
                return 1;
            else
                return 2;
        } else if (square[6] == square[7] && square[7] == square[8]) {
            if (square[6] == 'X')
                return 1;
            else
                return 2;
        } else if (square[0] == square[3] && square[3] == square[6]) {
            if (square[0] == 'X')
                return 1;
            else
                return 2;
        } else if (square[1] == square[4] && square[4] == square[7]) {
            if (square[1] == 'X')
                return 1;
            else
                return 2;
        } else if (square[2] == square[5] && square[5] == square[8]) {
            if (square[2] == 'X')
                return 1;
            else
                return 2;
        } else if (square[0] == square[4] && square[4] == square[8]) {
            if (square[0] == 'X')
                return 1;
            else
                return 2;
        } else if (square[2] == square[4] && square[4] == square[6]) {
            if (square[2] == 'X')
                return 1;
            else
                return 2;
        } else {
            return 0;
        }
    }

    public static void mark(int player, int box) {
        if (player == 1) {
            square[box] = 'X';
        } else {
            square[box] = 'Y';
        }
    }

    public static void display() {
        for (int i = 0; i < 9; i++) {
            System.out.print(square[i] + "\t");
            if (i == 2 || i == 5 || i == 8) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int player1 = 1, player2 = 2;
        int box, result = 0, flag = 0;

        for (int i = 1; i < 5; i++) {
            System.out.print("\nPlayer " + player1 + " Enter the Box: ");
            box = sc.nextInt();
            mark(player1, box);
            display();

            result = checkWin();
            if (result == 1) {
                System.out.println("\nCongratulations! Player " + player1 + " has won.");
                flag = 1;
                break;
            } else if (result == 2) {
                System.out.println("\nCongratulations! Player " + player2 + " has won.");
                flag = 1;
                break;
            }

            System.out.print("\nPlayer " + player2 + " Enter the Box: ");
            box = sc.nextInt();
            mark(player2, box);
            display();

            result = checkWin();
            if (result == 1) {
                System.out.println("\nCongratulations! Player " + player1 + " has won.");
                flag = 1;
                break;
            } else if (result == 2) {
                System.out.println("\nCongratulations! Player " + player2 + " has won.");
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("\nSorry, the game is a draw.");
        }

        sc.close();
    }
}
