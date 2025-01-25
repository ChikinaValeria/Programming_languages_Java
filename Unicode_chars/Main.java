public class Main{

    public static void main(String[] args){
        final int start = 32;  
        final int end = 126;   
        final int countPerLine = 5;  

        for (int i = start; i <= end; i++) {
            System.out.print(i + "->" + (char) i + "\t");
            if ((i - start + 1) % countPerLine == 0) {
                System.out.println();  
            }
        }
    }
}