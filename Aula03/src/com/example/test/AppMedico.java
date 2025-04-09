package com.example.test;

import com.example.java.*;

public class AppMedico {
    public static void main(String[] args){
        Medico m1 = new Medico("123456", "Elton Kasesky", 14000.0);
        Pediatra p1 = new Pediatra("654321", "Inajara Giglio", 18000.0, "Neuropediatria");

        System.out.println(m1);
        System.out.println(p1);
    }
}
