public class PairOfDice {
    private Die die1, die2;
    
    public PairOfDice(){
        die1 =new Die();
        die2= new Die();
    }
    public void setDie1FaceValue(int value){
        die1.setFaceValue(value);
    }
    public void setDie2FaceValue(int value){
        die2.setFaceValue(value);
    }
    public int getDie1FaceValue(){
        return die1.getFaceValue();
    }
    public int getDie2FaceValue(){
        return die2.getFaceValue();
    }
    public void rollDie1(){
        die1.roll();
    }
    public void rollDie2(){
        die2.roll();
    }
    public int sumOfDice(){
        int sum = die1.getFaceValue() + die2.getFaceValue();
        return sum;
    }
}
