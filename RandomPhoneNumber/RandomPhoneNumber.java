import java.util.Random;

public class RandomPhoneNumber{
    public static void main(String[] args){
        final int digitsInFirstPart = 3;
        final int digitsInLastPart = 4;

        String phoneNumber = "";
        Random generator = new Random();

        for (int i=0; i<digitsInFirstPart; i++){
            int myInt = generator.nextInt(8);
            String myIntString = String.valueOf(myInt);
            phoneNumber =phoneNumber.concat(myIntString);

        }
        phoneNumber =phoneNumber.concat("-");

        int threeDigitInt = generator.nextInt(556)+100;
        String threeDigitIntString = String.valueOf(threeDigitInt);
        phoneNumber =phoneNumber.concat(threeDigitIntString);

        phoneNumber =phoneNumber.concat("-");

        for (int j=0; j<digitsInLastPart; j++){
            int myInt = generator.nextInt(10);
            String myIntString = String.valueOf(myInt);
            phoneNumber =phoneNumber.concat(myIntString);

        }
        System.out.println("Try to call " + phoneNumber);
    }
}