/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Staff;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import utils.ConnectDB;



/**
 *
 * @author ahihi
 */
public class StaffDAO {
    List<Staff> lSt = null;
    Connection con = null;

    public StaffDAO() {
        lSt = new ArrayList();
        con = new ConnectDB().getCon();
    }
    public Staff create (Staff st){
        return null;
    }
    public List<Staff> readAll(){
        return lSt;
    }
    public List<Staff> readById(String StaffID){
        return lSt;
    }
    public Staff update(Staff st){
        return null;
    }
    public Staff delete(String StaffID){
        return null;
    }
}
