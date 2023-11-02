
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Status> lista = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(p -> new Status(p[3], Integer.valueOf(p[4]), p[2].replace("(%)", "").trim(), Double.valueOf(p[5])))
                    .forEach(p -> lista.add(p));
            
                    

    } catch (Exception e) {
            System.out.println("ceva");
    }
    
    Collections.sort(lista);
    for (Status p : lista) {
        System.out.println(p);
    }
        
        
}
}
