package com.company.FlightReservationSystem;

public class Passenger {
    private static int idCount = 0;
    private int id;

    private static class Address {
        String street, city, state;


        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private Address address;

    private static class Contact {
        String contactName, contactPhone, contactEmail;


        public Contact(String contactName, String contactPhone, String contactEmail) {
            this.contactName = contactName;
            this.contactPhone = contactPhone;
            this.contactEmail = contactEmail;
        }
    }

    private Contact contact;

    public Passenger(String contactName, String contactPhone,String contactEmail, String street, String city, String state) {
        this.id = ++idCount;
        this.contact = new Contact(contactName, contactPhone, contactEmail);
        this.address = new Address(street, city, state);
    }

    public String getAddressDetails() {
        return address.street + address.city + address.state;
    }

    public String getContactDetails() {
        return contact.contactName + contact.contactPhone + contact.contactEmail;
    }

    public static int getPassengerCount() {
        return idCount;
    }
}
