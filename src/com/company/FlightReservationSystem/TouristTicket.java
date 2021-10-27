package com.company.FlightReservationSystem;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] touristLocations;

    public TouristTicket(int prn, String flightFrom, String flightTo, Flight flight, String fromDateTime, String toDateTime, Passenger passenger, int seatNum, float flightPrice, String hotelAddress, String[] touristLocations) {
        super(prn, flightFrom, flightTo, flight, fromDateTime, toDateTime, passenger, seatNum, flightPrice);
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void getTouristLocations() {
        for(int i=0; i<touristLocations.length; i++) {
            System.out.println(touristLocations[i]);
        }
    }

    public void removeLocations(String newTouristLocation) {
        for (int i = 0; i<touristLocations.length; i++) {
            if (touristLocations[i].equals(newTouristLocation)) {
                touristLocations[i] = null;
            }
        }
    }

    public void addLocations(String [] location) {
        touristLocations = location;
    }

}
