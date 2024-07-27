package Assignment08062024ForCustomerInformation;

import java.util.Date;

public class WholesaleCustomer extends Customer {
    public WholesaleCustomer(String name, int age, Date dateOfBirth) {
        super(name, age, dateOfBirth);
    }

    @Override
    public double getDiscountRate() {
        return 0.20; 
    }
}