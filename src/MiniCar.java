public class MiniCar extends Car {
    public int price;
    public int speed;
    public int getPrice(){
        return 2*(price*speed);
    }
    public double getWidth(){
        return 3;
    }
    @Override
    public String getInfo(){
        return "This is a mini Car";
    }
}