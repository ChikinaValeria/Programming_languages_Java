public class Coin implements Lockable{
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int code = 0;
   private boolean locked = false;
   private int face;

   public Coin(){
      flip();
   }

   public void flip()
   {
      face = (int) (Math.random() * 2);
   }

   protected boolean isHeads()
   {
      return (face == HEADS);
   }
   
   public void tryRestrictedIsHead(){
       if(locked){
           System.out.println("The access to the method IsHead is prohibited");
       }else{
            if (isHeads()) {
                System.out.println("You win.");
            } else {
                System.out.println("Better luck next time.");
        }
       }
   }

   public String toString(){
      String faceName;

      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }

   public String tryRestrictedToString(){
       if(locked){
           return "The access to the method toString is prohibited";
       }else{
           return toString();
       }
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

