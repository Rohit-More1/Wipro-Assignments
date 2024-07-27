package Java8.Feature.Optional;
 
import java.util.Optional;
 
public class Employee {
    private String name;
    private Optional<String> email;
 
    public Employee(String name, String email) {
        this.name = name;
        this.email = Optional.ofNullable(email);
    }
 
    public String getName() {
        return name;
    }
 
    public Optional<String> getEmail() {
        return email;
    }
 
    public static void main(String[] args) {
        Employee emp1 = new Employee("Johnny denial", "johnny@example.com");
        Employee emp2 = new Employee("Jay Smith", null);
 
        printEmployeeEmail(emp1);
        printEmployeeEmail(emp2);
    }
 
    public static void printEmployeeEmail(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        employee.getEmail()
        .ifPresentOrElse(
            email -> System.out.println("Email: " + email), () -> System.out.println("Email not provided")
        );
    }
}