package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe responsável por estabelecer a conexão com o banco de dados MySQL do
 * sistema de controle de estoque.
 *
 * @author Deise Cristine Souza Soares
 * @version 1.0
 */
public class Conexao {

    /**
     * Realiza a conexão com o banco de dados do sistema.
     *
     *@return conexão ativa com o banco de dados ou {@code null} em caso de erro
     */
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
