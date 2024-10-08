/* This program validates user's password against the following criteria:
-The password must be at least 8 characters long
It must contain at least:
- One uppercase letter (A-Z)
- One lowercase letter (a-z)
- One digit (0-9)*/

import java.util.Scanner;
public class App {


    public static void main(String[] var0) {
        System.out.println("Enter your password: ");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

     

        if (password.length()< 8) {
            System.out.println("Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter.");
            return; //needs to quit the program
        }
        int up_total= 0;
        int low_total=0;
        int digit_total=0;

        for (int i=0; i< password.length(); i++){
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch) == true){
                up_total++;
            }else if (Character.isLowerCase(ch) == true){
                low_total++;
            }else if (Character.isDigit(ch) == true){
                digit_total++;
            }else {
                continue;
            }
        }
        if (up_total == 0 || low_total==0 || digit_total==0){
            System.out.println("Password is invalid. Needs to be at least one digit, one lowercase and one uppercase letter.");
            return;
        }

        
        System.out.println("Password is valid.");
        

   }
}
