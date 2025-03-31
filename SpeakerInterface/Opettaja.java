public class Opettaja implements Speaker{
    private String name;
    private String subject;

    public Opettaja(String initName, String initSubject){
        name = initName;
        subject = initSubject;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return subject;
    }

    @Override
    public void speak() {
        System.out.println("Teacher: Today we will learn about Java interfaces.");
    }

    @Override
    public void announce(String str) {
        System.out.println("Educational Announcement: " + str);
    }
    
}
