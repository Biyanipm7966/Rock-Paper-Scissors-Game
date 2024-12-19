import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validMoveA = false;
        boolean validMoveB = false;
        String moveA = "";
        String moveB = "";
        
        while (!validMoveA) {
            System.out.print("Player A, enter your move (R/P/S): ");
            moveA = input.nextLine().toUpperCase();
            if (moveA.equals("R") || moveA.equals("P") || moveA.equals("S")) {
                validMoveA = true;
            } else {
                System.out.println("Invalid move, please try again.");
            }
        }
        
        while (!validMoveB) {
            System.out.print("Player B, enter your move (R/P/S): ");
            moveB = input.nextLine().toUpperCase();
            if (moveB.equals("R") || moveB.equals("P") || moveB.equals("S")) {
                validMoveB = true;
            } else {
                System.out.println("Invalid move, please try again.");
            }
        }
        
        // Rest of the game logic and output goes here
    }
}
