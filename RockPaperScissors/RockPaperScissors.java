import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // counter for statistics
        int userWins = 0;
        int computerWins = 0;
        int ties = 0;

        
        while (true) {
            String[] options = {"rock", "paper", "scissors"};
            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = options[computerChoiceIndex];

            System.out.println("Enter your choice (Rock, Paper, Scissors) or type 'Exit' to quit: ");
            String userInput = scanner.nextLine().trim().toLowerCase();
            if (userInput.equals("exit")) {
                break;
            }

            if (!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissors")) {
                System.out.println("Invalid input! Please choose Rock, Paper, or Scissors.");
                continue; 
            }

            System.out.println("Computer chose: " + computerChoice);
            System.out.println("You chose: " + userInput);

            if (userInput.equals(computerChoice)) {
                System.out.println("It's a tie!");
                ties++;
            } else if (
                (userInput.equals("rock") && computerChoice.equals("scissors")) ||
                (userInput.equals("scissors") && computerChoice.equals("paper")) ||
                (userInput.equals("paper") && computerChoice.equals("rock"))
            ) {
                System.out.println("You win!");
                userWins++;
            } else {
                System.out.println("Computer wins!");
                computerWins++;
            }
        }

        // Final statistics
        System.out.println("\nGame over!");
        System.out.println("Wins: " + userWins);
        System.out.println("Losses: " + computerWins);
        System.out.println("Ties: " + ties);
    }
}