import java.util.Scanner;
import java.util.Random;

public class UserNamesGenerator{
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Please, enter your first name!");
        String firstName = scan.nextLine();
        char firstNameLetter = firstName.charAt(0);
        System.out.println("Please, enter your last name!");
        String lastName = scan.nextLine();
        String fiveNameLetters = lastName.substring(0, 5);

        Random generator = new Random();
        int randomNumber = generator.nextInt(10,100);

        System.out.println("Here is the possible user name for you:");
        System.out.println(firstNameLetter+fiveNameLetters+randomNumber);

        scan.close();

    }
}