public class SportCar extends MiniCar{
    public String color;
    boolean hasRoof;
    String licence;
    protected SportCar(boolean hasRoof, String licence){
        this.hasRoof = hasRoof;
        this.licence = licence;
    }
    public void countPower(int numbers){
        int count = numbers+5;
        System.out.println("Count of power in this car = " + count);
    }
}
