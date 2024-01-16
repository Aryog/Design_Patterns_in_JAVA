package Observer_pattern;

import java.util.concurrent.*;

public class WeatherStationExample {
    public static void main(String[] args) {
        // Create an observable (weather station)
        WeatherStation weatherStation = new WeatherStation();

        // Create observers (displays)
        Observer currentConditionsDisplay = new CurrentConditionsDisplay();
        Observer statisticsDisplay = new StatisticsDisplay();
        Observer forecastDisplay = new ForecastDisplay();

        // Register observers with the observable
        weatherStation.addObserver(currentConditionsDisplay);
        weatherStation.addObserver(statisticsDisplay);
        weatherStation.addObserver(forecastDisplay);

        // Simulate new weather data
        weatherStation.setWeatherData(75.0f, 60.0f, 1010.0f);

        // Simulate the time lapse of 2 seconds asynchronously
        CompletableFuture<Void> delayFuture = CompletableFuture.runAsync(() -> {
            try {
                // Sleep for 2 seconds for time delay
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\nThe new records are emmited by IOT every 1 sec......");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        // Block and wait for the asynchronous task to complete
        delayFuture.join();
        weatherStation.setWeatherData(75.0f, 60.0f, 1010.0f);
    }
}
