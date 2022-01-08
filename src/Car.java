abstract class Car {
    abstract void getInfo();

    abstract double getPrice();
}

class LargeCar extends Car {
    void getInfo() {
        System.out.println("This is a large Car.");
    }

    double getPrice() {
        return 100;
    }
}

class Bus extends LargeCar {
    double length;
    double width;
    double height;

    Bus(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    void countPass(int numbers) {
        int count = numbers + 2;
        System.out.println("Count of passengers in the bus = " + count + " and the length is = " + length);
    }

    void getInfo() {
        System.out.println("This is a bus.");
    }

    double getInfo(double width) {
        return this.width;
    }
}

class MiniCar extends Car {
    int price;
    int speed;

    void getInfo() {
        System.out.println("This is a mini Car.");
    }

    double getPrice() {
        return 2 * (price * speed);
    }

    double countPower() {
        return 50;
    }
}

class SportCar extends MiniCar {
    boolean hasRoof;
    String licence;

    SportCar(boolean hasRoof, String licence) {
        this.hasRoof = hasRoof;
        this.licence = licence;
    }

    SportCar(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }


    double countPower() {
        return super.countPower() + 50;
    }

}

class Main {
    public static void main(String[] args) {
        LargeCar largeCar = new LargeCar();
        largeCar.getInfo();
        Bus bus = new Bus(40, 2, 3);
        bus.countPass(10);
        bus.getInfo();
        System.out.println(bus.getInfo(2));
        SportCar audi = new SportCar(true, "AX 2107 XA");
        SportCar bmw = new SportCar(100, 200);
        System.out.println(audi.countPower());
        System.out.println(bmw.getPrice());

    }
}


