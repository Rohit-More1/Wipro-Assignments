package statickeyword;

public class Employee {
	static int no = 100;
	static String Company = "Wipro";
	private int empNo;
	private String Name;
	private float Salary;
	
	public Employee(float salary, String name) {
		super();
		Name = name;
		Salary = salary;
		no = no+1;
		empNo = no;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
 
}
 