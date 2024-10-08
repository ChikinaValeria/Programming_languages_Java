import java.util.Scanner;
public class App {
    public static void main(final String[] args){
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        if (name.equals("Louis") == true){
            System.out.println("Are you French?");

        } else {
            System.out.println("You have a great name!");
        }


    }
    
}
