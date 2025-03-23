
public class Manager extends WorkingPerson{
    private final int peopleManaged;
    
    public Manager(int myAge, String myGender, String myNationality, int myIncome, String myFirm, String myPosition, int myPeople){
        super(myAge, myGender, myNationality, myIncome, myFirm, myPosition);
        peopleManaged = myPeople;
    }
    
    public int getPeopleManaged(){
        return peopleManaged;
    }

    public String toString(){
        return super.toString() + " Leads " + peopleManaged + "persons." ;
    }
    
}
