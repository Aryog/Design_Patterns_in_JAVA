package Facade_pattern;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
        // Client uses the facade to plan a trip
        TravelBookingFacade travelBookingFacade = new TravelBookingFacade();

        // Prepare trip details
        Map<String, String> tripDetails = Map.of(
                "flight", "Destination: XYZ, Dates: MM/DD/YYYY",
                "hotel", "Hotel: ABC, Dates: MM/DD/YYYY",
                "car", "Car Type: Sedan, Dates: MM/DD/YYYY");

        travelBookingFacade.planTrip(tripDetails);
    }
}
