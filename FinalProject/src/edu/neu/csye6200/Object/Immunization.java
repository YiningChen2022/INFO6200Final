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
public class Immunization {

    private int immuID;
    private String immuName;
    private String dose;
    private int duration;
    private String description;
    private String[] date;
    private String[] expectedDate;

    @Override
    public String toString() {
        return immuName;
    }

    public Immunization() {
        super();
    }

    public Immunization(String name) {
        super();
        this.immuName = name;
    }

    public Immunization(int immuID, String immuName, String dose, int duration, String description, String[] date) {
        super();
        this.immuID = immuID;
        this.immuName = immuName;
        this.dose = dose;
        this.duration = duration;
        this.description = description;
        this.date = date;
    }

    public Immunization(String name, String doses, String description, String[] date) {
        super();
        this.immuName = name;
        this.dose = doses;
        this.date = date;
        this.description = description;
    }

    public int getImmuID() {
        return immuID;
    }

    public void setImmuID(int immuID) {
        this.immuID = immuID;
    }

    public String getImmuName() {
        return immuName;
    }

    public void setImmuName(String immuName) {
        this.immuName = immuName;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getDate() {
        return date;
    }

    public void setDate(String[] date) {
        this.date = date;
    }

    public String[] getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String[] expectedDate) {
        this.expectedDate = expectedDate;
    }

}
