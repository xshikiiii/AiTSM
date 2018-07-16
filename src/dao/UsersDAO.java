/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Users;
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
public class UsersDAO {
    final private String SQL_USER_CHECK = "SELECT PASS FROM USERS WHERE USERNAME = ?";
    final private String SQL_USER_CREATE = "INSERT INTO USERS VALUES (?,?,?)";
    final private String SQL_USER_READALL = "SELECT * FROM USERS";
    List<Users> lU = null;
    Connection con = null;

    public UsersDAO() {
        lU = new ArrayList<>();
        con = new ConnectDB().getCon();
    }
    
    public Users create(Users u){
        try {
            PreparedStatement pr = con.prepareStatement(SQL_USER_CREATE);
            pr.setString(1,u.getUsername());
            pr.setString(2,u.getPassword());
            pr.setInt(3,u.getRoleid());
            pr.execute();
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<Users> readAll(){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL_USER_READALL);
            if (rs!=null){
                while(rs.next()){
                    Users u = new Users();
                    u.setUsername(rs.getString(1));
                    u.setPassword(rs.getString(2));
                    u.setRoleid(rs.getInt(3));
                    lU.add(u);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lU;
    }
    public Users searchByUsername(String username){
        return null;
    }
    public List<Users> update (){
        return lU;
    }
    public boolean delete (){
        return true;
    }
    public Users login(){
        return null;
    }
    
}
