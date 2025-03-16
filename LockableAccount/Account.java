public class Account implements Lockable{
   private final double RATE = 0.035;  // interest rate of 3.5%

   private long acctNumber;
   private double balance;
   private String name;
   private int code = 0;
   private boolean locked = false;

   public Account(String owner, long account, double initial){
      name = owner;
      acctNumber = account;
      balance = initial;
   }
   
   protected double deposit(double amount){
      balance = balance + amount;
      return balance;
   }
   
   public String tryRestrictedDeposit(double amount){
      if(locked){
          return "The access to the method deposit is prohibited";
      }else{
          balance = balance + amount;
          return Double.toString(balance);
      }
   }

   protected double withdraw(double amount, double fee){
      balance = balance - amount - fee;
      return balance;
   }

    public String tryRestrictedWithdraw(double amount, double fee){
        if(locked){
            return "The access to the method withdraw is prohibited";
        }else{
            balance = balance - amount - fee;
            return Double.toString(balance);
        }
    }

    protected double addInterest(){
      balance += (balance * RATE);
      return balance;
    }

   public String tryRestrictedAddInterest(){
    if(locked){
        return "The access to the method addInterest is prohibited";
    }else{
        balance += (balance * RATE);
        return Double.toString(balance);
    }
}

   protected double getBalance(){
       return balance;
   }     

   public String tryRestrictedGetBalance(){
      if(locked){
          return "The access to the method getBalance is prohibited";
      }else{
          return Double.toString(balance);
      }
   }
   public String toString(){
      return (acctNumber + "\t" + name + "\t" + String.format("%.2f", balance));
   }

   public void setKey(int myCode){
    code = myCode;
   }

   public void lock(int myCode){
       if (myCode == code){
           locked = true;
       }else{
           System.out.println("The code is incorrect");
       }
    }

   public void unlock(int myCode){
       if (myCode == code){
           locked = false;
       }else{
           System.out.println("The code is incorrect");
       }
   }

   public boolean locked(){
       return locked;
   }
}
