import java.util.Scanner;
public class App {


    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] var0) {
        System.out.println("Palindrome test, please enter some text: ");
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();

        String cleanPhrase = phrase.toLowerCase().replaceAll("[^a-z]", "");
        String reversedPhrase =reverse(cleanPhrase);

        if (cleanPhrase.equals(reversedPhrase)) {
            System.out.println(phrase + " is a palindrome");
        } else {
            System.out.println(phrase + " is not a palindrome");
        }

   }
}
