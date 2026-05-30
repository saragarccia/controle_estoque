package visao;

import dao.ProdutoDAO;
import modelo.Produto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/* Tela responsável pelo gerenciamento de produtos do sistema. 
 * 
 * Esta classe permite visualizar, atualizar e excluir produtos 
 * cadastrados no banco de dados. 
 * 
 * A interface apresenta uma tabela contendo todos os produtos 
 * cadastrados no sistema. 
 * 
 * @author Matheus */
public class FrmGerenciaProduto extends javax.swing.JFrame {

    /*Logger utilizado para registrar informações e erros da classe. */
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmGerenciaProduto.class.getName());

    /* Construtor da tela de gerenciamento de produtos. 
     * 
     * Inicializa os componentes da interface e carrega os dados 
    * da tabela de produtos. */
    public FrmGerenciaProduto() {
        initComponents();
        carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblProdutos);

        jScrollPane1.setViewportView(jScrollPane4);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gerenciar Produto");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(this::btnAtualizarActionPerformed);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(this::btnFecharActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnAtualizar)
                        .addGap(61, 61, 61)
                        .addComponent(btnExcluir)
                        .addGap(64, 64, 64)
                        .addComponent(btnFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir)
                    .addComponent(btnFechar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Atualiza os dados exibidos na tabela de produtos. 
     *
     * @param evt Evento de ação do botão */
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        carregarTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    /* Fecha a janela de gerenciamento de produtos. 
     *
     * @param evt Evento de ação do botão */
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    /* Remove o produto selecionado da tabela * e do banco de dados após confirmação do usuário. 
     * 
     * @param evt Evento de ação do botão */
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int linha = tblProdutos.getSelectedRow();

        /* Verifica se algum produto foi selecionado. */
        if (linha == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione um produto."
            );
            return;
        }
    
        /* Opções exibidas na confirmação de exclusão. */
        Object[] opcoes = {"Sim", "Não"};

        int confirmacao = JOptionPane.showOptionDialog(
                this,
                "Tem certeza que deseja excluir este produto?",
                "Confirmar exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        /* Executa a exclusão caso o usuário confirme. */
        if (confirmacao == JOptionPane.YES_OPTION) {

            int id = Integer.parseInt(
                    tblProdutos.getValueAt(linha, 0).toString()
            );

            ProdutoDAO dao = new ProdutoDAO();
            dao.excluir(id);

            JOptionPane.showMessageDialog(
                    this,
                    "Produto excluído!"
            );

            carregarTabela();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    /* Método principal responsável por iniciar a aplicação. 
     * Define o tema visual da interface e exibe a tela. 
     * 
     * @param args Argumentos da linha de comando */
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

        /* Cria e exibe a tela de gerenciamento. */
        java.awt.EventQueue.invokeLater(() -> new FrmGerenciaProduto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblProdutos;
    // End of variables declaration//GEN-END:variables

    /* Carrega os produtos cadastrados no banco de dados e exibe as informações na tabela da interface. 
     * 
     * Cria as colunas da tabela e adiciona os dados retornados pela classe ProdutoDAO. */
    private void carregarTabela() {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Preço");
        modelo.addColumn("Unidade");
        modelo.addColumn("Estoque");
        modelo.addColumn("Mínimo");
        modelo.addColumn("Máximo");
        modelo.addColumn("Categoria");

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista = dao.listar();

        /* Adiciona os produtos na tabela. */
        for (Produto p : lista) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getPrecoUnitario(),
                p.getUnidade(),
                p.getQuantidadeEstoque(),
                p.getQuantidadeMinima(),
                p.getQuantidadeMaxima(),
                p.getCategoriaId()
            });
        }

        /* Atualiza a tabela exibida na interface. */
        tblProdutos.setModel(modelo);
    }
}
