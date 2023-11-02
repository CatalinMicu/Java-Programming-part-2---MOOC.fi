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
public class Book implements Comparable<Book> {
    private String name;
    private int age;
    
    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public int compareTo(Book book) {
        if (this.age < book.age) {
            return -1;
        } else {
            return 1;
        }
    }
    
    @Override
    public String toString() {
        return this.name + "(recoomended for " + this.age + " year-olds or older)";
    }
}
