import java.util.*;

public class OneItemBox extends Box {
    private ArrayList<Item> lista;
    
    public OneItemBox() {
        this.lista = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (lista.size() == 1 || this.isInBox(item) == true) {
            return;
        } else {
            this.lista.add(item);
        }
        
    }
    
    @Override
    public boolean isInBox(Item item) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(item) && lista.get(i).hashCode() == item.hashCode()) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
}
