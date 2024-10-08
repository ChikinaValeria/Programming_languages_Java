import java.util.Scanner;
public class App {
    public static void main(final String[] args){
        System.out.println("Enter a name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("You entered: " + name);
        //I am displaing every second letter starting from the second letter and direct order of letters
        //The task is ambiguious, because the reverse order is not required but shown in the example
        for (int i =  1; i < name.length() ; i+=2){
            System.out.println(name.charAt(i));
        }
    }


}