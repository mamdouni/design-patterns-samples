package org.java.tutorial;

import lombok.AllArgsConstructor;
import org.java.tutorial.legacy.EmployeeCSV;

@AllArgsConstructor
public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV employeeFromCSV;

    @Override
    public String getId() {
        // Here the id is an integer, so we need to convert it to a string
        return String.valueOf(employeeFromCSV.getId());
    }

    @Override
    public String getFirstName() {
        // Note here that the attribute is called firstname with lowercase and not camelcase
        return employeeFromCSV.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeFromCSV.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeFromCSV.getEmailAddress();
    }
}
