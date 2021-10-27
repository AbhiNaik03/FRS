package com.company.FlightReservationSystem;

public class Flight {
    private String flightNum;
    private String airlineName;
    private static int seatBook = 0;
    private int capacity;


    public String getFlightNumber() {
        return flightNum;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNum = flightNumber;
    }

    public String getAirline() {
        return airlineName;
    }

    public void setAirline(String airline) {
        this.airlineName = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Flight(String flightNum, String airlineName, int capacity) {
        this.flightNum = flightNum;
        this.airlineName = airlineName;
        this.capacity = capacity;
    }

    public String getFlightDetails() {
        return flightNum + airlineName;
    }

    public int availableSeats() {
        int availableSeats = capacity - seatBook;
        return availableSeats;
    }

    public void increaseCount() {
        seatBook = seatBook + 1;
    }
}
