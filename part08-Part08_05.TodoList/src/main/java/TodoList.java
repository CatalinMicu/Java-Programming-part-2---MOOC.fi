import java.util.*;

public class TodoList {
    private ArrayList<String> lista;
    
    public TodoList() {
        this.lista = new ArrayList<>();
    }
    
    public void add(String task) {
        this.lista.add(task);
    }
    
    public void print() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+1 + ": " + lista.get(i));
        }
    }
    
    public void remove(int number) {
        this.lista.remove(lista.get(number - 1));
    }
}
