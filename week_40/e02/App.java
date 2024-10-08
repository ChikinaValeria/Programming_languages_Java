import java.util.Scanner;
public class App {
    public static void main(final String[] args){
        System.out.println("Enter a name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("You entered: " + name);

        for (int i = 0; i < name.length() ; i++){
            System.out.println(name.charAt(i));
        }
    }


}