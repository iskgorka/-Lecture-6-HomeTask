public class Main {
    public static void main(String [] args){
        MiniCar audi = new MiniCar(); //object
        audi.price = 5;
        audi.speed = 10;
        System.out.println(audi.getWidth());
        SportCar audir8 = new SportCar(false,"QWE 456"); //object
        audir8.price = 20;
        audir8.speed = 20;
        audir8.color = "green";
        System.out.println("Price of " + audir8.color + " Audi R8 is " + audir8.getPrice());
        audir8.countPower(800);
        Bus merc = new Bus();
        merc.height = 4;
        merc.countPass(20);

    }
}
