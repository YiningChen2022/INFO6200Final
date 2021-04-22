/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;

/**
 *
 * @author lln
 */
public class Person {

    private String FirstName;
    private String LastName;
    private String address;
    private String phoneNumber;
    private int age;
    private boolean registerState;

    public boolean isRegisterState() {
        return registerState;
    }

    public void setRegisterState(boolean registerState) {
        this.registerState = registerState;
    }

    public Person() {
        super();
    }

    public Person(String firstName, String lastName, String address, String phoneNumber, int age) {
        super();
        this.FirstName = firstName;
        this.LastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
