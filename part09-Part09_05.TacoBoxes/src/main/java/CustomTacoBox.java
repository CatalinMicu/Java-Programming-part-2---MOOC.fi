import java.util.*;

public class CustomTacoBox implements TacoBox {
    private int tacos;
    
    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }
    
    @Override
    public void eat() {
        this.tacos = this.tacos - 1;
    }
    
    @Override
    public int tacosRemaining() {
        if (this.tacos <= 0) {
            return 0;
        }
        return this.tacos;
        
    }
}
