
public class CoinTester {

    public static void main(String[] args) {
        MonetaryCoin mcoin_1 = new MonetaryCoin(5);
        MonetaryCoin mcoin_2 = new MonetaryCoin(10);
        MonetaryCoin mcoin_3 = new MonetaryCoin(20);

        System.out.println(mcoin_1);
    System.out.println(mcoin_2);
    System.out.println(mcoin_3);

    mcoin_1.flip();
    mcoin_2.flip();
    mcoin_3.flip();

    System.out.println(mcoin_1);
    System.out.println(mcoin_2);
    System.out.println(mcoin_3);

    int sum = mcoin_1.getValue() + mcoin_2.getValue() + mcoin_3.getValue();
    System.out.println(" You have "+ sum + " cents!");
    }

       
}
