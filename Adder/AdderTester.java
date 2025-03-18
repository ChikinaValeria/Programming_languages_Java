public class AdderTester {
    public static void main(String[] args) {
        int myInteger = Adder.add(2, 3);
        float myFloat = Adder.add(5.5f, 10.5f);
        String myString = Adder.add("Mary and ", "John");
        char myChar = Adder.add('!', 'B');

        System.out.println("The sum of integers is: " + myInteger);
        System.out.println("The sum of floats is: " + myFloat);
        System.out.println("The sum of strings is: " + myString);
        System.out.println("The sum of chars is: " + myChar);
    }
}
