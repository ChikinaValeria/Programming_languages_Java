public class Kennel {
    public static void main(String[] args){
        
        Dog Boy = new Dog(1, "Boy");
        Dog Patomak = new Dog(2, "Patomak");
        Dog Betty = new Dog(8, "Betty");
        
        int bettySAge = Betty.getAge();
        System.out.println("The age of Betty is "+bettySAge); 
        
        Betty.setAge(7);
        bettySAge = Betty.getAge();
        System.out.println("No way! Betty is younger!");
        System.out.println("The age of Betty is "+bettySAge); 

        System.out.println("I don't like the name Boy anymore. Let's change it!");
        Boy.setName("Max");
        String boyNewName = Boy.getName();
        System.out.println("The new name of Boy is "+ boyNewName); 

        System.out.println("Boy's age in person years is " + Boy.ageInPersonYears() + " years old.");
        System.out.println("Patomak's age in person years is " + Patomak.ageInPersonYears() + " years old.");
        System.out.println("Betty's age in person years is " + Betty.ageInPersonYears() + " years old.");

        System.out.println(Boy.toString());
        System.out.println(Patomak.toString());
        System.out.println(Betty.toString());
        
     
}
}
