
public class Hideout<T> {
    private T element;
    
    public Hideout() {
    }
    
    public void putIntoHideout(T toHide) {
        element = toHide;
    }
    
    public T takeFromHideout() {
        if (this.element == null) {
            return null;
        } else {
            T copie = this.element;
            this.element = null;
            return copie;
        }
        
    }
    
    public boolean isInHideout() {
        if (this.element != null) {
            return true;
        } else {
            return false;
        }
    }
}
