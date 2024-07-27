package InheritanceAssisment;

public class PermanentEmployee extends Employee {
    private int bonus;

    public PermanentEmployee(int id, String name, double salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double calculateNetSalary() {
        return salary + bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Salary: " + calculateNetSalary());
    }
}
