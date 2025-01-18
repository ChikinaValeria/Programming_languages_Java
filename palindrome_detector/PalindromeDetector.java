import java.util.Scanner;

public class PalindromeDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like me to inspect your text for palindrome? Please, enter your text!");
        boolean continueDetecting = true;
        while (continueDetecting=true) {
            String userInput = scan.nextLine();
            String cleanedInput = userInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if (isPalindrome(cleanedInput)) {
                System.out.println("The text contains a palindrome!");
            } else {
                System.out.println("The text does not contain a palindrome.");
            }

            System.out.println("Do you want to check another text? (yes/no):");
            String response = scan.nextLine().trim().toLowerCase();
            if (response.equals("no")) {
                continueDetecting = false;
                System.out.println("Thank you and Goodbye!");
                break;
            } else if (!response.equals("yes")) {
                System.out.println("Invalid response. End of the program. Goodbye!");
                break;
            }
        }
        scan.close();
    }
    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}