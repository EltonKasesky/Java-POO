package com.revisao.test;

import com.revisao.java.Empresa;
import com.revisao.java.Pessoa;
import com.revisao.java.TotalImposto;
import com.revisao.java.interfaces.Tributos;

public class App {
    public static void main(String[] args) {
        Empresa emp = new Empresa("Serratec", 100000.0);
        Pessoa p = new Pessoa("Elton Kasesky", 25000.0);
        TotalImposto ti = new TotalImposto();

        System.out.println(emp);
        System.out.println(p);

        ti.calcularTotalGeralTributos(p);
        ti.calcularTotalGeralTributos(emp);

        System.out.println("Total Geral pago juridico/fisico R$" + ti.getTotalGeral());
    }
}
