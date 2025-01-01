package org.java.tutorial;

import org.java.tutorial.legacy.EmployeeLdap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeListBefore() {

        List<Employee> employees = getDBEmployee();

        //Will not work! This is where the adapter comes into play!
        //Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

        return employees;
    }

    private static List<Employee> getDBEmployee() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        employees.add(employeeFromDB);
        return employees;
    }

    /**
     * This method will return a list of employees after the adapter is implemented
     * @return List<Employee> - a list of employees
     */
    public List<Employee> getEmployeeListAfter() {

        List<Employee> employees = getDBEmployee();

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        // Now we can create our Adapter
        // Imagine that the LDAP is a legacy system and we cannot change the code
        Employee employeeFromLdapAdapter = new EmployeeAdapterLdap(employeeFromLdap);
        employees.add(employeeFromLdapAdapter);

        return employees;
    }
}
