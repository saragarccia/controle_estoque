package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Movimentacao;

/**
 * Classe responsável pelas operações de movimentação no banco de dados.
 *
 * @author viicp
 */
public class MovimentacaoDAO {
/**
 * Salva uma movimentação no banco de dados.
 * 
 * @param mov 
 */
    public void salvar(Movimentacao mov) {
        //Comando SQL para inserir movimentação
        String sql = "INSERT INTO movimentacao "
                + "(id_produto, data_movimentacao, quantidade_movimentada, tipo_movimentacao) "
                + "VALUES (?, ?, ?, ?)";

        try {
// Abre conexão com o banco
            Connection conexao = Conexao.conectar();
// Prepara o comando SQL
            PreparedStatement comando = conexao.prepareStatement(sql);
// Define os valores da movimentação
            comando.setInt(1, Integer.parseInt(mov.getProduto()));

            comando.setString(2, mov.getData());

            comando.setInt(3, mov.getQuantidade());

            comando.setString(4, mov.getTipo());
// Executa o comando no banco
            comando.executeUpdate();
// Fecha conexão e comando
            comando.close();
            conexao.close();
// Mensagem de sucesso
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Movimentação salva no banco!");

        } catch (Exception e) {
// Mensagem de erro
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Erro ao salvar: " + e.getMessage());
        }
    }
}
