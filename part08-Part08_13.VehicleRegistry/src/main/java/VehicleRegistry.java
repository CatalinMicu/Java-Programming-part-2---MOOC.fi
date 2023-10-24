import java.util.*;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashmap;
    
    public VehicleRegistry() {
        this.hashmap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.hashmap.get(licensePlate) == null) {
            this.hashmap.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }       

    }
    
    public String get(LicensePlate licensePlate) {
        if (!(hashmap.containsKey(licensePlate))) {
            return null;
        }
        return hashmap.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!(hashmap.containsKey(licensePlate))) {
            return false;
        } else {
            this.hashmap.remove(licensePlate);
            return true;
        }
    }
    
    public void printLicensePlates() {
        for (LicensePlate e : hashmap.keySet()) {
            System.out.println(e);
        }
    }
    
    public void printOwners() {
        ArrayList<String> proprietari = new ArrayList<>();
        for (String string : hashmap.values()) {
            if (!proprietari.contains(string)) {
                proprietari.add(string);
            }
        }
        for (String string : proprietari) {
            System.out.println(string);
        }
    }
    
}
