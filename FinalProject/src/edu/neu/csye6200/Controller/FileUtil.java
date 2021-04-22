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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author lln
 */
public class FileUtil {

    public static List<Student> readStudentFile() {
        List<Student> students = new ArrayList<>();
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

    public static List<Teacher> readTeacherFile() {
        List<Teacher> teachers = new ArrayList<>();
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
