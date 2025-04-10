package com.revisao.java;

import com.revisao.java.interfaces.Tributos;

public class TotalImposto {
    private Double totalGeral = 0.0;

    public Double getTotalGeral() {
        return totalGeral;
    }

    public void calcularTotalGeralTributos(Tributos tributos){
        if(tributos.calcularICMS() > 0){
            this.totalGeral += tributos.calcularICMS();
            System.out.println("Total geral ICMS: R$" + tributos.calcularICMS());
        }

        this.totalGeral += tributos.calcularIR();
        System.out.println("Total geral pago: R$" + tributos.calcularIR());
    }
}