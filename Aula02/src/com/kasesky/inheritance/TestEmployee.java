package com.kasesky.inheritance;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Cainan Miguel", "cainanmiguel@gmail.com", "(24)98832-4321", 2000.0);
        Manager m1 = new Manager("Ana Julia", "anajulia@gmail.com", "(24)99280-1234", 6000.0, 10);
        Director d1 = new Director("Elton Kasesky", "eltonkasesky@gmail.com", "(24)99280-5678", 12000.0, "CEO");

        m1.increaseSalary(10.0);

        /*System.out.println("---------- Diretor ----------\nNome: " + d1.getName() + "\nArea de atuação: " + d1.getArea() + "\nSalario: R$" + d1.getSalary());
        System.out.println("---------- Gerente ----------\nNome: " + m1.getName() + "\nQuantidade de empregados: " + m1.getNumOfEmployees() + "\nSalario: R$" + m1.getSalary());
        System.out.println("---------- Empregado ----------\nNome: " + e1.getName() + "\nSalario: R$" + e1.increaseSalary(10.0));*/

        //toString - Chamando ou não .toString é referenciado o metodo
        System.out.println(d1 + "\n");
        System.out.println(m1 + "\n");
        System.out.println(e1 + "\n");
    }
}