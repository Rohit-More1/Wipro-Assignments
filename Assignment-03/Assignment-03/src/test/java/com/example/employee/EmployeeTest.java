package com.example.employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    void testEmployeeAttributes() {
        Employee employee = new Employee(1, "John Doe", 50000.0);
        assertEquals(1, employee.getId(), "Employee ID should be 1");
        assertEquals("John Doe", employee.getName(), "Employee name should be John Doe");
        assertEquals(50000.0, employee.getSalary(), "Employee salary should be 50000.0");
    }

    @Test
    void testRaiseSalary() {
        Employee employee = new Employee(1, "Jane Smith", 60000.0);
        employee.raiseSalary(5000.0);
        assertEquals(65000.0, employee.getSalary(), "Employee salary should be 65000.0 after raise");
    }

    @Test
    void testEmployeeEquality() {
        Employee employee1 = new Employee(1, "John Doe", 50000.0);
        Employee employee2 = new Employee(1, "John Doe", 50000.0);
        Employee employee3 = new Employee(2, "Jane Smith", 60000.0);

        assertEquals(employee1, employee2, "Employees with same id, name, and salary should be equal");
        assertNotEquals(employee1, employee3, "Employees with different id, name, or salary should not be equal");
    }
}
