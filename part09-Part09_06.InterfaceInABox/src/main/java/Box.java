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

public class Box implements Packable {
    private double weightMax;
    private ArrayList<Packable> lista;
    
    public Box(double weightMax) {
        this.weightMax = weightMax;
        this.lista = new ArrayList<>();
    }
    
    public void add(Packable p) {
        if (p.weight() + this.weight() <= this.weightMax) {
            this.lista.add(p);
        }
    }
    
    public double weight() {
        double suma = 0;
        for (Packable p : lista) {
            suma = suma + p.weight();
        }
        return suma;
    }
    
    public String toString() {
        return "Box: " + lista.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
