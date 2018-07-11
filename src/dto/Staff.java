/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author ahihi
 */
public class Staff implements Serializable, Comparable<Staff>{
    private String staffID; 
    private String staffName;
    private String username;
    private Date staffBirthday;
    private int staffSex;
    private String staffEmail;
    private String staffAddress;
    private String staffPn;

    public Staff(String staffID, String staffName, String username, Date staffBirthday, int staffSex, String staffEmail, String staffAddress, String staffPn) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.username = username;
        this.staffBirthday = staffBirthday;
        this.staffSex = staffSex;
        this.staffEmail = staffEmail;
        this.staffAddress = staffAddress;
        this.staffPn = staffPn;
    }

    public Staff() {
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getStaffBirthday() {
        return staffBirthday;
    }

    public void setStaffBirthday(Date staffBirthday) {
        this.staffBirthday = staffBirthday;
    }

    public int getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(int staffSex) {
        this.staffSex = staffSex;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public String getStaffPn() {
        return staffPn;
    }

    public void setStaffPn(String staffPn) {
        this.staffPn = staffPn;
    }

    @Override
    public String toString() {
        return "Staff{" + "staffID=" + staffID + ", staffName=" + staffName + ", username=" + username + ", staffBirthday=" + staffBirthday + ", staffSex=" + staffSex + ", staffEmail=" + staffEmail + ", staffAddress=" + staffAddress + ", staffPn=" + staffPn + '}';
    }
    
    
    @Override
    public int compareTo(Staff o) {
        return this.staffName.compareTo(o.getStaffName());
    }
}
    