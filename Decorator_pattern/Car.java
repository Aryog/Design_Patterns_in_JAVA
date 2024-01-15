package Decorator_pattern;

// Component interface representing the basic Car
interface Car {
    String assemble();
}

// Concrete component representing the basic car

class BasicCar implements Car {
    @Override
    public String assemble() {
        return "Basic Car: Engine, Wheels, Basic Interior";
    }
}

// Decorator abstract class
abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String assemble() {
        return car.assemble();
    }
}

// Concrete decorators
class GPSDecorator extends CarDecorator {
    public GPSDecorator(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + ", GPS";
    }
}

class LeatherSeatsDecorator extends CarDecorator {
    public LeatherSeatsDecorator(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + ", Leather Seats";
    }
}

class SunroofDecorator extends CarDecorator {
    public SunroofDecorator(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + ", Sunroof";
    }
}