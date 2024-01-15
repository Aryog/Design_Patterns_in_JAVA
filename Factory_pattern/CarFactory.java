package Factory_pattern;

interface CarFactory {
    Car createCar();
}

// SedanFactory class implementing CarFactory interface
class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}

// SUVFactory class implementing CarFactory interface
class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SUV();
    }
}

// ElectricCarFactory class implementing CarFactory interface
class ElectricCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new ElectricCar();
    }
}
