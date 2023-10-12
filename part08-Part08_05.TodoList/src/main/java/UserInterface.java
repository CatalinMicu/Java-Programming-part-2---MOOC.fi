import java.util.*;

public class UserInterface {
    private TodoList lista;
    private Scanner scanner;
    
    public UserInterface(TodoList lista, Scanner scanner) {
        this.lista = lista;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            switch (input) {
                case "add":
                    System.out.println("To add: ");
                    String inputAdd = scanner.nextLine();
                    this.lista.add(inputAdd);
                    break;
                case "list":
                    this.lista.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    int inputDel = Integer.valueOf(scanner.nextLine());
                    this.lista.remove(inputDel);
                    break;
                case "stop":
                    return;
            } 
        }
    }
}
