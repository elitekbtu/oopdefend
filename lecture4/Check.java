package lecture4;
import java.util.Scanner;
import java.util.Vector;

public class Check {
    public static void main(String[] args) {        
        Vector<Person> persons = new Vector<>();
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.println("Choose option:");
            System.out.println("press button 1 for adding person");            
            System.out.println("press button 2 for printing all information about persons");
            System.out.println("press button 0 for exit");
            int san = sc.nextInt();           
            sc.nextLine(); 

            if (san == 1) {
                System.out.println("Choose 1-Person; 2-Student; 3-Staff");                
                int san1 = sc.nextInt();
                sc.nextLine(); // Consume newline
                System.out.println("Enter the name:");               
                String name = sc.nextLine();
                System.out.println("Enter the address:");                
                String address = sc.nextLine();

                if (san1 == 1) {
                    persons.add(new Person(name, address));
                } else if (san1 == 2) {
                    System.out.println("Enter program:");                    
                    String program = sc.nextLine();
                    System.out.println("Enter the year:");                    
                    int year = sc.nextInt();
                    System.out.println("Enter the fee:");
                    double fee = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    persons.add(new Student(name, address, year, fee, program));                
                } else if (san1 == 3) {
                    System.out.println("Enter school:");
                    String school = sc.nextLine();
                    System.out.println("Enter the pay:");
                    double pay = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    persons.add(new Staff(name, address, school, pay));                
                } else {
                    System.out.println("You made an error with the option.");
                }
            } else if (san == 2) {                
                if (persons.isEmpty()) {
                    System.out.println("There are no people in the database.");                    
                } else {
                    for (Person x : persons) {
                        System.out.println(x.toString());
                    }
                }
            } else if (san == 0) {                
                System.out.println("Bye bye");
                break;
            } else {
                System.out.println("Try another option");
            }
        }
        sc.close();
    }
}
