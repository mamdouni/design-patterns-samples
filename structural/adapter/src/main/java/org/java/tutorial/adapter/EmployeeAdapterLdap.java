package org.java.tutorial.adapter;

import lombok.AllArgsConstructor;
import org.java.tutorial.adapter.legacy.EmployeeLdap;

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

    // Note that we can add a toString method here to print the object,
    // but there is a debate on whether we should add it or not.
    // This is an adapter, it can create a conflict with the decorator pattern.
}
