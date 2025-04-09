package com.example.data;

import java.sql.*;

public class Data {
    public static void consultaDados(Connection conexao) {
        String sql = "SELECT id_usuario, nome FROM usuario";
        try (Statement stmt = conexao.createStatement()) {
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                System.out.println("ID do usuario: " + result.getInt("id_usuario") + ", Nome: " + result.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserirDados(Connection conexao, String nome) {
        String sql = "INSERT INTO usuario(nome) VALUES(?)";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            if(!nome.isEmpty()) {
                pstmt.setString(1, nome); // Define o parâmetro para o valor do nome
                pstmt.executeUpdate();
                System.out.println("Dados inseridos com sucesso!");
            } else {
                System.out.println("Insira um nome para inserção!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
