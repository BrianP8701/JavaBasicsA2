package Class2;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        // Two people choose R, P, S
        // Determine who wins

        // Let's me take input from the terminal
        Scanner scan = new Scanner(System.in);

        System.out.println("Player 1 choose: ");

        String player1 = scan.next();

        System.out.println("Player 2 choose: ");

        String player2 = scan.next();

        int a = 0;
        int b = 0;

        // Rock = 1
        // Paper = 2
        // Scissors = 3

        if(player1.equals("Rock")) a = 1;
        else if(player1.equals("Paper")) a = 2;
        else a = 3;

        if(player2.equals("Rock")) b = 1;
        else if(player2.equals("Paper")) b = 2;
        else b = 3;

        System.out.println(whoWon(a, b));
    }



    // Return a sentence declaring if player 1 or player 2 won
    public static String whoWon(int a, int b){
        
        // Player 1 chose paper, Player 2 chose rock -> Player 1 should win?
        
        // if(a == 2 && b == 1) Return player 1 won

        return "Player 1 won!";
    }
}
