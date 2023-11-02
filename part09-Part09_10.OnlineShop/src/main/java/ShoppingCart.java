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

public class ShoppingCart {
    private Map<String, Item> cos;
    
    public ShoppingCart() {
        this.cos = new HashMap<>();
    }
    
    public void add(String product, int price) {
        Item item = new Item(product, 0, price);
        this.cos.putIfAbsent(product, item);
        this.cos.get(product).increaseQuantity();
    }
    
    public int price() {
        int pret = 0;
        for (Item p : cos.values()) {
            pret = pret + p.price();
        }
        return pret;
    }
    
    public void print() {
        for (Item p : cos.values()) {
            System.out.println(p);
        }
    }

    
}
