/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ahihi
 */
public class Slot implements Serializable{

    private int slotID;
    private TimeUnit startTime;
    private TimeUnit endTime;
    private int sujectID;

    public Slot(int slotID, TimeUnit startTime, TimeUnit endTime, int sujectID) {
        this.slotID = slotID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.sujectID = sujectID;
    }

    public Slot() {
    }

    public int getSlotID() {
        return slotID;
    }

    public void setSlotID(int slotID) {
        this.slotID = slotID;
    }

    public TimeUnit getStartTime() {
        return startTime;
    }

    public void setStartTime(TimeUnit startTime) {
        this.startTime = startTime;
    }

    public TimeUnit getEndTime() {
        return endTime;
    }

    public void setEndTime(TimeUnit endTime) {
        this.endTime = endTime;
    }

    public int getSujectID() {
        return sujectID;
    }

    public void setSujectID(int sujectID) {
        this.sujectID = sujectID;
    }

    @Override
    public String toString() {
        return "Slot{" + "slotID=" + slotID + ", startTime=" + startTime + ", endTime=" + endTime + ", sujectID=" + sujectID + '}';
    }
            
    
      
}
