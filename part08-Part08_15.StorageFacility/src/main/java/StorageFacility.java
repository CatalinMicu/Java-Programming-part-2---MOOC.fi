import java.util.*;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> hashmap;
    
    public StorageFacility() {
        this.hashmap = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.hashmap.putIfAbsent(unit, new ArrayList<>());
        this.hashmap.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> lista = new ArrayList<>();
        if (hashmap.containsKey(storageUnit)) {
            lista = this.hashmap.get(storageUnit);
        }
        return lista;
    }
    
    public void remove(String storageUnit, String item) {
        ArrayList<String> lista = new ArrayList<>();
        if (hashmap.containsKey(storageUnit)) {
            lista = this.hashmap.get(storageUnit);
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).equals(item)) {
                    lista.remove(i);
                }
            }
        }
        this.hashmap.remove(storageUnit);
        this.hashmap.put(storageUnit, lista);
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> lista = new ArrayList<>();  
        for(String unit : hashmap.keySet()) {
            lista.add(unit);
            
        }
        for (int i = 0; i < lista.size(); i++) {
            if (this.hashmap.get(lista.get(i)).isEmpty()) {
                lista.remove(i);
            }
        }
        return lista;
        
    }
    
}
        