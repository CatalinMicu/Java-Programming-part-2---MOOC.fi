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

public class Hand implements Comparable<Hand> {
    private List<Card> lista;
    
    public Hand() {
        this.lista = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.lista.add(card);
    }
    
    public void print() {
        for (Card p : lista) {
            System.out.println(p);
        }
    }
    
    @Override
    public int compareTo(Hand hand) {
        int suma = 0;
        for (Card p : this.lista) {
            suma = suma + p.getValue();
        }
        int suma2 = 0;
        for (Card a : hand.lista) {
            suma2 = suma2 + a.getValue();
        }
        if (suma == suma2) {
            return 0;
        } else
        if (suma > suma2) {
            return 1;
        } else {
            return -11;
        }
    }
    
    public void sortBySuit() {
        BySuitInValueOrder comparator = new BySuitInValueOrder();
        Collections.sort(lista, comparator);
        
    }
    
    public void sort() {
        Collections.sort(lista);
    }
    
}
