package com.kasesky.inheritance;

public class Manager extends Employee {
    private Integer numOfEmployees;

    public Manager(String name, String email, String phone, Double salary,  Integer numOfEmployees) {
        super(name, email, phone, salary);
        this.numOfEmployees = numOfEmployees;
    }

    public Integer getNumOfEmployees() {
        return numOfEmployees;
    }

    @Override
    public Double increaseSalary(Double increase) {
        return salary = super.increaseSalary(increase) + 1000;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de empregados gerenciados: " + this.getNumOfEmployees();
    }
}