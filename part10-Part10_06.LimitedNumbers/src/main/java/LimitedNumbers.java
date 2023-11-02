
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input <= 0) {
                break;
            }
            lista.add(input);           
        }
        
        lista.stream()
                .filter(s -> s <=5)
                .forEach(s -> System.out.println(s));
        
    }
}
