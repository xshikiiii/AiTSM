/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.ConnectDB;

/**
 *
 * @author ahihi
 */
public class StudentDAO {
    final private String SQL_STUDENT_CREATE = "INSERT INTO STUDENT VALUES (?,?,?)";
    final private String SQL_STUDENT_READALL = "SELECT * FROM STUDENT";
    final private String SQL_STUDENT_READBYID = "SELECT FROM STUDENT WHERE STUDENTID";
    final private String SQL_STUDENT_UPDATE = "UPDATE FROM STUDENT SET FIRSTNAME = ?, LASTNAME = ?, EMAIL = ?, PHONENUMBER= ?,ADDRESS= ?";
    final private String SQL_STUDENT_DELETE = "DELETE FROM STUDENT WHERE STUDENTID = ?";
    List<Student> lS = null;
    Connection con = null;

    public StudentDAO() {
        lS = new ArrayList();
        con = new ConnectDB().getCon();
    }
    public Student create (Student s){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_STUDENT_CREATE);
            pr.setString(1,s.getStudentID());
            pr.setString(2,s.getFistName());
            pr.setString(3,s.getLastName());
            pr.setString(4,s.getEmail());
            pr.setString(5,s.getPhoneNumber());
            pr.setString(6,s.getAddress());
            pr.execute();
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<Student> readAll(){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL_STUDENT_READALL);
            if (rs!=null){
                while(rs.next()){
                    Student s = new Student();
                    s.setStudentID(rs.getString(1));
                    s.setFistName(rs.getString(2));
                    s.setLastName(rs.getString(3));
                    s.setEmail(rs.getString(4));
                    s.setPhoneNumber(rs.getString(5));
                    s.setAddress(rs.getString(6));
                    lS.add(s);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lS;
    }
    public Student readById(String studentID){
        lS = new ArrayList<>();
        try {
            PreparedStatement pr = con.prepareStatement(SQL_STUDENT_READBYID);
            pr.setString(1, studentID);
            ResultSet rs = pr.executeQuery();
            if(rs!=null){
                Student s = new Student();
                s.setStudentID(rs.getString(1));
                    s.setFistName(rs.getString(2));
                    s.setLastName(rs.getString(3));
                    s.setEmail(rs.getString(4));
                    s.setPhoneNumber(rs.getString(5));
                    s.setAddress(rs.getString(6));
                return s;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Student update (Student s){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_STUDENT_UPDATE);
            pr.setString(1,s.getStudentID());
            pr.setString(2,s.getFistName());
            pr.setString(3,s.getLastName());
            pr.setString(4,s.getEmail());
            pr.setString(5,s.getPhoneNumber());
            pr.setString(6,s.getAddress());
            pr.execute();
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public boolean delete (String studentID){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_STUDENT_DELETE);
            pr.setString(1,studentID);
            pr.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
