public class pattern3 {
    
    public static void main(String[] args) {
        int raws = 10;
        for (int i=1; i <= raws; i++){
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            
            System.out.print("*".repeat(raws-i+1));
            System.out.println();
        }

        
    }
}
