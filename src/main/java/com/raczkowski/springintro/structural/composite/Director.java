package com.raczkowski.springintro.structural.composite;

import java.util.List;

public class Director implements Employee {

    private List<Employee> employees;
    private String name;

    public Director(List<Employee> employees, String name) {
        this.employees = employees;
        this.name = name;
    }

    @Override
    public void increaseWage(int wage) {
        int money = wage / employees.size();

        employees
                .forEach(employee -> employee.increaseWage(money));
    }
}
