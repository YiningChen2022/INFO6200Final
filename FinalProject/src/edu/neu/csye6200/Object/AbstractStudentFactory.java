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
public abstract class AbstractStudentFactory {

    public abstract Student getObject();

    public abstract Student getObject(int stuID, String firstName, String lastName, String address, String phoneNumber, int age);

    public abstract Student getObject(String csv);

}
