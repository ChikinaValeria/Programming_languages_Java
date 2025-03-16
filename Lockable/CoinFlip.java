public class CoinFlip{
   //-----------------------------------------------------------------
   //  Creates a Coin object, flips it, and prints the results.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      //creating Coin and toying with it without setting key
      Coin myCoin = new Coin();
      System.out.println("Is the object locked?");
      System.out.println(myCoin.locked());
      myCoin.flip();
      System.out.println(myCoin);

      if (myCoin.isHeads())
         System.out.println("You win.");
      else
         System.out.println("Better luck next time.");

      //working with the locked Coin
      System.out.println();
      System.out.println("Let's LOCK the object!");
      System.out.println();   

      myCoin.setKey(12345); 
      System.out.println("Trying to lock with incorrect code:");
      myCoin.lock(1234);
      System.out.println("Trying to lock with correct code:");
      myCoin.lock(12345); 
      System.out.println("Is the object locked?");
      System.out.println(myCoin.locked());
      myCoin.tryRestrictedIsHead();
      System.out.println(myCoin.tryRestrictedToString());
      
      //working with unlocked coin
      System.out.println();
      System.out.println("Let's UNLOCK the object!");
      System.out.println();
      
      System.out.println("Trying to unlock with incorrect code:");
      myCoin.unlock(1234);
      System.out.println("Trying to unlock with correct code:");
      myCoin.unlock(12345); 
      System.out.println("Is the object locked?");
      System.out.println(myCoin.locked());
      myCoin.tryRestrictedIsHead();
      System.out.println(myCoin.tryRestrictedToString());
   }
}
