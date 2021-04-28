/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lln
 */
public class Student extends Person {

    private int stuID;
    private int classID = 0;
    private int groupID = 0;
    //private static int i = 0;
    private String parentFirstName;
    private String parentLastName;
    private String registerDate;
    private String birthday;
    private Map<String, Immunization> immunizationmap;

    public Student(int stuId, int stuAge, String stuFname, String stuLname, String parentFname, String parentLname, String address, String teleNumber, String birthday) {
        super(stuFname, stuLname, address, teleNumber, stuAge);
        this.stuID = stuId; //To change body of generated methods, choose Tools | Templates.
        this.parentFirstName = parentFname;
        this.parentLastName = parentLname;
        this.birthday = birthday;
        this.immunizationmap = new HashMap<>();
        immunizationmap.put("Hib", new Immunization("4", "Haemophilus influenzae type b (Hib)"));
        immunizationmap.put("Dtap", new Immunization("5", "Diphtheria tetanus & acellular pertussis (DTaP)"));
        immunizationmap.put("Polio", new Immunization("4", "Inactivated poliovirus (IPV)"));
        immunizationmap.put("Hepatitis B", new Immunization("3", "Hepatitis B(Hepb)"));
        immunizationmap.put("MMR", new Immunization("2", "Measles mumps rubella (MMR)"));
        immunizationmap.put("Varicella", new Immunization("2", "Varicella (VAR)"));
        immunizationmap.put("Meningococcal", new Immunization("2", "Meningococcal"));

    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getParentFirstName() {
        return parentFirstName;
    }

    public void setParentFirstName(String parentFirstName) {
        this.parentFirstName = parentFirstName;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }

    public Student() {
        super();
        this.immunizationmap = new HashMap<>();
        immunizationmap.put("Hib", new Immunization("4", "Haemophilus influenzae type b (Hib)"));
        immunizationmap.put("Dtap", new Immunization("5", "Diphtheria tetanus & acellular pertussis (DTaP)"));
        immunizationmap.put("Polio", new Immunization("4", "Inactivated poliovirus (IPV)"));
        immunizationmap.put("Hepatitis B", new Immunization("3", "Hepatitis B(Hepb)"));
        immunizationmap.put("MMR", new Immunization("2", "Measles mumps rubella (MMR)"));
        immunizationmap.put("Varicella", new Immunization("2", "Varicella (VAR)"));
        immunizationmap.put("Meningococcal", new Immunization("2", "Meningococcal"));
    }

    @Override
    public String toString() {
        return String.valueOf(stuID);
    }

    public Student(int stuID, String firstName, String lastName, String address, String phoneNumber, int age) {
        super(firstName, lastName, address, phoneNumber, age);
        this.stuID = stuID;

        this.immunizationmap = new HashMap<>();
        immunizationmap.put("Hib", new Immunization("4", "Haemophilus influenzae type b (Hib)"));
        immunizationmap.put("Dtap", new Immunization("5", "Diphtheria tetanus & acellular pertussis (DTaP)"));
        immunizationmap.put("Polio", new Immunization("4", "Inactivated poliovirus (IPV)"));
        immunizationmap.put("Hepatitis B", new Immunization("3", "Hepatitis B(Hepb)"));
        immunizationmap.put("MMR", new Immunization("2", "Measles mumps rubella (MMR)"));
        immunizationmap.put("Varicella", new Immunization("2", "Varicella (VAR)"));
        immunizationmap.put("Meningococcal", new Immunization("2", "Meningococcal"));

    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
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

    public Map<String, Immunization> getImmunizationmap() {
        return immunizationmap;
    }

    public void setImmunizationmap(Map<String, Immunization> immunizationmap) {
        this.immunizationmap = immunizationmap;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

}
