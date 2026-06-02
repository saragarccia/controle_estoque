package visao;

import dao.CategoriaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

/**
 * Tela responsável pelo gerenciamento de categorias.
 *
 * Permite listar, cadastrar, editar, excluir e atualizar categorias
 * cadastradas no sistema.
 *
 * Essa tela utiliza a classe CategoriaDAO para acessar os dados
 * da tabela categoria no banco de dados.
 *
 * @author Juan André Latronico
 * @version 1.0
 */
public class FrmGerenciaCategoria extends javax.swing.JFrame {
    
    /**
     * Logger utilizado para registrar possíveis erros da tela.
     */
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmGerenciaCategoria.class.getName());
    
    /**
     * Construtor da tela de gerenciamento de categorias.
     *
     * Inicializa os componentes gráficos, bloqueia a edição direta
     * da tabela, carrega as categorias cadastradas e centraliza a janela.
     */
    public FrmGerenciaCategoria() {
        initComponents();
        jTable1.setDefaultEditor(Object.class, null);
        carregarTabela();
        setLocationRelativeTo(null);
    }
    
    /**
     * Carrega as categorias cadastradas no banco de dados e exibe
     * os dados na tabela da tela.
     *
     * Primeiro busca a lista de categorias por meio da CategoriaDAO.
     * Depois limpa a tabela e adiciona novamente os registros encontrados.
     */
    private void carregarTabela() {
        CategoriaDAO dao = new CategoriaDAO();
        ArrayList<Categoria> lista = dao.listarCategorias();

        DefaultTableModel modeloTabela = (DefaultTableModel) jTable1.getModel();
        modeloTabela.setRowCount(0);

        for (Categoria categoria : lista) {
            modeloTabela.addRow(new Object[]{
                categoria.getIdCategoria(),
                categoria.getNome(),
                categoria.getTamanho(),
                categoria.getEmbalagem()
            });
        }
    }
    
    /**
     * Obtém o identificador da categoria selecionada na tabela.
     *
     * Caso nenhuma linha esteja selecionada, exibe uma mensagem
     * ao usuário e retorna -1.
     *
     * @return id da categoria selecionada ou -1 caso nenhuma linha esteja selecionada.
     */
    private int pegarIdSelecionado() {
        int linhaSelecionada = jTable1.getSelectedRow();

        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria na tabela.");
            return -1;
        }

        return Integer.parseInt(jTable1.getValueAt(linhaSelecionada, 0).toString());
    }
    
    /**
     * Abre a tela de cadastro de categoria.
     *
     * Ao fechar a tela de cadastro, a tabela de gerenciamento é atualizada
     * automaticamente para mostrar os dados mais recentes.
     *
     * @param tela tela de cadastro de categoria que será aberta.
     */
    private void abrirTelaCadastro(FrmCadastroCategoria tela) {
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                carregarTabela();
            }
        });

        tela.setLocationRelativeTo(this);
        tela.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Novo = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Novo.setText("Novo");
        Novo.addActionListener(this::NovoActionPerformed);

        Editar.setText("Editar");
        Editar.addActionListener(this::EditarActionPerformed);

        Excluir.setText("Excluir");
        Excluir.addActionListener(this::ExcluirActionPerformed);

        Atualizar.setText("Atualizar");
        Atualizar.addActionListener(this::AtualizarActionPerformed);

        Fechar.setText("Fechar");
        Fechar.addActionListener(this::FecharActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Tamanho", "Embalagem"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Gerenciamento de Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Atualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fechar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    /**
     * Evento executado ao clicar no botão Novo.
     *
     * Abre a tela de cadastro para registrar uma nova categoria.
     *
     * @param evt evento de ação do botão Novo.
     */
    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        FrmCadastroCategoria tela = new FrmCadastroCategoria();
        abrirTelaCadastro(tela);
    }//GEN-LAST:event_NovoActionPerformed
  
    /**
     * Evento executado ao clicar no botão Editar.
     *
     * Verifica qual categoria foi selecionada na tabela e abre a tela
     * de cadastro em modo de edição.
     *
     * @param evt evento de ação do botão Editar.
     */
    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        int idCategoria = pegarIdSelecionado();

        if (idCategoria != -1) {
            FrmCadastroCategoria tela = new FrmCadastroCategoria(idCategoria);
            abrirTelaCadastro(tela);
        }
    }//GEN-LAST:event_EditarActionPerformed
  
    /**
     * Evento executado ao clicar no botão Excluir.
     *
     * Verifica a categoria selecionada, solicita confirmação do usuário
     * e, se confirmado, exclui a categoria do banco de dados.
     *
     * @param evt evento de ação do botão Excluir.
     */
    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        int idCategoria = pegarIdSelecionado();

        if (idCategoria == -1) {
            return;
        }
        Object[] opcoes = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(
                this,
                "Deseja realmente excluir esta categoria?",
                "Confirmar exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        if (resposta == JOptionPane.YES_OPTION) {
            CategoriaDAO dao = new CategoriaDAO();
            boolean sucesso = dao.excluirCategoria(idCategoria);

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Categoria excluída com sucesso!");
                carregarTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir categoria.");
            }
        }
    }//GEN-LAST:event_ExcluirActionPerformed
 
    /**
     * Evento executado ao clicar no botão Atualizar.
     *
     * Recarrega a tabela com os dados mais recentes do banco.
     *
     * @param evt evento de ação do botão Atualizar.
     */
    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        carregarTabela();
    }//GEN-LAST:event_AtualizarActionPerformed
   
    /**
     * Evento executado ao clicar no botão Fechar.
     *
     * Encerra a aplicação.
     *
     * @param evt evento de ação do botão Fechar.
     */
    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharActionPerformed

    /**
     * Método principal da aplicação.
     *
     * abre a tela de gerenciamento de categorias.
     *
     * @param args argumentos da linha de comando.
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> new FrmGerenciaCategoria().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Novo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
