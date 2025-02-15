public class RollingDice2 {

    public static void main(String[] args){
        PairOfDice pair = new PairOfDice();

        
        System.out.println("Starting values are:");
        System.out.println(pair.getDie1FaceValue()+" and " + pair.getDie2FaceValue());
    
        pair.setDie1FaceValue(5);
        pair.setDie2FaceValue(3);
        System.out.println("The sum of dice values is " + pair.sumOfDice());

        pair.rollDie1();
        pair.rollDie2();
        System.out.println("Let's roll the dice!");
        System.out.println("First die face value is " + pair.getDie1FaceValue());
        System.out.println("Second die face value is " + pair.getDie2FaceValue());
        System.out.println("The sum of dice values after rolling is " + pair.sumOfDice());

    }
}