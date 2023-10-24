import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
        Teacher ciulan = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ciulan);
        ArrayList<Person> persons = new ArrayList<Person>();     
        
    }
    
    public static void printPersons(ArrayList<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }

}
