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

public class Cat extends Animal implements NoiseCapable {
    
    public Cat() {
        super("Cat");
    }
    
    public Cat(String nume) {
        super(nume);
    }
    
    public void purr() {
        System.out.println(this.getName() + " purrs");
    }
    
    public void makeNoise() {
        System.out.println(this.getName() + " purrs");
    }
}
