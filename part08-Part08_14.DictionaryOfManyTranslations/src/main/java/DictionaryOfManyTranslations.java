import java.util.*;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionar;
    
    public DictionaryOfManyTranslations() {
        this.dictionar = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        this.dictionar.putIfAbsent(word, new ArrayList<>());
        this.dictionar.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        ArrayList<String> dictionar2 = new ArrayList<>();
        if (dictionar.containsKey(word)) {
            dictionar2 = this.dictionar.get(word);
        }
        return dictionar2;
    }
    
    public void remove(String word) {
        if (dictionar.containsKey(word)) {
            this.dictionar.remove(word);
        }
    }
    
}
