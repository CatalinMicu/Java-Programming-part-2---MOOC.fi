import java.util.*;

public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.product);
        hash = 47 * hash + this.qty;
        hash = 47 * hash + this.unitPrice;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.qty != other.qty) {
            return false;
        }
        if (this.unitPrice != other.unitPrice) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }
    
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price () {
        int price = this.unitPrice * this.qty;
        return price;
    }
    
    public void increaseQuantity() {
        this.qty++;
    }
    
    public String toString() {
        return this.product + ": " + this.qty;
    }
    
    
    
}
