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

public class Warehouse {
    private Map<String, Integer> preturi;
    private Map<String, Integer> inventar;
    
    public Warehouse() {
        this.preturi = new HashMap<>();
        this.inventar = new HashMap<>();
        
    }
    
    public void addProduct(String product, int price, int stock) {
        this.preturi.put(product, price);
        this.inventar.put(product, stock);
    }
    
    public int price(String product) {
        if (!(this.preturi.get(product) == null)) {
            return this.preturi.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if (!(this.inventar.get(product) == null)) {
            return this.inventar.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if (this.inventar.containsKey(product)) {
            if (this.inventar.get(product) == 0) {
                return false;
            }
            int pivot = this.inventar.get(product) - 1;
            this.inventar.put(product, pivot);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> pula = new TreeSet();
        for (String preturi : inventar.keySet()) {
            pula.add(preturi);
        }
        return pula;
    }
    
}
