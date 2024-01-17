package Facade_pattern;

import java.util.Map;

class FlightBookingSystem {
    public void bookFlight(String details) {
        System.out.println("Booking flight for: " + details);
        // Additional logic for interacting with the flight booking sys.
    }
}

class HotelReservationSystem {
    public void reserveHotel(String details) {
        System.out.println("Reserving hotel for: " + details);
        // Additional logic for interacting with the hotel reservation sys.
    }
}

class CarRentalSystem {
    public void rentCar(String details) {
        System.out.println("Renting car for: " + details);
        // Additional logic for interacting with the Car Rental Sys.
    }
}

// Facade
class TravelBookingFacade {
    private FlightBookingSystem flightBookingSystem;
    private HotelReservationSystem hotelReservationSystem;
    private CarRentalSystem carRentalSystem;

    public TravelBookingFacade() {
        this.flightBookingSystem = new FlightBookingSystem();
        this.hotelReservationSystem = new HotelReservationSystem();
        this.carRentalSystem = new CarRentalSystem();
    }

    public void planTrip(Map<String, String> tripDetails) {
        // Simplified interface to plan a trip
        String flightDetails = tripDetails.get("flight");
        String hotelDetails = tripDetails.get("hotel");
        String carDetails = tripDetails.get("car");
        flightBookingSystem.bookFlight(flightDetails);
        hotelReservationSystem.reserveHotel(hotelDetails);
        carRentalSystem.rentCar(carDetails);
    }
}