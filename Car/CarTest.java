public class CarTest {
    public static void main(String[] args){
        Car car1 = new Car("BMW", "X5", 2010);
        Car car2 = new Car("Ford", "Mustang", 1970);

        int yearOfProduction = car1.getYear();
        System.out.println("The production year of my BMW X5 is " + yearOfProduction);

        System.out.println("I'm a happy owner of " + car2.getMake()+ " "+ car2.getModel()+"!");
        System.out.println("Can my car be considered as antique?: "+ car2.isAntique());
        car2.setYear(1980);
        System.out.println("Oh! looks like I've mixed something up! Its not so old!");
        System.out.println("Can my car be considered as antique?: "+ car2.isAntique());

        car1.setMake("Audi");
        car1.setModel("A4");
        System.out.println("I changed my car couple days ago!");
        System.out.println("I'm a happy owner of " + car1.getMake()+ " "+ car1.getModel()+"!");
    }
    
}
