/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import modelo.Movimentacao;

import dao.MovimentacaoDAO;

import dao.ProdutoDAO;

/**
 * Tela responsável pelo cadastro de movimentação de estoque.
 * Permite registrar entradas e saídas de produtos.
 * 
 * @author Victoria
 */
public class FrmCadastroMovimentacao extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCadastroMovimentacao.class.getName());

    /**
     * Cria tela de cadastro de movimentação
     */
    public FrmCadastroMovimentacao() {
        initComponents();
    }

    /**
     * Método responsável por inicializar os componentes da tela.
     *Atenção: este código é gerado automáticamente pelo NetBeans.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IblTitulo = new javax.swing.JLabel();
        IblProduto = new javax.swing.JLabel();
        IblQuantidade = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        IblTipo = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        IblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        bntSalvar = new javax.swing.JButton();
        bntLimpar = new javax.swing.JButton();
        bntSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        IblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        IblTitulo.setText("Cadastro de Movimentação");

        IblProduto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        IblProduto.setText("Id produto:");

        IblQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        IblQuantidade.setText("Quantidade:");

        txtProduto.setColumns(25);
        txtProduto.addActionListener(this::txtProdutoActionPerformed);

        txtQuantidade.setColumns(10);
        txtQuantidade.addActionListener(this::txtQuantidadeActionPerformed);

        IblTipo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        IblTipo.setText("Tipo:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Saída" }));
        cbTipo.addActionListener(this::cbTipoActionPerformed);

        IblData.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        IblData.setText("Data:");

        txtData.setColumns(10);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(this::btnNovoActionPerformed);

        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(this::bntSalvarActionPerformed);

        bntLimpar.setText("Limpar");
        bntLimpar.addActionListener(this::bntLimparActionPerformed);

        bntSair.setText("Fechar");
        bntSair.addActionListener(this::bntSairActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(IblProduto)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(IblQuantidade)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IblTipo)
                                    .addComponent(IblData))
                                .addGap(60, 60, 60)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(bntSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(bntLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(bntSair)
                        .addContainerGap(52, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(IblTitulo)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IblProduto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IblQuantidade)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IblTipo)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IblData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(bntSalvar)
                    .addComponent(bntLimpar)
                    .addComponent(bntSair))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Evento executado ao interagir com o campo produto.
 * 
 */
    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed
/**
 * Evento executado ao selecionar o tipo de movimentação 
 * 
 */
    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed
/**
 * Limpa todos os campos da tela e prepara um novo cadastro.
 * 
 */
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        txtProduto.setText("");
        txtQuantidade.setText("");
        txtData.setText("");
        cbTipo.setSelectedIndex(0);
        txtProduto.requestFocus();

    }//GEN-LAST:event_btnNovoActionPerformed
/**
 * Fecha a tela de cadastro de movimentação.
 * 
 */
    private void bntSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSairActionPerformed

        dispose();

    }//GEN-LAST:event_bntSairActionPerformed
/**
 * Limpa os campos preenchidos pelo usuário.
 * 
 */
    private void bntLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparActionPerformed
        txtProduto.setText("");
        txtQuantidade.setText("");
        txtData.setText("");
        cbTipo.setSelectedIndex(0);
    }//GEN-LAST:event_bntLimparActionPerformed
/**
 * Salva a movimentação no banco de dados e atualiza o estoque do produto.
 * O método verifica se os campos foram preenchidos corretamente, registra 
 * entrada ou saída e atualiza a quantidade em estoque.
 * Também exibe avisos de estoque mínimo e máximo.
 * 
 */
    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        // TODO add your handling code here:

        String produto = txtProduto.getText();

        String quantidade = txtQuantidade.getText();

        String data = txtData.getText();

        String tipo = cbTipo.getSelectedItem().toString();

        if (produto.isEmpty() || quantidade.isEmpty() || data.isEmpty()) {

            javax.swing.JOptionPane.showMessageDialog(
                    null,
                    "Preencha todos os campos!"
            );

        } else {

            Movimentacao mov = new Movimentacao();

            mov.setProduto(produto);

            mov.setQuantidade(Integer.parseInt(quantidade));

            mov.setTipo(tipo);

            mov.setData(data);

            MovimentacaoDAO dao = new MovimentacaoDAO();

            dao.salvar(mov);

            ProdutoDAO produtoDAO = new ProdutoDAO();

            int idProduto = Integer.parseInt(produto);

            int estoqueAtual = produtoDAO.buscarEstoque(idProduto);

            int novoEstoque;

            if (tipo.equals("Entrada")) {

                novoEstoque = estoqueAtual + Integer.parseInt(quantidade);

            } else {

                novoEstoque = estoqueAtual - Integer.parseInt(quantidade);

            }

            produtoDAO.atualizarEstoque(idProduto, novoEstoque);

            javax.swing.JOptionPane.showMessageDialog(
                    null,
                    "Estoque atualizado: " + novoEstoque
            );

            if (novoEstoque < 10) {

                javax.swing.JOptionPane.showMessageDialog(
                        null,
                        "Estoque mínimo atingido!"
                );

            }

            if (novoEstoque > 100) {

                javax.swing.JOptionPane.showMessageDialog(
                        null,
                        "Estoque máximo atingido!"
                );

            }

            javax.swing.JOptionPane.showMessageDialog(
                    null,
                    "Movimentação salva com sucesso!"
            );
        }
    }//GEN-LAST:event_bntSalvarActionPerformed
/**
 * Evento executado ao interagir com o campo quantidade.
 * 
 */
    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    /**
     * Método principal responsável por iniciar a aplicação.
     * 
     * @param args argumentos da linha de comando
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmCadastroMovimentacao().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IblData;
    private javax.swing.JLabel IblProduto;
    private javax.swing.JLabel IblQuantidade;
    private javax.swing.JLabel IblTipo;
    private javax.swing.JLabel IblTitulo;
    private javax.swing.JButton bntLimpar;
    private javax.swing.JButton bntSair;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
