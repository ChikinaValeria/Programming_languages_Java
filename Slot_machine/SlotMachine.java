import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Slot Machine!");
        System.out.println("Would you like to play?");
        boolean continueGame = true;
        while (continueGame) {
            int firstNumber = (int) (Math.random() * 10);
            int secondNumber = (int) (Math.random() * 10);
            int thirdNumber = (int) (Math.random() * 10);
            System.out.println("Slot Machine Results:\n"+firstNumber+" "+secondNumber+" "+thirdNumber);

            if (firstNumber==secondNumber | firstNumber==thirdNumber | secondNumber==thirdNumber) {
                System.out.println("Great result! Two numbers are equal!");
            }else if (firstNumber==secondNumber && firstNumber==thirdNumber) {
                System.out.println("Brilliant! You won!!!");
            }else {
                System.out.println("You will be luckier next time!");
            }
            
            //request to continue the game
            System.out.println("Do you want try again? (yes/no):");
            String response = scan.nextLine().trim().toLowerCase();
            if (response.equals("no")) {
                continueGame = false;
                System.out.println("Thank you and Goodbye!");
                break;
            } else if (!response.equals("yes")) {
                System.out.println("Invalid response. End of the program. Goodbye!");
                break;
            }
        }
        scan.close();
    }    
    
}
