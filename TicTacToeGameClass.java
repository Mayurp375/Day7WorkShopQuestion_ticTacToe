import java.util.Random;
import java.util.Scanner;

public class TicTacToeGameClass {

    char X = 'x'; //UC1
    char O = 'O';
    char[] board = new char[10];
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TicTacToeGameClass ticTacToeGameClass = new TicTacToeGameClass();
        ticTacToeGameClass.showBoard();  //board
        System.out.println();
        ticTacToeGameClass.toss();       //toss
        System.out.println();
        ticTacToeGameClass.choise();     //for choice
        System.out.println();

    }

    char choise() {                           //uc2   chose X or O
        char player1 = 0;
        char player2;
        System.out.println(" ->choose one X or 0 ?");
        char choose = scanner.nextLine().charAt(0);

        if (choose == X || choose == O) {     //UC 4 ability to make move desired location
            player1 = choose;
            System.out.println("You have chose " + player1);
        }

        System.out.println("choose your place");

        int possision = scanner.nextByte();

        boolean isEmpty = true;                //UC 5   ability to check before move
        if (isEmpty) {
            board[possision] = choose;
        } else {
            System.out.println("this is not empty");
        }
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {                       //it will concat all the all board[i] and make the string and compared to condition bellow
                case 0:
                    line = String.valueOf((board[1] + board[2] + board[3]));
                    break;
                case 1:
                    line = String.valueOf(board[4] + board[5] + board[6]);
                    break;
                case 2:
                    line = String.valueOf(board[7] + board[8] + board[9]);
                    break;
                case 3:
                    line = String.valueOf(board[1] + board[4] + board[7]);
                    break;
                case 4:
                    line = String.valueOf(board[2] + board[5] + board[8]);
                    break;
                case 5:
                    line = String.valueOf(board[3] + board[6] + board[9]);
                    break;
                case 6:
                    line = String.valueOf(board[1] + board[5] + board[9]);
                    break;
                case 7:
                    line = String.valueOf(board[3] + board[5] + board[7]);
                    break;
            }
            //For X winner
            for (int i = 1; i < board.length; i++) {  //this work for the loop and check for the conditon
                line = String.valueOf(board[i]);
                System.out.println();
                if (line == "XXX") {
                    return 'X';
                }

                // For O winner
                else if (line == "OOO") {
                    return 'O';
                } else {
                    System.out.println("match droww play again...!");
                }
            }
        }
        return choose;
    }

    void showBoard() { //uc3 show board

        System.out.println(" " + board[0] + " "
                + board[1] + " " + board[2]
                + " ");

        System.out.println(" " + board[3] + " "
                + board[4] + " " + board[5]
                + " ");

        System.out.println(" " + board[6] + " "
                + board[7] + " " + board[8]
                + " ");

        // To print out the board.
    /* |---|---|---|
       | 1 | 2 | 3 |
       |-----------|
       | 4 | 5 | 6 |
       |-----------|
       | 7 | 8 | 9 |
       |---|---|---|*/
    }


    void toss() {                            //UC6 toss to play first
        Random random = new Random();
        int myToss = random.nextInt(2);
        if (myToss == 1) {
            System.out.println("player 1 is win the toss");
        } else {
            System.out.println("player 2 is win the toss");
        }
    }
}









