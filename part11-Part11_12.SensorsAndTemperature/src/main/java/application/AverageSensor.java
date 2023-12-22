/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author CiCi
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> lista;
    private ArrayList<Integer> readings;
    
    
    public AverageSensor() {
        this.lista = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public boolean isOn() {
        for (Sensor p : lista) {
            if (!p.isOn()) {
                return false;
            }
        }
        return true;
    }
    
    public void setOn() {
        for (Sensor p : lista) {
            p.setOn();
        }
    }
    
    public void setOff() {
        for (Sensor p : lista) {
            p.setOff();
        }
    }
    
    public int read() {
        int average = 0;
        for (Sensor p : lista) {
            average = average + p.read();
        }
        this.readings.add(average / lista.size());
        return average / lista.size();
    }
    
    public void addSensor(Sensor toAdd) {
        this.lista.add(toAdd);
    }
    
    public List<Integer> readings() {
        return readings;
    }
    
}
