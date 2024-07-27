package InheritanceAssisment;

public class Employee {
    protected int id;
    protected String name;
    protected double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

    	PermanentEmployee permEmp = new PermanentEmployee(1, "Ram", 80000, 5000);

        ContractEmployee contEmp = new ContractEmployee(2, "Rahul", 50000, 3000);


        System.out.println("permanent employee detail:");
        permEmp.display();

        System.out.println();


        System.out.println("contract employee details:");
        contEmp.display();
    }
}
