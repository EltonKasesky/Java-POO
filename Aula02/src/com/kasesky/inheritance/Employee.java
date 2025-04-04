package com.kasesky.inheritance;

public class Employee {
    private String name;
    private String email;
    private String phone;
    protected Double salary;

    public Employee(String name, String email, String phone, Double salary) {
        super();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Double getSalary() {
        return salary;
    }

    public Double increaseSalary(Double increase){
        return salary += salary * (increase / 100);
    }

    @Override
    public String toString() {
        return "Nome: " + this.getName() + "\nEmail: " + this.getEmail() + "\nTelefone: " + this.getPhone() +
                "\nSalario: " + this.getSalary();
    }
}
