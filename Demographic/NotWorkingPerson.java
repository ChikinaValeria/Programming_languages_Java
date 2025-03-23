public class NotWorkingPerson extends Person{
    private final int amountOfFunds;
    private final String sourceOfFunds;


    public NotWorkingPerson(int myAge, String myGender, String myNationality, int myAmount, String mySource){
        super(myAge, myGender, myNationality);
        amountOfFunds = myAmount;
        sourceOfFunds = mySource;
    }

    public int getAmount(){
        return amountOfFunds;
    }

    public String getSource(){
        return sourceOfFunds;
    }

    public String toString(){
        return super.toString() + "Not working. Gets " + amountOfFunds + " per month from " + sourceOfFunds + ". ";
    }
}