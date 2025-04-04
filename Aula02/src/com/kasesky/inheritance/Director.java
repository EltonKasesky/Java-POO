package com.kasesky.inheritance;

public class Director extends Employee {
    private String area;

    public Director(String name, String email, String phone,Double salary, String area) {
        super(name, email, phone, salary);
        this.area = area;
    }

    public String getArea(){
        return this.area;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea de atuação: " + this.getArea();
    }
}
