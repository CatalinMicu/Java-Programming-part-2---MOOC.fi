
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String,String> hashmap) {
        for (String valoare : hashmap.keySet()) {
            System.out.println(valoare);
        }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String valoare : hashmap.keySet()) {
            if (valoare.contains(text)) {
                System.out.println(valoare);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String valoare : hashmap.keySet()) {
            if (valoare.contains(text)) {
                System.out.println(hashmap.get(valoare));
            }
        }
    }
    
    
    


}
