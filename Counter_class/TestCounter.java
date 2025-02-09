public class TestCounter {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        System.out.println("Initial value of counter1: " + counter1.getCount());
        System.out.println("Initial value of counter2: " + counter2.getCount());

        counter1.click();
        counter1.click();
        counter2.click();

        System.out.println("Value of counter1 after clicks: " + counter1.getCount());
        System.out.println("Value of counter2 after clicks: " + counter2.getCount());

        counter1.reset();
        counter2.reset();

        System.out.println("Value of counter1 after reset: " + counter1.getCount());
        System.out.println("Value of counter2 after reset: " + counter2.getCount());
    }
}