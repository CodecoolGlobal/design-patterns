package com.raczkowski.springintro.behavioral.chainofresponsibility;

import java.util.Date;

public class Form {

    private String name;
    private String surname;
    private Date birthday;
    private String phoneNumber;

    public Form(String name, String surname, Date birthday, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
