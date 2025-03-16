public class Transactions{
      public static void main(String[] args){
          Account acct = new Account("Ted Murphy", 72354235235637L, 102.56);
          
          System.out.println("The initial balance is:");
          System.out.println(acct.getBalance());
          acct.deposit(1230.85);
          System.out.println("Balance after depositing:");
          System.out.println(acct);
          acct.withdraw(525.0, 50.0);
          System.out.println("Balance after withdrawing:");
          System.out.println(String.format("%.2f", acct.getBalance()));
          acct.addInterest();
          System.out.println("Balance after adding interest:");
          System.out.println(acct);

          //working with the LOCKED Account
          System.out.println();
          System.out.println("Let's LOCK the account!");
          System.out.println();   

          acct.setKey(12345); 
          System.out.println("Trying to lock with incorrect code:");
          acct.lock(1234);
          System.out.println("Trying to lock with correct code:");
          acct.lock(12345); 
          System.out.println("Is the Account locked?");
          System.out.println(acct.locked());
          System.out.println("The initial balance is:");
          System.out.println(acct.getBalance());
          System.out.println(acct.tryRestrictedDeposit(1230.85));
          System.out.println("Balance after depositing:");
          System.out.println(acct);
          System.out.println(acct.tryRestrictedWithdraw(525.0, 50.0));
          System.out.println("Balance after withdrawing:");
          System.out.println(acct);
          System.out.println(acct.tryRestrictedAddInterest());
          System.out.println("Balance after adding interest:");
          System.out.println(acct);
          System.out.println("Trying to get balance:");
          System.out.println(acct.tryRestrictedGetBalance());
            
          //working with UNLOCKED Account
          System.out.println();
          System.out.println("Let's UNLOCK the Account!");
          System.out.println();
            
          System.out.println("Trying to unlock with incorrect code:");
          acct.unlock(1234);
          System.out.println("Trying to unlock with correct code:");
          acct.unlock(12345); 
          System.out.println("Is the object locked?");
          System.out.println(acct.locked());
          System.out.println("The initial balance is:");
          System.out.println(acct.getBalance());
          acct.tryRestrictedDeposit(1230.85);
          System.out.println("Balance after depositing:");
          System.out.println(acct);
          acct.tryRestrictedWithdraw(525.0, 50.0);
          System.out.println("Balance after withdrawing:");
          System.out.println(acct);
          acct.tryRestrictedAddInterest();
          System.out.println("Balance after adding interest:");
          System.out.println(acct);
          System.out.println("Trying to get balance:");
          System.out.println(acct.tryRestrictedGetBalance());
   }
}