/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author CiCi
 */
public class StandardSensor implements Sensor {
    private int valoare;
    private final boolean isOn;
    
    
    public StandardSensor(int valoare) {
        this.valoare = valoare;
        isOn = true;
    }
    
    public boolean isOn() {
        return this.isOn;
    }
    
    public void setOn() {
        
    }
    
    public void setOff() {
        
    }
    
    public int read() {
        return this.valoare;
    }
    
}
