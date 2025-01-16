public class pattern4 {
    
    public static void main(String[] args) {
        int rows = 5;
        for (int i=0; i < rows; i++){
            System.out.print(" ".repeat(rows-1-i));
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
