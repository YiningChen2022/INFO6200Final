/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lln
 */
public class Group extends AbstractGroup {

    private int classID;
    private List<Student> studentsList;
    private Teacher teacher;
    private boolean tech = false;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean isTech() {
        return tech;
    }

    public void setTech(boolean tech) {
        this.tech = tech;
    }

    public Group() {
        this.studentsList = new ArrayList<>();
    }

    public Group(int groupID, int size, int classID) {
        super(groupID, size);
        this.classID = classID;
        this.studentsList = new ArrayList<>();
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getTeacher().getTeacherID());
    }

}
