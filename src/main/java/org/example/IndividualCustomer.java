package org.example;

import java.time.LocalDate;

public class IndividualCustomer extends Customer {

    String firstName;
    String lastName;

    //to find customers contain c in their first and last name
    String fullName = firstName + lastName;

    public IndividualCustomer(int id, LocalDate createdDate,String fullName, String firstName, String lastName, Invoice... invoices) {
        super(id, createdDate, invoices);
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
    }
}
