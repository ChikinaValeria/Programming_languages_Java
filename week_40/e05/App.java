import java.util.Scanner;
public class App {
    public static void main(final String[] args){
        
        Scanner scan = new Scanner(System.in);
        String name = "";
        
        
        while (true){
            System.out.println("Enter a name");
            String yourName = scan.nextLine();

            if (yourName.equals("Quit")){
                break;

            }else {
                name = name.concat(yourName);
                System.out.println(name);
                
            }    
  
        }
        
    scan.close();
    }


}