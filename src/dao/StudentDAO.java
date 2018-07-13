/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Student;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import utils.ConnectDB;

/**
 *
 * @author ahihi
 */
public class StudentDAO {
    List<Student> lS = null;
    Connection con = null;

    public StudentDAO() {
        lS = new ArrayList();
        con = new ConnectDB().getCon();
    }
    public Student create (Student s){
        return null;
    }
    public List<Student> readAll(){
        return lS;
    }
    public List<Student> readById(String StudentID){
        return lS;
    }
    public Student update(Student s){
        return null;
    }
    public Student delete(String StudentID){
        return null;
    }
    
}
