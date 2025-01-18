import java.util.InputMismatchException;
import java.util.Scanner;
public class convertor {
    

    public static void main(String[] args) {
       System.out.println("Please enter the number of seconds you want to convert!");
       Scanner scan = new Scanner(System.in);

       try {
       long seconds = scan.nextLong();
       if (seconds < 0) { // Проверяем на отрицательные значения
           System.out.println("Seconds cannot be negative. Please try again later.");
       }else {
           long hours = seconds / 3600;
           long minutes = (seconds % 3600) / 60; 
           long seconds_left = seconds % 60;

           System.out.printf("Time period of %d seconds is %02d:%02d:%02d%n", seconds, hours, minutes, seconds_left);
       }
       }catch (InputMismatchException e) {
        System.out.println("Come on, it has to at least look like an integer number!");
        System.out.println(e);
       }
       scan.close();
       
       
}

}