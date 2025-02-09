public class Lights {
    public static void main(String[] args) {
        
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        bulb1.turnOn();
        bulb3.turnOn();

        System.out.println("Bulb 1 is on: " + bulb1.isOn());
        System.out.println("Bulb 2 is on: " + bulb2.isOn());
        System.out.println("Bulb 3 is on: " + bulb3.isOn());
    }
}
