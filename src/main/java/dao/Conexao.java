package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        try {

            String url = "jdbc:mysql://localhost:3306/sistema_estoque";
            String usuario = "root";
            String senha = "Mysql@1312";

            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conectado com sucesso!");

            return conexao;

        } catch (Exception e) {

            System.out.println("Erro na conexão: " + e.getMessage());

            return null;
        }
    }
}
