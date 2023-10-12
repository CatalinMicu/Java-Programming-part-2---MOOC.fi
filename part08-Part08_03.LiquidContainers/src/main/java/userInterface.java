import java.util.*;

public class userInterface {
    private first firstContainer;
    private second secondContainer;
    private Scanner scanner;
    
    public userInterface(Scanner scanner) {
        this.firstContainer = new first();
        this.secondContainer = new second();
        this.scanner = scanner;
    }
    
    public String citesteComanda() {
        while (true) {
            System.out.println(firstContainer);
            System.out.println(secondContainer);
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
                if (firstContainer.getVolum() >= amount) {
                firstContainer.move(amount);
                secondContainer.add(amount);
                secondContainer.isFull();
                } else secondContainer.add(firstContainer.getVolum());
                
            }
            else if (comanda.equals("remove")) {
                secondContainer.remove(amount);
            }
            
        }
        return null;
    }
    
    
}
