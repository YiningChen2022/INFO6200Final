/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;

import java.util.List;

/**
 *
 * @author lln
 */
public class RatioRule {
     
    public  static void stuTogroup(List<Student> students,DataStore dataStore){
            for(Student stu:students){
               for(Classroom c:dataStore.getClassroomList()){
                   if(c.getClassId()==stu.getClassID()&&c.getStuClassroomCount()<c.getClassSize()){
                       for(Group g:c.getGroupList()){
                           if(g.getGroupID()==stu.getGroupID()){
                               g.getStudentsList().add(stu);

                               g.setCount(g.getCount()+1);
                               c.setStuClassroomCount(c.getStuClassroomCount()+1);
                              break;
                           }
                       }

                     break;
                   }

                }
            }
     }
     public synchronized static void techTogroup(List<Teacher> teachers,DataStore dataStore){
        for(Group group:dataStore.getGroupList()){
            for(Teacher teacher:dataStore.getTchList()){
                if (teacher.getGroupID()==group.getGroupID()&&!group.isTech()){
                    group.setTeacher(teacher);
                    group.setTech(true);
                    break;
                }
            }

        }
    }
  public synchronized static void removeStu(Student student,DataStore dataStore){
     for(Classroom classroom:dataStore.getClassroomList()){
         for(Group group:classroom.getGroupList()){
             for(Student stu:group.getStudentsList()){
                 if(stu.getStuID()==student.getStuID()){
                     stu.setRegisterState(false);
                     group.setCount(group.getCount()-1);
                     classroom.setStuClassroomCount(classroom.getStuClassroomCount()-1);
                 }
             }
         }
     }
    }
    public synchronized static void removeTeh(Teacher teacher,DataStore dataStore){
        for(Group group:dataStore.getGroupList()){
            if(teacher.getTeacherID()==group.getTeacher().getTeacherID()){
                group.getTeacher().setRegisterState(false);
            }
        }

    }
    public synchronized static void addTech(Teacher teacher,DataStore dataStore) {
       for (Classroom classroom : dataStore.getClassroomList()) {
           for (Group group : classroom.getGroupList()) {
               if ((!group.isTech())) {
                   teacher.setRegisterState(true);
                   group.setTeacher(teacher);
                   group.setTech(true);
                   teacher.setGroupID(group.getGroupID());
                   teacher.setClassID(classroom.getClassId());
                   dataStore.getTchList().add(teacher);
                   
                   break;
               }
           }
         break;
       }
   }
    public synchronized static void addStu(Student stu,DataStore datastore){
        if(stu.getAge()>=6 & stu.getAge()<=12) {
	  for(Classroom classroom:datastore.getClassroomList()){
              if(classroom.getClassId()==1&&classroom.getGroupCount()<classroom.getClassSize()){
                  for(Group group:classroom.getGroupList()){
                      if(group.getCount()<group.getSize()){
                          group.getStudentsList().add(stu);
                          stu.setRegisterState(true);
                          stu.setGroupID(group.getGroupID());
                          stu.setClassID(classroom.getClassId());
                          group.setCount(group.getCount()+1);
                          classroom.setStuClassroomCount(classroom.getStuClassroomCount()+1);
                         break;
                      }
                   }
               datastore.getStuList().add(stu);
                break;
              }   
           }			
        }
      if(stu.getAge()>=13 & stu.getAge()<=24) {
	  for(Classroom classroom:datastore.getClassroomList()){
              if(classroom.getClassId()==2&&classroom.getStuClassroomCount()<classroom.getClassSize()){
                  for(Group group:classroom.getGroupList()){
                      if(group.getCount()<group.getSize()){
                          group.getStudentsList().add(stu);
                           stu.setRegisterState(true);
                          stu.setGroupID(group.getGroupID());
                          stu.setClassID(classroom.getClassId());
                          group.setCount(group.getCount()+1);
                          classroom.setStuClassroomCount(classroom.getStuClassroomCount()+1);
                         break;
                      }
                   }
                  datastore.getStuList().add(stu);
                break;
              }   
           }			
        }
    
    if(stu.getAge()>=25 & stu.getAge()<=35) {
	  for(Classroom classroom:datastore.getClassroomList()){
              if(classroom.getClassId()==3&&classroom.getStuClassroomCount()<classroom.getClassSize()){
                  for(Group group:classroom.getGroupList()){
                      if(group.getCount()<group.getSize()){
                          group.getStudentsList().add(stu);
                           stu.setRegisterState(true);
                          stu.setGroupID(group.getGroupID());
                          stu.setClassID(classroom.getClassId());
                          group.setCount(group.getCount()+1);
                           classroom.setStuClassroomCount(classroom.getStuClassroomCount()+1);
                         break;
                      }
                   }
                  datastore.getStuList().add(stu);
                break;
              }   
           }			
        }
    if(stu.getAge()>=36 & stu.getAge()<=47) {
	  for(Classroom classroom:datastore.getClassroomList()){
              if(classroom.getClassId()==4&&classroom.getStuClassroomCount()<classroom.getClassSize()){
                  for(Group group:classroom.getGroupList()){
                      if(group.getCount()<group.getSize()){
                          group.getStudentsList().add(stu);
                           stu.setRegisterState(true);
                          stu.setGroupID(group.getGroupID());
                          stu.setClassID(classroom.getClassId());
                          group.setCount(group.getCount()+1);

                          classroom.setStuClassroomCount(classroom.getStuClassroomCount()+1);
                         break;
                      }
                   }
                  datastore.getStuList().add(stu);
                break;
              }   
           }			
        }
    if(stu.getAge()>=48 & stu.getAge()<=59) {
	  for(Classroom classroom:datastore.getClassroomList()){
              if(classroom.getClassId()==5&&classroom.getStuClassroomCount()<classroom.getClassSize()){
                  for(Group group:classroom.getGroupList()){
                      if(group.getCount()<group.getSize()){
                          group.getStudentsList().add(stu);
                           stu.setRegisterState(true);
                          stu.setGroupID(group.getGroupID());
                          stu.setClassID(classroom.getClassId());
                          group.setCount(group.getCount()+1);
                          classroom.setStuClassroomCount(classroom.getStuClassroomCount()+1);
                         break;
                      }
                   }
                  datastore.getStuList().add(stu);
                break;
              }   
           }			
        }
    if(stu.getAge()>=60) {
	  for(Classroom classroom:datastore.getClassroomList()){
              if(classroom.getClassId()==6&&classroom.getStuClassroomCount()<classroom.getClassSize()){
                  for(Group group:classroom.getGroupList()){
                      if(group.getCount()<group.getSize()){
                          group.getStudentsList().add(stu);
                           stu.setRegisterState(true);
                          stu.setGroupID(group.getGroupID());
                          stu.setClassID(classroom.getClassId());
                          group.setCount(group.getCount()+1);
                         classroom.setStuClassroomCount(classroom.getStuClassroomCount()+1);
                          break;
                      }
                   }
                  datastore.getStuList().add(stu);
                break;
              }   
           }			
        }
    
    }
    






}
