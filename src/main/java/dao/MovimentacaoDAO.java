package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Movimentacao;

public class MovimentacaoDAO {

    public void salvar(Movimentacao mov) {

        String sql = "INSERT INTO movimentacao "
                + "(id_produto, data_movimentacao, quantidade_movimentada, tipo_movimentacao) "
                + "VALUES (?, ?, ?, ?)";

        try {

            Connection conexao = Conexao.conectar();

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setInt(1, Integer.parseInt(mov.getProduto()));

            comando.setString(2, mov.getData());

            comando.setInt(3, mov.getQuantidade());

            comando.setString(4, mov.getTipo());

            comando.executeUpdate();

            comando.close();
            conexao.close();

            javax.swing.JOptionPane.showMessageDialog(null,
                    "Movimentação salva no banco!");

        } catch (Exception e) {

            javax.swing.JOptionPane.showMessageDialog(null,
                    "Erro ao salvar: " + e.getMessage());
        }
    }
}