public class Retired extends NotWorkingPerson{
    private final String hobby;
    private final int yearsOfRetirement;

    public Retired(int myAge, String myGender, String myNationality, int myAmount, String mySource, String myHobby, int years){
        super(myAge, myGender, myNationality, myAmount, mySource);
        hobby = myHobby;
        yearsOfRetirement = years;
    }
    
    public String hobby(){
        return hobby;
    }

    public int getYearsOfRetirement(){
        return yearsOfRetirement;
    }

    public String toString(){
        return super.toString() + yearsOfRetirement + " years being retired. " + "Hobby: " + hobby + ".";
    }
}
