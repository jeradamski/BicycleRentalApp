package com.springrentalbike.models;

import javax.validation.constraints.Size;

public class ClientModel {

    @Size(min =2, max = 30)
    private String firstName;
    @Size(min = 2, max = 30)
    private String lastName;
    @Size(min = 2, max = 30)
    private String street;
    @Size(min = 1, max = 30)
    private String houseAndApartmentNumber;
    @Size(min = 6, max = 6)
    private String postalCode;
    @Size(min = 2, max = 30)
    private String city;

    private String phone;
    @Size(min=5, max=40)
    private String emailAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseAndApartmentNumber() {
        return houseAndApartmentNumber;
    }

    public void setHouseAndApartmentNumber(String houseAndApartmentNumber) {
        this.houseAndApartmentNumber = houseAndApartmentNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
