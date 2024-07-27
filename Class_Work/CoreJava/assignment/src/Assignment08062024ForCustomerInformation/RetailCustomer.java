package Assignment08062024ForCustomerInformation;


import java.util.Date;

public class RetailCustomer extends Customer {
    public RetailCustomer(String name, int age, Date dateOfBirth) {
        super(name, age, dateOfBirth);
    }

    @Override
    public double getDiscountRate() {
        return 0.10; 
    }
}

