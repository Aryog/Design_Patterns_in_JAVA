package Decorator_pattern;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Create a basic car
        Car basicCar = new BasicCar();
        System.out.println("Basic Car: " + basicCar.assemble());

        // Decorate the basic car with GPS and Leather Seats
        Car gpsLeatherCar = new LeatherSeatsDecorator(new GPSDecorator(basicCar));
        System.out.println("Car with GPS and Leather Seats: " + gpsLeatherCar.assemble());

        // Decorate the basic car with Sunroof
        Car sunroofCar = new SunroofDecorator(new BasicCar());
        System.out.println("Car with Sunfoorf: " + sunroofCar.assemble());
    }
}
