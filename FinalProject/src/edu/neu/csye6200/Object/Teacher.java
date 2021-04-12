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
public class Teacher extends Person{
    private int teacherID;
    
    private int classID;
    
    private int groupID;
    private String registerDate;

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    //private static int i = 0;
      public Teacher() {
		super();
		
	}
    public  Teacher(String csv){

    }
	
	
	public Teacher(int teacherID,String firstName, String lastName, String address, String phoneNumber, int age,int classID, int groupID,String registerDate) {
		super(firstName, lastName, address, phoneNumber, age);
		this.teacherID = teacherID;
		this.classID = classID;
		this.groupID = groupID;
                this.registerDate=registerDate;
                this.setRegisterState(true);
               
	}

    public Teacher(int teacherID,String firstName, String lastName, String address, String phoneNumber, int age) {
        super(firstName, lastName, address, phoneNumber, age);
        this.teacherID=teacherID;
        this.setRegisterState(true);
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    @Override
    public String toString() {
        return String.valueOf(teacherID);
    }
}
