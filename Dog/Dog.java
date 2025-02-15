public class Dog {

    private int age;
    private String name;

    public Dog(int initialAge, String initialName){
        age = initialAge;
        name = initialName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int ageInPersonYears(){
        return age*7;
    }
    public String toString() {
        return "Dog with name " + name + " and age of " + age;
    }

}
