/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;


public abstract class AbstractImmunizationFactory {

    public abstract Immunization getObject();

    public abstract Immunization getObject(String immuName);

    public abstract Immunization getObject(int immuID, String immuName, String dose,
            int duration, String description, String[] date);

    public abstract Immunization getObject(String immuName, String dose,
            String description, String[] date);

}
