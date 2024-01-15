package Factory_pattern;

public class CarClient {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();
        sedan.start();
        sedan.stop();

        CarFactory suvFactory = new SUVFactory();
        Car suv = suvFactory.createCar();
        suv.start();
        suv.stop();

        CarFactory electricCarFactory = new ElectricCarFactory();
        Car electricCar = electricCarFactory.createCar();
        electricCar.start();
        electricCar.stop();
    }
}
