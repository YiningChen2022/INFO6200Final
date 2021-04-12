/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;

import edu.neu.csye6200.Object.*;

import java.util.List;

/**
 *
 * @author lln
 */
public class Driver {
    public static void main (String arg[]){
        DataStore dataStore = DataStore.getInstance();
        RatioRule.stuTogroup(dataStore.getStuList(),dataStore);
        RatioRule.techTogroup(dataStore.getTchList(),dataStore);
        Student stu=new Student(100301,"yu","chen","151 park drive","8572962538",27);
        Teacher teacher= TeacherFactory.getInstance().getObject(100,"Peter","AA","149 PARKDR","123456",35);
    //    RatioRule.addStu(stu,dataStore);
        RatioRule.addTech(teacher,dataStore);
        RatioRule.removeStu(stu,dataStore);
        for(Classroom c: dataStore.getClassroomList()){
                    
                        System.out.println(c);
        }
        for(Classroom c: dataStore.getClassroomList()){
                    for(Group g : c.getGroupList()){
                        System.out.println(g);
                    }
                }
        for(Group g : dataStore.getGroupList()){
                        System.out.println(g);
         }

        for(Student s:dataStore.getStuList()){
            System.out.println(s);
        }
        String[] date=dataStore.getStuList().get(1).getImmunizationmap().get("Hib").getDate();

        System.out.println(date[1]);
        for(Teacher t:dataStore.getTchList()){
            System.out.println(t);
        }
       
    String []des=dataStore.getStuList().get(2).getImmunizationmap().get("Dtap").getDate();
    String a =dataStore.getImmuList().get("Hepatitis B(Hepb)").toString();
   
    
    Student s1=new Student();
    String b=s1.getImmunizationmap().get("Dtap").getImmuName();
     
    System.out.println(b);
    
    }

 

}
