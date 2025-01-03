package org.java.tutorial.adapter.legacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class EmployeeLdap {

    private String cn;
    private String surname;
    private String givenName;
    private String mail;
}
