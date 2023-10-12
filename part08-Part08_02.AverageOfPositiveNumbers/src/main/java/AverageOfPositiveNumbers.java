
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int count = 0;
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input > 0) {
                suma = suma + input;
                count++;                
            }
            if (input == 0 && count == 0) {
                System.out.println("Cannot calculate the average");
            }
            if (input == 0) {
                System.out.println(suma/count);
                break;
            }
        }
        
    }
}
