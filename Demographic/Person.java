

public class Person {
     private final int age;
     private final String gender;
     private final String nationality;
     
     public Person(int initAge, String initGender, String initNationality){
        age = initAge;
        gender = initGender;
        nationality = initNationality;
     }
    
     public int getAge(){
        return age;
     }

     public String getNationality(){
        return nationality;
     }

     public String getGender(){
        return gender;
     }
    
     public String toString(){
        return "The person aged " + age + " , " + nationality + " by birth, " + gender + ". ";
     }
    
}
