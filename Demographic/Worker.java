public class Worker extends WorkingPerson {
    private final int experience;
    
    public Worker(int myAge, String myGender, String myNationality, int myIncome, String myFirm, String myPosition, int myExperience){
        super(myAge, myGender, myNationality, myIncome, myFirm, myPosition);
        experience = myExperience;
    }
    
    public int getYearsOfExperience(){
        return experience;
    }

    public String toString(){
        return super.toString() + experience + " years of experience.";
    }
}
