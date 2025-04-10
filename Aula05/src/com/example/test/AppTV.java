package com.example.test;

import com.example.java.Marca;
import com.example.java.TV;

public class AppTV {
    public static void main(String[] args) {
        TV tv = new TV("SN-123", Marca.APPLE);

        System.out.println(tv);
    }
}
