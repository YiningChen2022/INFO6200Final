/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;


public class ImmunizationFactory extends AbstractImmunizationFactory {

    private static ImmunizationFactory immunizationFactory;

    private ImmunizationFactory() {
        if (immunizationFactory != null) {
            throw new IllegalStateException();
        }
    }

    public static synchronized ImmunizationFactory getInstance() {
        if (immunizationFactory == null) {
            immunizationFactory = new ImmunizationFactory();
        }
        return immunizationFactory;
    }

    @Override
    public Immunization getObject() {
        return new Immunization();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Immunization getObject(String immuName) {
        return new Immunization(immuName); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Immunization getObject(String immuName, String dose, String description, String[] date) {
        return new Immunization(immuName, dose, description, date); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Immunization getObject(int immuID, String immuName, String dose, int duration, String description, String[] date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
