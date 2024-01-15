package Factory_pattern;

// Car interface
interface Car {
    void start();

    void stop();
}

// Sedan class implementing the Car interface
class Sedan implements Car {
    @Override
    public void start() {
        System.out.println("Sedan car started");
    }

    @Override
    public void stop() {
        System.out.println("Sedan car stopped");
    }
}

// SUV class implementing the Car interface
class SUV implements Car {
    @Override
    public void start() {
        System.out.println("SUV started.");
    }

    @Override
    public void stop() {
        System.out.println("SUV stopped");
    }
}

// Electric Car class implementing the Car interface
class ElectricCar implements Car {
    @Override
    public void start() {
        System.out.println("Electric car started");
    }

    @Override
    public void stop() {
        System.out.println("Electric car stopped");
    }
}
