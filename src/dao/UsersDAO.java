/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Users;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import utils.ConnectDB;







/**
 *
 * @author ahihi
 */
public class UsersDAO {
    
    List<Users> lU = null;
    Connection con = null;

    public UsersDAO() {
        lU = new ArrayList<>();
        con = new ConnectDB().getCon();
    }
    
    public Users create(Users u){
        return null;
    }
    public List<Users> readAll(){
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
