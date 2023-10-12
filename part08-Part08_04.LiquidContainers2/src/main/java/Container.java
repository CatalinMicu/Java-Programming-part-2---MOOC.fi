import java.util.*;

public class Container {
    private int volum;
    
    public Container() {
        this.volum = 0;
    }
    
    public int contains() {
        return this.volum;
    }
    
    public void add(int amount) {
        if (amount <= 0) {
            this.volum = this.volum;
        } else if (this.volum + amount >= 100) {
            this.volum = 100;
        } else this.volum = this.volum + amount;
    }
    
    public void move(int amount) {
        if (amount >= this.volum) {
            this.volum = 0;
        }
        else if (this.volum <= 0) {
            this.volum = this.volum;
        }
        else this.volum = this.volum - amount;
        
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
    
    public void isFull() {
        if (this.volum >= 100) {
            this.volum = 100;
        }
    }
    
    @Override
    public String toString() {
        return this.volum + "/100";
    }


}
