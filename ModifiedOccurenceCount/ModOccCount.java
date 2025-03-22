import java.util.Scanner;

public class ModOccCount {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers between -25 and 25 including!");
        int myInt = scan.nextInt();
        int[] myList = new int[51];
        
        while (-25 <= myInt && myInt <= 25){
            myList[myInt+25]++;
            myInt = scan.nextInt();          
        }
        
        for (int i = 0; i < 51; i++){
            if (myList[i] >= 1) {
                System.out.println(i-25 + " - " + myList[i]);
            }    
        }     
    }
    

    
}