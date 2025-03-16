public class Course {
    private String name;
    private Student firstMember, secondMember, thirdMember;

    public Course(String initName, Student first, Student second, Student third){
        name = initName;
        firstMember = first;
        secondMember = second;
        thirdMember = third;
    }

    public double averageCourseTestResult(){
        double a = firstMember.average();
        double b = secondMember.average();
        double c = thirdMember.average();
        double average = (a + b + c)/ 3.0;
        return Math.round(average * 100.0) / 100.0;
    }

    public String toString(){
        String result;
  
        result = "Course name: " + name + "\n";
        result += "\n" + "Course members:\n" + "\n" + firstMember + "\n";
        result += "\n" + secondMember + "\n" + "\n" + thirdMember;
  
        return result;
     }
}

