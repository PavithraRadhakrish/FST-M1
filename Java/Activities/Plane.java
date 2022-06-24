package activities;

import java.util.*;
import java.text.*;

public class Plane {
    private int maxPassengers;
    private ArrayList<String> passengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;
    Plane(int maxPassengers){
        this.maxPassengers = maxPassengers;
        passengers = new ArrayList<String>();
    }

    public void onboard(String passenger){
        this.passengers.add(passenger);
    }
    public Date takeOff(){
        Date dateObj = new Date();
        this.lastTimeTookOff = dateObj;
        return lastTimeTookOff;
    }
    public void land(){
        Date dateObj1 = new Date();
        this.lastTimeLanded = dateObj1;
        this.passengers.clear();
    }
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }
    public List<String> getPassengers(){
        return passengers;
    }



}
