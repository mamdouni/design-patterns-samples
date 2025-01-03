package org.java.tutorial.adapter.legacy;

import lombok.Getter;
import lombok.Setter;

import java.util.StringTokenizer;

@Getter
@Setter
public class EmployeeCSV {

    private int id;
    private String firstname;
    private String lastname;
    private String emailAddress;

    public EmployeeCSV(String values) {

        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreElements()) {
            firstname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            lastname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }
    }
}
