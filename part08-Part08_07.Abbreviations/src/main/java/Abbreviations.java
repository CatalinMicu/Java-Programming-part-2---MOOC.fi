import java.util.*;

public class Abbreviations {
    private HashMap<String, String> abreviatii;
    
    public Abbreviations() {
        this.abreviatii = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abreviatii.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (this.abreviatii.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        if (this.abreviatii.containsKey(abbreviation)) {
            return this.abreviatii.get(abbreviation);
        }
        return null;
    } 
    
}
