/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CiCi
 */
public class Person {
    private String nume;
    private String adresa;
    
    public Person(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }
    
    @Override
    public String toString() {
        String returneaza = nume + "\n" + "  " + adresa;
        return returneaza;
    }
}
