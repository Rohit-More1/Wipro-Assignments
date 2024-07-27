package Assignment08062024ForCustomerInformation;

import java.util.Date;

public abstract class Customer {
	private String name;
    private int age;
    private Date dateOfBirth;
	public Customer(String name, int age, Date dateOfBirth) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public abstract double getDiscountRate();
	
}
