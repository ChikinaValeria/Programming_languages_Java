
public class School {
    public static void main(String[] args){
        Address school = new Address("800 Lancaster Ave.", "Villanova",
                                   "PA", 19085);
        Address firstHome = new Address("21 Jump Street", "Lynchburg",
                                  "VA", 24551);
        Student kalle = new Student("Kalle", "Smith", firstHome, school, 45, 67, 82);

        Address secondHome = new Address("123 Main Street", "Euclid", "OH",
                                  44132);
        Student lumi = new Student("Lumi", "Jones", secondHome, school, 64,98, 99);

        Address thirdHome = new Address("453 Main Street", "Petersburg", "OH",
                                  47432);
        Student onni = new Student("Onni", "Pekkonen", thirdHome, school, 34, 56, 73);

        Course zoo = new Course("Zoology", kalle, lumi, onni);


        System.out.println(zoo);
        System.out.println();
        System.out.println("Average Zoologe test results:");
        System.out.println(zoo.averageCourseTestResult());


    }
    
}
