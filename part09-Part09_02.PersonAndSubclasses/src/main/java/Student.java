import java.util.*;

public class Student extends Person {
    private int credits;
    
    public Student(String nume, String adresa) {
        super(nume,adresa);
        this.credits = 0;
    }
    
    public void study() {
        this.credits++;
    }
    
    public int credits() {
        return this.credits;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  " + "Study credits " + this.credits;

    }
    
}
