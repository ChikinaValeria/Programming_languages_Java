
public class Student extends NotWorkingPerson{
    private final String university;
    private final String degree;

    public Student(int myAge, String myGender, String myNationality, int myAmount, String mySource, String myUni, String myDegree){
        super(myAge, myGender, myNationality, myAmount, mySource);
        university = myUni;
        degree = myDegree;
    }
    
    public String getUniversity(){
        return university;
    }

    public String getDegree(){
        return degree;
    }

    public String toString(){
        return super.toString() + university + " student, " + degree + ".";
    }
}
