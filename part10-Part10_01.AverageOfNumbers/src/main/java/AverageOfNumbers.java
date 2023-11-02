import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> lista = new ArrayList<>();
        
        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            lista.add(input);
        }
        
        double average = lista.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .average()
                .getAsDouble();
                
        System.out.println("average of numbers: " + average);
        
    }
}
