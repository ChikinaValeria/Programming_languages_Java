public class pattern2 {
    

    public static void main(String[] args) {
        for (int i=1; i <= 10; i++){
            for (int j=9; j>=i; j--){
                System.out.print(" ");
            }
            System.out.println("*".repeat(i));
        }

        //second option
        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            System.out.print(" ".repeat(rows - i));
            System.out.println("*".repeat(i));
        }
    }
}