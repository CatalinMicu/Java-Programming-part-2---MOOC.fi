
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory istorie = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String nume, double capacity, double initialBalance) {
        super(nume, capacity);
        super.addToWarehouse(initialBalance);
        this.istorie.add(initialBalance);
    }
    
    public String history() {
        return this.istorie.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.istorie.add(this.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double plm = super.takeFromWarehouse(amount);
        this.istorie.add((this.getBalance()));
        return plm;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\nHistory: " + this.istorie.toString() + "\nLargest amount of product: " + this.istorie.maxValue() + "\nSmallest amount of product: " + this.istorie.minValue()+ "\nAverage: " + this.istorie.average());
    }
    
    
}
