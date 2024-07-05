package com.example.employee;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeParameterizedTest {

    @ParameterizedTest
    @ValueSource(doubles = {50000.0, 60000.0, 75000.0})
    void testCalculateYearlyBonus(double salary) {
        Employee employee = new Employee(1, "John Doe", salary);
        double expectedBonus = salary * 0.1;
        assertEquals(expectedBonus, employee.calculateYearlyBonus(), "The yearly bonus calculation is incorrect");
    }
}
