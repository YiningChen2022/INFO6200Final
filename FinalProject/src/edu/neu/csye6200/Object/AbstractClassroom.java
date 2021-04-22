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
public abstract class AbstractClassroom {

    private int classId;
    private int stuAge;
    private int classSize = 0;
    private int stuClassroomCount = 0;
    private int groupCount;
    private List<Group> groupList;
    private boolean full = false;

    public AbstractClassroom() {
        super();
        this.groupList = new ArrayList<>();
    }

    public AbstractClassroom(int classId, int stuAge, int classSize) {
        super();
        this.classId = classId;
        this.stuAge = stuAge;
        this.classSize = classSize;
        this.groupList = new ArrayList<>();
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public int getClassSize() {
        return classSize;
    }

    public void setClassSize(int classSize) {
        this.classSize = classSize;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public int getStuClassroomCount() {
        return stuClassroomCount;
    }

    public void setStuClassroomCount(int stuClassroomCount) {
        this.stuClassroomCount = stuClassroomCount;
    }

    @Override
    public String toString() {
        return "Classroom{" + "classId=" + classId + ", stuLevel=" + stuAge + ", classSize=" + classSize + ", CurretStuCount=" + stuClassroomCount + ", full=" + full + '}';
    }

}
