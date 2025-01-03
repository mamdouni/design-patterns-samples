package org.java.tutorial.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class EmployeeDB implements Employee {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
