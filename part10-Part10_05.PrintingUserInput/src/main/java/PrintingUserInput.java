
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> lista = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            lista.add(input);
            lista.stream()
                    .forEach(s -> System.out.println(s));
        }

    }
}
