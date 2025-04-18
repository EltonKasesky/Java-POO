import data.ConnectionFactory;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection conn = new ConnectionFactory().getConnection();
    }
}
