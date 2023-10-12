import java.util.*;

public class userInterface {
    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;
    
    public userInterface(Scanner scanner) {
        this.firstContainer = new Container();
        this.secondContainer = new Container();
        this.scanner = scanner;
    }
    
    public String citesteComanda() {
        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] bucati = input.split(" ");
            String comanda = bucati[0];
            int amount = Integer.valueOf(bucati[1]);
            if (comanda.equals("add")) {
                firstContainer.add(amount);
                firstContainer.isFull();
            }
            else if (comanda.equals("move")) {
                if (firstContainer.contains() >= amount) {
                firstContainer.move(amount);
                secondContainer.add(amount);
                secondContainer.isFull();
                } else secondContainer.add(firstContainer.contains());
                
            }
            else if (comanda.equals("remove")) {
                secondContainer.remove(amount);
            }
            
        }
        return null;
    }
    
    
}
