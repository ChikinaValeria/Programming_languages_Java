public class Actor implements Speaker {
    private String name;

    public Actor(String initName) {
        name = initName;
    }

    public String getName(){
        return name;
    }

    @Override
    public void speak() {
        System.out.println(name + ": O Romeo, Romeo! wherefore art thou Romeo?");
    }

    @Override
    public void announce(String str) {
        System.out.println(name + " dramatically announces: " + str);
    }
}
