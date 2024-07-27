package Polymorphism;

public class TestInheritancepolymorphism {

	public static void main(String[] args) {

		// Bank bank=new Bank();//canot be Instantiated
		Bank bank =new SBI();// parent class refer subclass object
		System.out.println("sbi rate of interest:"+bank.getrateOfInterest());
		
		bank = new ICICIBank();
		System.out.println("icici rate of interest :"+bank.getrateOfInterest());
		System.out.println("country is:"+bank.country);
	}

}
