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
public class Role implements Serializable, Comparable<Role>{
    private int roleid;
    private String nameRole;
    private String description;

    public Role(int roleid, String nameRole, String description) {
        this.roleid = roleid;
        this.nameRole = nameRole;
        this.description = description;
    }

    public Role() {
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Role{" + "roleid=" + roleid + ", nameRole=" + nameRole + ", description=" + description + '}';
    }

    @Override
    public int compareTo(Role o) {
        return this.nameRole.compareTo(o.getNameRole());
    }
}
