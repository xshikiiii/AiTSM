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
public class Class implements Serializable, Comparable<Class>{
    private String classID;
    private String className;
    private String courseID;

    public Class(String classID, String className, String courseID) {
        this.classID = classID;
        this.className = className;
        this.courseID = courseID;
    }

    public Class() {
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return "Class{" + "classID=" + classID + ", className=" + className + ", courseID=" + courseID + '}';
    }

    
    
    @Override
    public int compareTo(Class o) {
        return this.className.compareTo(o.getClassName());
    }
}
