import java.util.*;


public class second {
    private int volum;
    
    public second() {
        this.volum = 0;
    }
    
    public void add(int amount) {
        if (amount <= 0) {
            this.volum = this.volum;
        }
        else if (this.volum >= 100) {
            this.volum = 100;
        }
        else this.volum = this.volum + amount;
    }
    
    public void remove (int amount) {
        if (amount >= this.volum) {
            this.volum = 0;
        }
        else if (amount <= 0) {
            this.volum = this.volum;
        }
        else this.volum = this.volum - amount;
    }
    
    public int getVolum() {
        return this.volum;
    }
    
    public void isFull() {
        if (this.volum >= 100) {
            this.volum = 100;
        }
    }
    
@Override
public String toString() {
    return "Second: " + this.volum + "/100";
}
}
