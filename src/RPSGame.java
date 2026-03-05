import java.util.Scanner;

public class RPSGame {
    public static void main() {

        String playerA;
        String playerB;
        String playAgainYN;

        boolean gotPlayerAMove;
        boolean gotPlayerBMove;
        boolean gotplayAgain;
        boolean playAgain;

        Scanner in = new Scanner(System.in);

        do {
            playerA = "";
            playerB = "";
            playAgainYN = "";

            gotPlayerAMove = false;
            gotPlayerBMove = false;
            gotplayAgain = false;
            playAgain = false;
            // Player A Input
            do {
                System.out.print("Player A: Enter your move [RPS]: ");
                playerA = in.nextLine();
                playerA = playerA.toUpperCase();
                // Validate Player A Input
                if (playerA.equals("R") || playerA.equals("P") || playerA.equals("S")) {
                    System.out.println("Player A Move: " + playerA);
                    gotPlayerAMove = true;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } while (!gotPlayerAMove);
            // Player B Input
            do {
                System.out.print("Player B: Enter your move [RPS]: ");
                playerB = in.nextLine();
                playerB = playerB.toUpperCase();
                // Validate Player B Input
                if (playerB.equals("R") || playerB.equals("P") || playerB.equals("S")) {
                    System.out.println("Player B Move: " + playerB);
                    gotPlayerBMove = true;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } while (!gotPlayerBMove);
            // Check for Player A Rock
            if (playerA.equals("R")) {
                if (playerB.equals("R")) {
                    System.out.println("Rock vs Rock. It's a tie!");
                } else if (playerB.equals("P")) {
                    System.out.println("Paper covers Rock. Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            }
            // Check for Player A Paper
            if (playerA.equals("P")) {
                if (playerB.equals("R")) {
                    System.out.println("Paper covers Rock. Player A wins!");
                } else if (playerB.equals("P")) {
                    System.out.println("Paper vs Paper. It's a tie!");
                } else {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            }
            // Check for Player A Scissor
            if (playerA.equals("S")) {
                if (playerB.equals("R")) {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                } else if (playerB.equals("P")) {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                } else {
                    System.out.println("Scissors vs Scissors. It's a tie!");
                }
            }
            do{
                System.out.print("\nPlay Again? [Y/N]: ");
                playAgainYN = in.nextLine();
                playAgainYN = playAgainYN.toUpperCase();
                if (playAgainYN.equals("Y") || playAgainYN.equals("N")) {
                    gotplayAgain = true;
                    if (playAgainYN.equals("Y")) {
                        playAgain = true;
                    } else if (playAgainYN.equals("N")) {
                        System.exit(0);
                    } else {
                        System.out.println("Invalid input. Try again.");
                    }
                }
            } while(!gotplayAgain);
        } while (playAgain);
    }
}
