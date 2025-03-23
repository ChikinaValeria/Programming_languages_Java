public class Tester {

    public static void main(String[] args){
    
        Student Onni = new Student(20, "male", "german", 1000, "parents", "TAMK", "bachelor degree program");
        Retired Angela = new Retired(71, "female", "spanish", 2000, "pension", "boxing", 3);
        Worker Anna = new Worker(32, "female", "italian", 3000, "Nokia", "developer", 1);
        Manager Lily = new Manager(38, "female", "spanish", 5000, "Nokia", "Engineering manager", 15);

        System.out.println(Onni);
        System.out.println(Angela);
        System.out.println(Anna);
        System.out.println(Lily);
    }
}
