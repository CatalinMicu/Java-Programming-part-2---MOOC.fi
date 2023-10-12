import java.util.*;

public class IOU {
    private HashMap<String, Double> hashmapa;
    
    public IOU() {
        this.hashmapa = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.hashmapa.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.hashmapa.getOrDefault(toWhom, 0.0);
    }
    
}
