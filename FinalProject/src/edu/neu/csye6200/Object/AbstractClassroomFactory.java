/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;


public abstract class AbstractClassroomFactory {

    public abstract Classroom getObject();

    public abstract Classroom getObject(int classId, int stuAge, int classSize);
}
