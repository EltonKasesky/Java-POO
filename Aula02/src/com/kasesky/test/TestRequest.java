package com.kasesky.test;

import com.kasesky.request.Request;
import java.time.LocalDate;

public class TestRequest {
    public static void main(String[] args) {
        Request[] r = new Request[2];
        r[0] = new Request(1, LocalDate.of(2025, 7, 13), 100.0, 2);

        System.out.println("N⁰ Pedido: " + r[0].getNumber() + "\nData: " + r[0].getDate() + "\nValor unitario: " + r[0].getValue() +
                "\nQuantidade: " + r[0].getQuantity() + "\nValor total: " + r[0].getTotal());
    }
}
