

public class WorkingPerson extends Person {
    private final int income;
    private final String firm;
    private final String position;

    public WorkingPerson(int myAge, String myGender, String myNationality, int myIncome, String myFirm, String myPosition){
        super(myAge, myGender, myNationality);
        income = myIncome;
        firm = myFirm;
        position = myPosition;
    }

    public int getIncome(){
        return income;
    }

    public String getFirm(){
        return firm;
    }

    public String getPosition(){
        return position;
    }

    public String toString(){
        return super.toString() + "Working as " + position + " in " + firm + ". Income iquals " + income + ". ";
    }
}
