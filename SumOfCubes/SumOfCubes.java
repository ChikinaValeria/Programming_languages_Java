import java.util.Scanner;
public class SumOfCubes{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first integer!");
        int firstInt = scan.nextInt();
        System.out.println("Enter the second integer!");
        int secondInt = scan.nextInt();

        double firstCube = Math.pow(firstInt, 3);
        double secondCube = Math.pow(secondInt, 3);

        System.out.println("The sum of cubes equals to "+(firstCube+secondCube));
        scan.close();
    }
} 