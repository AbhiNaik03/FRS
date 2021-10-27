package com.company.FlightReservationSystem;

public class RegularTicket extends Ticket{
    private String foodAndBeverages;

    public RegularTicket(int prn, String flightFrom, String to, Flight flight, String fromDateTime, String toDateTime, Passenger passenger, int seatNum, float flightPrice, String foodAndBeverages) {
        super(prn, flightFrom, flightFrom, flight, fromDateTime, toDateTime, passenger, seatNum, flightPrice);
        this.foodAndBeverages = foodAndBeverages;
    }

    public String getOrderDetails() {
        return foodAndBeverages;
    }
}
