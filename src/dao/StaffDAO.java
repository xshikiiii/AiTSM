/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose ToolSttt | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Staff;
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
public class StaffDAO {
    final private String SQL_STAFF_CREATE = "INSERT INTO STAFF VALUES (?,?,?)";
    final private String SQL_STAFF_READALL = "SELECT * FROM STAFF";
    final private String SQL_STAFF_READBYID = "SELECT FROM STAFF WHERE STAFFID";
    final private String SQL_STAFF_UPDATE = "UPDATE FROM STAFF SET STAFNAME = ?, USERNAME = ?, STAFFEMAIL = ?, STAFFPN= ?,STAFFADDRESS= ?, STAFFSEX= ?, STAFFBIRTHDAY = ?";
    final private String SQL_STAFF_DELETE = "DELETE FROM STAFF WHERE STAFFID = ?";
    List<Staff> lSt = null;
    Connection con = null;

    public StaffDAO() {
        lSt = new ArrayList();
        con = new ConnectDB().getCon();
    }
    public Staff create (Staff sta){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_STAFF_CREATE);
            pr.setString(1,sta.getStaffID());
            pr.setString(2,sta.getStaffName());
            pr.setString(3,sta.getUsername());
            pr.setInt(4,sta.getStaffSex());
            pr.setDate(5,new java.sql.Date(sta.getStaffBirthday().getTime()));
            pr.setString(6,sta.getStaffEmail());
            pr.setString(7,sta.getStaffPn());
            pr.setString(8,sta.getStaffAddress());
            pr.execute();
            return sta;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<Staff> readAll(){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL_STAFF_READALL);
            if (rs!=null){
                while(rs.next()){
                    Staff sta = new Staff();
                    sta.setStaffID(rs.getString(1));
                    sta.setStaffName(rs.getString(2));
                    sta.setUsername(rs.getString(3));
                    sta.setStaffSex(rs.getInt(4));
                    sta.setStaffEmail(rs.getString(5));
                    sta.setStaffPn(rs.getString(6));
                    sta.setStaffAddress(rs.getString(7));
                    lSt.add(sta);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lSt;
    }
    public Staff readById(String staffID){
        lSt = new ArrayList<>();
        try {
            PreparedStatement pr = con.prepareStatement(SQL_STAFF_READBYID);
            pr.setString(1, staffID);
            ResultSet rs = pr.executeQuery();
            if(rs!=null){
                Staff sta = new Staff();
                sta.setStaffID(rs.getString(1));
                sta.setStaffName(rs.getString(2));
                sta.setUsername(rs.getString(3));
                sta.setStaffSex(rs.getInt(4));
                sta.setStaffEmail(rs.getString(5));
                sta.setStaffPn(rs.getString(6));
                sta.setStaffAddress(rs.getString(7));
                return sta;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Staff update (Staff sta){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_STAFF_UPDATE);
            pr.setString(1,sta.getStaffID());
            pr.setString(2,sta.getStaffName());
            pr.setString(3,sta.getUsername());
            pr.setInt(4,sta.getStaffSex());
            pr.setDate(5,new java.sql.Date(sta.getStaffBirthday().getTime()));
            pr.setString(6,sta.getStaffEmail());
            pr.setString(7,sta.getStaffPn());
            pr.setString(8,sta.getStaffAddress());
            pr.execute();
            return sta;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public boolean delete (String staffID){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_STAFF_DELETE);
            pr.setString(1,staffID);
            pr.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
