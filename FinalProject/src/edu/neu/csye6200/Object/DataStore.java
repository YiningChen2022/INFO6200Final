/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;

import edu.neu.csye6200.Controller.FileUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author lln
 */
public class DataStore {
    
    private static DataStore dataStore;
        
	private List<Student> stuList;
	private List<Teacher> tchList;
	private List<Group> groupList;
	private List<Classroom> classroomList;
	private Map<String,Immunization> immuList;

        private DataStore() {
		stuList = new ArrayList<>();
		tchList = new ArrayList<>();
		groupList = new ArrayList<>();
		classroomList = new ArrayList<>();
		immuList = new HashMap<>();
                
                Classroom class1 = ClassroomFactory.getInstance().getObject(1,1,12);
                Classroom class2 = ClassroomFactory.getInstance().getObject(2,2,15);
                Classroom class3 = ClassroomFactory.getInstance().getObject(3,3,18);
                  
                Classroom class4 = ClassroomFactory.getInstance().getObject(4,4,24);
                Classroom class5 = ClassroomFactory.getInstance().getObject(5,5,24);
                Classroom class6 = ClassroomFactory.getInstance().getObject(6,6,30);
                
                this.classroomList.add(class1);
                this.classroomList.add(class2);
                this.classroomList.add(class3);
                
                this.classroomList.add(class4);
                this.classroomList.add(class5);
                this.classroomList.add(class6);
                
                Group g101 = GroupFactory.getInstance().getObject(101,4,1);
                Group g102 = GroupFactory.getInstance().getObject(102,4,1);
                Group g103 = GroupFactory.getInstance().getObject(103,4,1);
                
                class1.getGroupList().add(g101);
                class1.getGroupList().add(g102);
                class1.getGroupList().add(g103);
                
                this.getGroupList().add(g101);
                this.getGroupList().add(g102);
                this.getGroupList().add(g103);
                
                Group g201 = GroupFactory.getInstance().getObject(201,5,2);
                Group g202 = GroupFactory.getInstance().getObject(202,5,2);
                Group g203 = GroupFactory.getInstance().getObject(203,5,2);
                
                class2.getGroupList().add(g201);
                class2.getGroupList().add(g202);
                class2.getGroupList().add(g203);
                
                this.getGroupList().add(g201);
                this.getGroupList().add(g202);
                this.getGroupList().add(g203);
                
                Group g301 = GroupFactory.getInstance().getObject(301,6,3);
                Group g302 = GroupFactory.getInstance().getObject(302,6,3);
                Group g303 = GroupFactory.getInstance().getObject(303,6,3);
                
                class3.getGroupList().add(g301);
                class3.getGroupList().add(g302);
                class3.getGroupList().add(g303);
                
                this.getGroupList().add(g301);
                this.getGroupList().add(g302);
                this.getGroupList().add(g303);
                
	        Group g401 = GroupFactory.getInstance().getObject(401,8,4);
                Group g402 = GroupFactory.getInstance().getObject(402,8,4);
                Group g403 = GroupFactory.getInstance().getObject(403,8,4);
                
                class4.getGroupList().add(g401);
                class4.getGroupList().add(g402);
                class4.getGroupList().add(g403);
                
                this.getGroupList().add(g401);
                this.getGroupList().add(g402);
                this.getGroupList().add(g403);
        
           
	        Group g501 = GroupFactory.getInstance().getObject(501,12,5);
                Group g502 = GroupFactory.getInstance().getObject(502,12,5);
               
                class5.getGroupList().add(g501);
                class5.getGroupList().add(g502);
                
                this.getGroupList().add(g501);
                this.getGroupList().add(g502);
                
                
	        Group g601 = GroupFactory.getInstance().getObject(601,15,6);
                Group g602 = GroupFactory.getInstance().getObject(602,15,6);
               
                class6.getGroupList().add(g601);
                class6.getGroupList().add(g602);
                
                this.getGroupList().add(g601);
                this.getGroupList().add(g602);
                
                this.stuList=FileUtil.readStudentFile();
                this.tchList=FileUtil.readTeacherFile();
                this.immuList=FileUtil.readImmunizationFile();
         
        
        }
	
	public static DataStore getInstance() {
	    if(dataStore == null)
                 dataStore = new DataStore();
            return dataStore;
	}

        
        
    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    public List<Teacher> getTchList() {
        return tchList;
    }

    public void setTchList(List<Teacher> tchList) {
        this.tchList = tchList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public List<Classroom> getClassroomList() {
        return classroomList;
    }

    public void setClassroomList(List<Classroom> classroomList) {
        this.classroomList = classroomList;
    }

    public Map<String,Immunization> getImmuList() {
        return immuList;
    }

    public void setImmuList(Map<String,Immunization> immuList) {
        this.immuList = immuList;
    }
	
	
    

	
}
