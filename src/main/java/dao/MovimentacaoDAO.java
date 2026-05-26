package dao;

import modelo.Movimentacao;
import javax.swing.JOptionPane;

public class MovimentacaoDAO {

    public void salvar(Movimentacao mov) {

        JOptionPane.showMessageDialog(null,
                "Salvo no banco!\nProduto: " + mov.getProduto());
    }
}