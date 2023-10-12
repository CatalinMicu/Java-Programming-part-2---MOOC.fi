
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String,Book> hashmap) {
        for (Book carte : hashmap.values()) {
            System.out.println(carte.toString());
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (Book carte : hashmap.values()) {
            if (carte.toString().contains(text)) {
                System.out.println(carte.toString());
            }
        }
    }
}
