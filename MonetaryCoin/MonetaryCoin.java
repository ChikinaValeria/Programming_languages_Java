
public class MonetaryCoin extends Coin{

    private int value;

    public MonetaryCoin(int initValue){
        super();
        value = initValue;

    }

    public int getValue(){
        return value;
    }

    public String toString(){
        return super.toString() + ", the value of the coin is " + value;
    }
    
}
