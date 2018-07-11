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
public class Courses implements Serializable, Comparable<Courses>{
    private String courseID;    
    private String courseName;
    private String slotID;

    public Courses(String courseID, String courseName, String slotID) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.slotID = slotID;
    }

    public Courses() {
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSlotID() {
        return slotID;
    }

    public void setSlotID(String slotID) {
        this.slotID = slotID;
    }

    @Override
    public String toString() {
        return "Courses{" + "courseID=" + courseID + ", courseName=" + courseName + ", slotID=" + slotID + '}';
    }

    @Override
    public int compareTo(Courses o) {
        return this.courseName.compareTo(o.getCourseName());
    }
    
    
}