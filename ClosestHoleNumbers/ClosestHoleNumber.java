import java.util.Scanner;

public class ClosestHoleNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the double number!");
        double num = scan.nextDouble();

        System.out.println("The closest hole number smaller than yours is "+ Math.floor(num));
        System.out.println("The closest hole number bigger than yours is "+ Math.ceil(num));


    }
    
}
