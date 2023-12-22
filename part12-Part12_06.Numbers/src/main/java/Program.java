
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valoare = scanner.nextInt();
        Random noroc = new Random();
        
        for (int i = 0; i < valoare; i++) {
            int randomNumber = noroc.nextInt(11);
            System.out.println(randomNumber);
        }
        
    }
    
  

}
