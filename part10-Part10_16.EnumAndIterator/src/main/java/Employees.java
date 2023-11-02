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

public class Employees {
    private List<Person> lista;
    
    public Employees() {
        this.lista = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.lista.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        this.lista.addAll(peopleToAdd);
    }
    
    public void print() {
        Iterator<Person> iterator = lista.iterator();
        
        while (iterator.hasNext()) {
            Person persoana = iterator.next();
            System.out.println(persoana);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Person persoana = iterator.next();
            if (persoana.getEducation().equals(education)) {
                System.out.println(persoana);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Person persoana = iterator.next();
            if (persoana.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
    
    
    
}
