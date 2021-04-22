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
public abstract class AbstractTeacherFactory {

    public abstract Teacher getObject();

    public abstract Teacher getObject(int teacherID, String firstName, String lastName, String address, String phoneNumber, int age, int classID, int groupID, String date);

    public abstract Teacher getObject(int teacherID, String firstName, String lastName, String address, String phoneNumber, int age);

    public abstract Teacher getObject(String csv);

}
