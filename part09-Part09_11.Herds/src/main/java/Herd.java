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

public class Herd implements Movable {
    private List<Movable> lista;
    
    public Herd() {
        this.lista = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.lista.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable p : lista) {
            p.move(dx, dy);
        }
    }
    
    public String toString() {
        String idk = new String();
        for (Movable p : lista) {
            idk = idk + p.toString() + "\n";
        }
        return idk;
    }
    
}
