public class Car {
    private String make;
    private String model;
    private int year;

    final int currentYear = 2025;

    public Car(String initialMake, String initialModel, int initialYear){
        make = initialMake;
        model = initialModel;
        year = initialYear;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int newYear){
        year = newYear;
    }
    public String getMake(){
        return make;
    }
    public void setMake(String newMake){
        make = newMake;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String newModel){
        model = newModel;
    }
    public boolean isAntique(){
        if (year<currentYear-45){
            return true;
        }else{
            return false;
        }
    }
}
