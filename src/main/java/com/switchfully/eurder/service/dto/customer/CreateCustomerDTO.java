package com.switchfully.eurder.service.dto.customer;

public class CreateCustomerDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;

    private String password;

    public CreateCustomerDTO setPassword(String password){
        this.password = password;
        return this;
    }

    public CreateCustomerDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CreateCustomerDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CreateCustomerDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public CreateCustomerDTO setAddress(String address) {
        this.address = address;
        return this;
    }

    public CreateCustomerDTO setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }
}
