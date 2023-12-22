/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author CiCi
 */
public class TemperatureSensor implements Sensor {
    private int valoare;
    private boolean isOn;
    
    
    public TemperatureSensor() {
        isOn = false;
    }
    
    public boolean isOn() {
        return this.isOn;
    }
    
    public void setOn() {
        this.isOn = true;
    }
    
    public void setOff() {
        this.isOn = false;
    }
    
    public int read() {
        int randomNum = new Random().nextInt(61) - 30;
        if (this.isOn == false) {
            throw new IllegalStateException("Sensorul nu e pornit");
        } else {
            return randomNum;
        }
    }
    
}
