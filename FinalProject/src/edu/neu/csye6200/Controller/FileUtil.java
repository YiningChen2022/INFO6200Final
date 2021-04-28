/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Controller;

import edu.neu.csye6200.Object.Immunization;
import edu.neu.csye6200.Object.Student;
import edu.neu.csye6200.Object.StudentFactory;
import edu.neu.csye6200.Object.Teacher;
import edu.neu.csye6200.Object.TeacherFactory;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FileUtil {
    static List<Student> students = new ArrayList<>();
    static List<Teacher> teachers = new ArrayList<>();
    public static List<Student> readStudentFile() {

        try ( BufferedReader inLine = new BufferedReader(new FileReader("./studentCSV.csv"));) {
            String inputLine = null;	                                            // read one line from file at a time
            while ((inputLine = inLine.readLine()) != null) {                       // Parse line converting each string token into a Student object field
                Student stu = StudentFactory.getInstance().getObject(inputLine);
                students.add(stu);
            }
        } catch (IOException e) {
            // catch IOException (and implicitly FileNotFoundException)
            e.printStackTrace();
        }
        return students;

    }
    
    public  static void writeCsv(){
        try{
        BufferedWriter out = new BufferedWriter(new FileWriter("./studentCSV.csv"));
        String total = "";
        for(int i= 0 ;i<students.size(); i++){
            Student stu = students.get(i);
            String comma = ",";
            String[] hibInfo = stu.getImmunizationmap().get("Hib").getDate();
            String[] dtapInfo = stu.getImmunizationmap().get("Dtap").getDate();
            String[] polioInfo = stu.getImmunizationmap().get("Polio").getDate();
            String[] bInfo = stu.getImmunizationmap().get("Hepatitis B").getDate();
            String[] mmrInfo = stu.getImmunizationmap().get("MMR").getDate();
            String[] varicellaInfo = stu.getImmunizationmap().get("Varicella").getDate();
            String[] meningococcalInfo = stu.getImmunizationmap().get("Meningococcal").getDate();
            
            String s = stu.getStuID()+comma+stu.getAge()+comma+stu.getFirstName()+comma+stu.getLastName()+comma
                    +stu.getParentFirstName()+comma+stu.getParentLastName()+comma+stu.getAddress()+comma
                    +stu.getPhoneNumber()+comma+stu.getBirthday()+comma
                    +"Hib"+comma+hibInfo[0]+comma+hibInfo[1]+comma+hibInfo[2]+comma+hibInfo[3]+comma+hibInfo[4]+comma
                    +"Dtap"+comma+dtapInfo[0]+comma+dtapInfo[1]+comma+dtapInfo[2]+comma+dtapInfo[3]+comma+dtapInfo[4]+comma
                    +"Polio"+comma+polioInfo[0]+comma+polioInfo[1]+comma+polioInfo[2]+comma+polioInfo[3]+comma+polioInfo[4]+comma
                    +"Hepatitis B"+comma+bInfo[0]+comma+bInfo[1]+comma+bInfo[2]+comma+bInfo[3]+comma+bInfo[4]+comma
                    +"MMR"+comma+mmrInfo[0]+comma+mmrInfo[1]+comma+mmrInfo[2]+comma+mmrInfo[3]+comma+mmrInfo[4]+comma
                    +"Varicella"+comma+varicellaInfo[0]+comma+varicellaInfo[1]+comma+varicellaInfo[2]+comma+varicellaInfo[3]+comma+varicellaInfo[4]+comma
                    +"Meningococcal"+comma+meningococcalInfo[0]+comma+meningococcalInfo[1]+comma+meningococcalInfo[2]+comma+meningococcalInfo[3]+comma+meningococcalInfo[4]+comma
                    +stu.getGroupID()+comma+stu.getClassID()+comma+stu.getRegisterDate()
                    +"\n";    
            total = total+s;
        }
        out.flush();
        out.write(total);
        out.close();
        }catch(Exception e){
            e.printStackTrace();
        }          
        
    }

    
    public static List<Teacher> readTeacherFile() {
        
        try ( BufferedReader inLine = new BufferedReader(new FileReader("./teacherCSV.csv"));) {
            String inputLine = null;	                                            // read one line from file at a time
            while ((inputLine = inLine.readLine()) != null) {                       // Parse line converting each string token into a Student object field
                String[] fields = inputLine.split(",");
                int id = Integer.parseInt(fields[0]);
                String fname = fields[1];
                String lname = fields[2];
                int age = Integer.parseInt(fields[3]);
                String address = fields[4];
                String phoneNumber = fields[5];
                int classid = Integer.parseInt(fields[6]);
                int groupid = Integer.parseInt(fields[7]);
                String date = fields[8];
                Teacher teacher = TeacherFactory.getInstance().getObject(id, fname, lname, address, phoneNumber, age, classid, groupid, date);
                teachers.add(teacher);

            }
        } catch (IOException e) {
            // catch IOException (and implicitly FileNotFoundException)
            e.printStackTrace();
        }
        return teachers;
    }
    
    
    public  static void writeTeacherCsv(){
        try{
        BufferedWriter out = new BufferedWriter(new FileWriter("./teacherCSV.csv"));
        String total = "";
        for(int i= 0 ;i<teachers.size(); i++){
            Teacher t = teachers.get(i);
            String comma = ",";
            String s = t.getTeacherID()+comma+t.getFirstName()+comma+t.getLastName()+comma
                    +t.getAge()+comma+t.getAddress()+comma+t.getPhoneNumber()+comma
                    +t.getClassID()+comma+t.getGroupID()+comma+t.getRegisterDate()+"\n";    
            total = total+s;
        }
        out.flush();
        out.write(total);
        out.close();
        }catch(Exception e){
            e.printStackTrace();
        }          
        
    }
    
    public static HashMap<String, Immunization> readImmunizationFile() {
        HashMap<String, Immunization> immuMap = new HashMap<>();
        try ( BufferedReader inLine = new BufferedReader(new FileReader("./immunizationCSV.csv"));) {
            String inputLine = null;                                             // read one line from file at a time
            while ((inputLine = inLine.readLine()) != null) {                       // Parse line converting each string token into a Student object field
                String[] fields = inputLine.split(",");
                String name = fields[0];
                String doses = fields[1];
                String description = fields[2];
                String[] date = new String[5];
                for (int i = 0; i < 5; i++) {
                    date[i] = fields[3 + i];
                }
                // instantiate Student object from line in file and add to list
                immuMap.put(name, new Immunization(name, doses, description, date));
            }
        } catch (IOException e) {
            // catch IOException (and implicitly FileNotFoundException)
            e.printStackTrace();
        }
        return immuMap;

    }

}
