package solution.proxy;

interface Car {
    void drive();
}

class RealCar implements Car {

    @Override
    public void drive() {
        System.out.println("Driving!");
    }
}

class Driver {
    private int age;

    public Driver(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class CarProxy implements Car {

    private Driver driver;
    private Car realCar;

    public CarProxy(Driver driver) {
        this.driver = driver;
        this.realCar = new RealCar();
    }

    @Override
    public void drive() {
        if(driver.getAge() < 18) {
            System.out.println("Can't drive!");
        } else {
            this.realCar.drive();
        }
    }
}


public class ProxyDemo {
    public static void main(String[] args) {
        Driver youngDriver = new Driver(16);
        Driver oldDriver = new Driver(51);

        Car car1 = new CarProxy(youngDriver);
        Car car2 = new CarProxy(oldDriver);

        car1.drive();
        car2.drive();
    }
}
