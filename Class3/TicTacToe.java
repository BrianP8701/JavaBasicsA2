package Class3;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        //               0    1    2    3    4    5    6    7    8
        String[] arr = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        Scanner scan = new Scanner(System.in);

        printBoard(arr);
        int player1 = scan.nextInt();
        arr[player1] = "X";
        printBoard(arr);
        int player2 = scan.nextInt();

        arr[player2] = "O";
        printBoard(arr);

        // We want the game to continue until the game ends
        
    }
    // Return true if the game is over
    // Return false if the game is still going
    public static boolean gameEnd(String[] arr){
        // If row 1 is all the same
        if(arr[0] == arr[1] && arr[1] == arr[2]){
            return true;
        }
        if(arr[3] == arr[4] && arr[4] == arr[5]){
            return true;
        }
        // If row 2 is all the same
        // row 3, columns, diagonals

        return false;
    }
    public static void printBoard(String[] arr){
        System.out.println(arr[0] + "|" + arr[1] + "|" + arr[2]);
        System.out.println("-----");
        System.out.println(arr[3] + "|" + arr[4] + "|" + arr[5]);
        System.out.println("-----");
        System.out.println(arr[6] + "|" + arr[7] + "|" + arr[8]);

    
    }

}
