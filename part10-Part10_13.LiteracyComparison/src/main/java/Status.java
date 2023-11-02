/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CiCi
 */
import java.util.*;

public class Status implements Comparable<Status> {
    private String country;
    private int year;
    private String gender;
    private double rate;
    
    public Status(String country, int year, String gender, double rate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.rate = rate;
    }
    
    public double getRata() {
        return this.rate;
    }
    
    @Override
    public int compareTo(Status status) {
        if (this.getRata() < status.getRata()) {
            return -1;
        } else {
            return 1;
        }
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.rate;
    }
    
}
