import java.util.Scanner;

public class OccCount {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers between 0 and 50 including!");
        int myInt = scan.nextInt();
        int[] myList = new int[51];
        
        while (0 <= myInt && myInt <= 50){
            myList[myInt]++;
            myInt = scan.nextInt();          
        }
        
        for (int i = 0; i < 51; i++){
            System.out.println(i + " - " + myList[i]);
        }     
    }
    

    
}
