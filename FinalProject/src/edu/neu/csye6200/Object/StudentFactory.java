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
public class StudentFactory extends AbstractStudentFactory {

    private static StudentFactory studentFactory;

    private StudentFactory() {
        if (studentFactory != null) {
            throw new IllegalStateException();
        }
    }

    public static synchronized StudentFactory getInstance() {
        if (studentFactory == null) {

            studentFactory = new StudentFactory();
        }
        return studentFactory;
    }

    @Override
    public Student getObject() {
        return new Student();
    }

    @Override
    public Student getObject(int stuID, String firstName, String lastName, String address, String phoneNumber, int age) {
        return new Student(stuID, firstName, lastName, address, phoneNumber, age);
    }

    @Override
    public Student getObject(String csv) {
        Student student = new Student();
        String[] arr = csv.split(",");
//		student.setStuId(Integer.parseInt(arr[0]));
        student.setStuID(Integer.parseInt(arr[0]));
        student.setAge(Integer.parseInt(arr[1]));
        student.setFirstName(arr[2]);
        student.setLastName(arr[3]);
        student.setParentFirstName(arr[4]);
        student.setParentLastName(arr[5]);
        student.setAddress(arr[6]);
        student.setPhoneNumber(arr[7]);
        student.setRegisterDate(arr[arr.length - 1]);
        student.setClassID(Integer.parseInt(arr[arr.length - 2]));
        student.setGroupID(Integer.parseInt(arr[arr.length - 3]));
        student.setBirthday(arr[8]);
        student.setRegisterState(true);
        int i = 9;
        while (i <= 45) {
            String[] date = new String[5];
            for (int k = i + 1; k <= i + 5; k++) {
                date[k - i - 1] = arr[k];
            }
            student.getImmunizationmap().get(arr[i]).setDate(date);
            i = i + 6;
        }
        return student;
    }

}
