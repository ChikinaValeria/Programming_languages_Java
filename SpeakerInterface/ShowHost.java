public class ShowHost implements Speaker{
    private String name;
    private String showName;

    public ShowHost(String initName, String initShowName){
        name = initName;
        showName = initShowName;
    }

    public String getName(){
        return name;
    }

    public String getShowName(){
        return showName;
    }
    @Override
    public void speak(){
        System.out.println("Welcome to " + showName + "!");
    }
    @Override
    public void announce(String myString){
        System.out.println("We are happe to present you amazing " + myString + "!");
    }

}
