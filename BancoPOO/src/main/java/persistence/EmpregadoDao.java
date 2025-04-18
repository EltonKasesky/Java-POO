package persistence;

import data.ConnectionFactory;
import model.EmpregadoModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpregadoDao {
    private Connection conn;

    public EmpregadoDao() {
        conn = new ConnectionFactory().getConnection();
    }

    public void inserir(EmpregadoModel empregado){
        String sql = "INSERT INTO empregado (nome, profissao, salario) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, empregado.getNome());
            stmt.setString(2, empregado.getProfissao());
            stmt.setDouble(3, empregado.getSalario());
            stmt.execute();
            System.out.println("Inserido com sucesso!");
        } catch(SQLException e) {
            System.out.println("Erro ao inserir empregado no banco de dados!");
            e.printStackTrace();
        }
    }
}
