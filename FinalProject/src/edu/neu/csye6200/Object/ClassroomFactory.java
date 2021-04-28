/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;


public class ClassroomFactory extends AbstractClassroomFactory {

    private static ClassroomFactory classroomFactory;

    private ClassroomFactory() {
        if (classroomFactory != null) {
            throw new IllegalStateException();
        }
    }

    public static synchronized ClassroomFactory getInstance() {
        if (classroomFactory == null) {
            classroomFactory = new ClassroomFactory();
        }
        return classroomFactory;
    }

    @Override
    public Classroom getObject() {
        return new Classroom();
    }

    @Override
    public Classroom getObject(int classId, int stuAge, int classSize) {
        return new Classroom(classId, stuAge, classSize);
    }

}
