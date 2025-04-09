package com.example;

import com.example.data.Data;

import java.sql.*;

public class App extends Data{
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_aula", "postgres", "root");
            if (conexao != null) {
                System.out.println("Banco de dados conectado com sucesso!");

                //inserirDados(conexao, "nome");

                consultaDados(conexao);
            } else {
                System.out.println("Falha na conexão com o banco de dados!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}