package InheritanceAssisment;

public class ContractEmployee extends Employee {
    private int incentive;

    
    public ContractEmployee(int id, String name, double salary, int incentive) {
        super(id, name, salary);
        this.incentive = incentive;
    }

    public double calculateNetSalary() {
        return salary + incentive;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Incentive: " + incentive);
        System.out.println("Salary: " + calculateNetSalary());
    }
}
