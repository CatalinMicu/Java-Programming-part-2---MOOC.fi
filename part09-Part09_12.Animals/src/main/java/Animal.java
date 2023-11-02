/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CiCi
 */
public abstract class Animal {
    private String nume;
    
    public Animal(String nume) {
        this.nume = nume;
    }
    
    public void eat() {
        System.out.println(this.getName() + " eats");
    }
    
    void sleep() {
        System.out.println(this.getName() + " sleeps");
    }
    
    String getName() {
        return this.nume;
    }
    
}
