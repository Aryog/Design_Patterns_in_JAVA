package Observer_pattern;

import java.util.ArrayList;

// Observer interface
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}

// Observable interface (maintains list of observers)
interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

class WeatherStation implements Observable {
    private ArrayList<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}

// Concrete implementation of Observer (Display)
class CurrentConditionsDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions: Temperature " + temperature + "F, Humidity " + humidity + "%, Pressure "
                + pressure);
    }
}

class StatisticsDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(
                "Statistics display Updated: Temperature " + temperature + "F, Humidity " + humidity + "%, Pressure "
                        + pressure);
    }
}

class ForecastDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(
                "Forecast display Updated: Temperature " + temperature + "F, Humidity " + humidity + "%, Pressure "
                        + pressure);
    }
}