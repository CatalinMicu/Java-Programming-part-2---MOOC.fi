
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String input2 = scanner.nextLine();
                if (input2.equals("p")) {
                    double avgPozitiv = lista.stream()
                            .mapToDouble(s -> Double.valueOf(s))
                            .filter(number -> number >= 0)
                            .average()
                            .getAsDouble();
                    System.out.println("Average of the positive numbers: " + avgPozitiv);
                    break;
                } else if (input2.equals("n")) {
                    double avgNegativ = lista.stream()
                            .mapToDouble(s -> Double.valueOf(s))
                            .filter(number -> number <= 0)
                            .average()
                            .getAsDouble();
                    System.out.println("Average of negative numbers: " + avgNegativ);
                    break;
                }
            }
            if (input.equals("")) {
                
            } else {
                lista.add(input);
            }
        }
        
        
    }
        
}
