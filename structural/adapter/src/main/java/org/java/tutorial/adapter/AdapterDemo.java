package org.java.tutorial.adapter;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class AdapterDemo {

    public static void main(String[] args) {

        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeListAfter();

        log.info(employees.toString());
    }
}
