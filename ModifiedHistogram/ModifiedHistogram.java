import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ModifiedHistogram {
    public static void main (String[] args){
        File file = new File("file.txt");
        int[] myList = new int[10];

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextInt()){
                int myInt = scan.nextInt();  
                if (myInt % 10 == 0){
                    myList[myInt/10-1]++;
                }else{
                    myList[myInt/10]++;
                }
            }
        
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        

        for (int i = 0; i < 10; i++){
            System.out.println((i * 10 + 1) + " - " + (i + 1) * 10 + "  |  " + "*".repeat(myList[i] / 5));
        }
    }
    
}
