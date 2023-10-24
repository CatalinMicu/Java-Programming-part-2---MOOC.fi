import java.util.*;

public class MisplacingBox extends Box {
    private ArrayList<Item> lista;
    
    public MisplacingBox() {
        this.lista = new ArrayList<>();
    }
    
    public void add(Item item) {
        this.lista.add(item);
    }
    
    public boolean isInBox(Item item) {
        return false;
    }
    
}
