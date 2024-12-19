import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char moveA, moveB;
        String result;

        do {
            // Get move choice from player A
            do {
                System.out.print("Player A, choose R for Rock, P for Paper, or S for Scissors: ");
                moveA = input.next().toUpperCase().charAt(0);
            } while (moveA != 'R' && moveA != 'P' && moveA != 'S');

            // Get move choice from player B
            do {
                System.out.print("Player B, choose R for Rock, P for Paper, or S for Scissors: ");
                moveB = input.next().toUpperCase().charAt(0);
            } while (moveB != 'R' && moveB != 'P' && moveB != 'S');

            // Determine winner
            if (moveA == moveB) {
                result = "It's a tie!";
            } else if ((moveA == 'R' && moveB == 'S') || (moveA == 'P' && moveB == 'R') || (moveA == 'S' && moveB == 'P')) {
                result = "Player A wins!";
            } else {
                result = "Player B wins!";
            }

            // Display result
            switch (result) {
                case "It's a tie!":
                    System.out.println("Rock vs Rock, Paper vs Paper, Scissors vs Scissors... " + result);
                    break;
                case "Player A wins!":
                    System.out.println("Player A chose " + moveA + " and Player B chose " + moveB + "... " + result);
                    break;
                case "Player B wins!":
                    System.out.println("Player A chose " + moveA + " and Player B chose " + moveB + "... " + result);
                    break;
            }

            // Prompt for replay
            System.out.print("Play again? [Y/N]: ");
        } while (input.next().equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
    }
}
