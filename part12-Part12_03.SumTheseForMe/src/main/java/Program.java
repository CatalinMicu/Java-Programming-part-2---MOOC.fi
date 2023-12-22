
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {3, -1, 8, 4};

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int suma = 0;
        
        if (fromWhere < 0) {
            fromWhere = 0;
        }
        
        if (toWhere > array.length) {
            toWhere = array.length - 1;
        }
        
        for (int i = fromWhere; i < toWhere; i++) {
            if (array[i] <= largest && array[i] >= smallest) {
                suma = suma + array[i];
            }
        }
        return suma;
    }
    

}

