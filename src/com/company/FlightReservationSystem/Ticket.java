package com.company.FlightReservationSystem;

public class Ticket {
    private int prn;
    private String flightFrom;
    private String flightTo;
    private Flight flight;
    private String fromDateTime;
    private String toDateTime;
    private Passenger passenger;
    private int seatNum;
    private float flightPrice;
    private boolean ticketCancel = false;

    public Ticket(int prn, String flightFrom, String flightTo, Flight flight, String fromDateTime, String toDateTime, Passenger passenger, int seatNum, float flightPrice) {
        this.prn = prn;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flight = flight;
        this.fromDateTime = fromDateTime;
        this.toDateTime = toDateTime;
        this.passenger = passenger;
        this.seatNum = seatNum;
        this.flightPrice = flightPrice;
    }

    public int getPrn() {
        return prn;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }

    public String getFromDateTime() {
        return fromDateTime;
    }

    public void setFromDateTime(String fromDateTime) {
        this.fromDateTime = fromDateTime;
    }

    public String getToDateTime() {
        return toDateTime;
    }

    public void setToDateTime(String toDateTime) {
        this.toDateTime = toDateTime;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public float getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(float flightPrice) {
        this.flightPrice = flightPrice;
    }

    public String checkStatus() {
        return "Booked Status: " + ticketCancel;
    }

    public void cancelTicket() {
        this.ticketCancel = true;
    }
}
