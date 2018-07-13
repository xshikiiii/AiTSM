/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author ahihi
 */
public class Student implements Serializable, Comparable<Student>{
   private String studentID;
   private String fistName;
   private String lastName;
   private String email;
   private String phoneNumber;
   private String address;

    public Student(String studentID, String fistName, String lastName, String email, String phoneNumber, String address) {
        this.studentID = studentID;
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Student() {
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", fistName=" + fistName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + '}';
    }

   
   
    @Override
    public int compareTo(Student o) {
        return this.lastName.compareTo(o.getLastName());
    }
}
