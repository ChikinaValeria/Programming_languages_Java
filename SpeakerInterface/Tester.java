public class Tester {
    
    public static void main(String[] args){
         Speaker somebody = new ShowHost("John", "Morning show");
         somebody.speak();
         somebody.announce("Meril Strip");

         somebody = new Opettaja("Mirja Pakkonen", "Suomen kieli");
         somebody.speak();
         somebody.announce("We are not having a lesson today because I got sick.");

         somebody = new Actor("Mark Rylance");
         somebody.speak();
         somebody.announce("Good night, good night! Parting is such sweet sorrow, that I shall say good night till it be morrow.");
    }
}