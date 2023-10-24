import java.util.*;

public class ChangeHistory {
    private ArrayList<Double> istorie;
    
    public ChangeHistory() {
        this.istorie = new ArrayList<>();
    }
    
    public void add(double status) {
        this.istorie.add(status);
    }
    
    public void clear() {
        this.istorie.clear();
    }
    
    public String toString() {
        return this.istorie.toString();
    }
    
    public double maxValue() {
        double getMax = 0;
        if (this.istorie.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < istorie.size(); i++) {
                if (istorie.get(i) > getMax) {
                    getMax = istorie.get(i);
                }
            }
        }
        return getMax;
    }
    
    public double minValue() {
        double getMin = this.maxValue();
        if (this.istorie.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < istorie.size(); i++) {
                if (istorie.get(i) < getMin) {
                    getMin = istorie.get(i);
                }
            }
        }
        return getMin;
    }
    
    public double average() {
        double average = 0;
        for (int i = 0; i < this.istorie.size(); i++) {
            average = average + this.istorie.get(i);
        }
        average = average / this.istorie.size();
        return average;
    }
    
}
