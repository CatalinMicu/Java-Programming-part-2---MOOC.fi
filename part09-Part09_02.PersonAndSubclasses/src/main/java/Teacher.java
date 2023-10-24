/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CiCi
 */
public class Teacher extends Person {
    private int salary;
    
    public Teacher(String nume, String adresa, int salariu) {
        super(nume, adresa);
        this.salary = salariu;
    }
    
    @Override
    public String toString() {
        String plm = super.toString() + "\n  salary " + this.salary + " euro/month";
        return plm;
    }
}
