public class Student{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int testPoints1, testPoints2, testPoints3;

   public Student(String first, String last, Address home,
                   Address school, int points1, int points2, int points3){
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      testPoints1 = points1;
      testPoints2 = points2;
      testPoints3 = points3;
   }

   public String toString(){
      String result;

      result = firstName + " " + lastName + "\n";
      result += "\n" + "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress+ "\n";
      double pointsAverage = average();
      result += "Average test points: " + pointsAverage;

      return result;
   }

   public Address getHomeAddress(){
       return homeAddress;
   }
   public void setHomeAddress(Address newAddress){
       homeAddress = newAddress;
   }
   public Address geSchoolAddress(){
        return schoolAddress;
   }
   public void setSchoolAddress(Address newAddress){
        schoolAddress = newAddress;
   }

   public double average(){
    double average = (testPoints1 + testPoints2 + testPoints3)/ 3.0;
    return Math.round(average * 100.0) / 100.0;
   }
}
