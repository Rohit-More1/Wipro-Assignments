package inheritance;
//super class
class Account {
	protected String accountNumber;
	protected double balance;
	
	

//constructor
public Account (String accountNumber, double balance) {
	this.accountNumber= accountNumber;
	this.balance= balance;
	
}

//method to deposit money
public void deposit (double amount) {
	balance+=amount;
	System.out.println(amount+"deposited cureent balance "+ balance);
	
	
}
//mwthod for withdrawl
public void withdraw(double amount) {
	if(balance>=amount) {
		balance-=amount;//withdrwa=withdraw-amount
		System.out.println(amount+"withdrwal cureent balance:"+balance);
	}
	else {
		System.out.println("insuffent withdrwal not possible");
	}
}

//method to display account information
public void displayAccountInfo() {
	System.out.println("account number:"+ accountNumber);
	System.out.println("balance"+ balance);
}

}



//subclass

class SavingAccount extends Account{
	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	private double interestRate;
	
	//constructor
	
}
