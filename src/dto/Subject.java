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
public class Subject implements Serializable, Comparable<Subject>{
    private int subjectID;
    private String subjectName;
    private int total;
    private String classID;

    public Subject(int subjectID, String subjectName, int total, String classID) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.total = total;
        this.classID = classID;
    }

    public Subject() {
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectID=" + subjectID + ", subjectName=" + subjectName + ", total=" + total + ", classID=" + classID + '}';
    }

    
    
    @Override
    public int compareTo(Subject o) {
        return this.subjectName.compareTo(o.getSubjectName());
    }
}
