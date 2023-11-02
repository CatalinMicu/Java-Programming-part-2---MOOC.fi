
import java.util.Scanner;
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> lista = new ArrayList<>();
        
        while(true) {
            System.out.println("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println(lista.size() + " books in total.\n" + "Books: ");
                Comparator<Book> comparator = Comparator
                        .comparing(Book::getAge)
                        .thenComparing(Book::getName);
                Collections.sort(lista, comparator);
                for (Book p : lista) {
                    System.out.println(p);
                }
                break;
            }
            System.out.println("Input the age recommendation: ");
            int inputAge = Integer.valueOf(scanner.nextLine());
            Book carte = new Book(input, inputAge);
            lista.add(carte);
            
        }

    }

}
