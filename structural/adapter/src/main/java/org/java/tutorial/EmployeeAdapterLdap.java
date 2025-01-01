package org.java.tutorial;

import lombok.AllArgsConstructor;
import org.java.tutorial.legacy.EmployeeLdap;

@AllArgsConstructor
public class EmployeeAdapterLdap implements Employee {

    private final EmployeeLdap employeeLdap;

    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getMail();
    }
}
