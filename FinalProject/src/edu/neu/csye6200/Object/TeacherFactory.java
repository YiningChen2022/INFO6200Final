/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;


public class TeacherFactory extends AbstractTeacherFactory {

    private static TeacherFactory teacherFactory;

    private TeacherFactory() {
        if (teacherFactory != null) {
            throw new IllegalStateException();
        }
    }

    public static synchronized TeacherFactory getInstance() {
        if (teacherFactory == null) {
            teacherFactory = new TeacherFactory();
        }
        return teacherFactory;
    }

    @Override
    public Teacher getObject() {
        return new Teacher();
    }

    @Override
    public Teacher getObject(int teacherID, String firstName, String lastName, String address, String phoneNumber, int age, int classID, int groupID, String date) {
        return new Teacher(teacherID, firstName, lastName, address, phoneNumber, age, classID, groupID, date);
    }

    @Override
    public Teacher getObject(int teacherID, String firstName, String lastName, String address, String phoneNumber, int age) {
        return new Teacher(teacherID, firstName, lastName, address, phoneNumber, age);
    }

    @Override
    public Teacher getObject(String csv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
