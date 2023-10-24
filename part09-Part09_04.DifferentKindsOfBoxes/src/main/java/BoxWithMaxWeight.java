import java.util.*;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> lista = new ArrayList<>();
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.lista = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (this.maxWeight() + item.getWeight() <= capacity) {
            this.lista.add(item);
        }

    }
    
    public int maxWeight(){
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getWeight();
        }
        return suma;
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.lista.contains(item);
    }
}