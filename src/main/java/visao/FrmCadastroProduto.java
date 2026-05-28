
package visao;

import dao.ProdutoDAO;
import modelo.Produto;
import javax.swing.JOptionPane;

public class FrmCadastroProduto extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCadastroProduto.class.getName());

    
    public FrmCadastroProduto() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCategoriaId = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecoUnitario = new javax.swing.JTextField();
        txtQuantidadeEstoque = new javax.swing.JTextField();
        txtUnidade = new javax.swing.JTextField();
        txtQuantidadeMaxima = new javax.swing.JTextField();
        txtQuantidadeMinima = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();

        txtNome5.addActionListener(this::txtNome5ActionPerformed);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome:");

        txtCategoriaId.addActionListener(this::txtCategoriaIdActionPerformed);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(this::btnCadastrarActionPerformed);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setText("  Cadastro de Produto ");

        jLabel4.setText("Preço Unitário:");

        btnVoltar.setText("Fechar");
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(this::btnLimparActionPerformed);

        jLabel5.setText("Unidade:");

        jLabel6.setText("Qtd. Estoque:");

        jLabel7.setText("Qtd. Mínima:");

        jLabel8.setText("Qtd. Máxima:");

        jLabel9.setText("Categoria ID:");

        txtPrecoUnitario.addActionListener(this::txtPrecoUnitarioActionPerformed);

        txtQuantidadeEstoque.addActionListener(this::txtQuantidadeEstoqueActionPerformed);

        txtUnidade.addActionListener(this::txtUnidadeActionPerformed);

        txtQuantidadeMaxima.addActionListener(this::txtQuantidadeMaximaActionPerformed);

        txtQuantidadeMinima.addActionListener(this::txtQuantidadeMinimaActionPerformed);

        txtNome.addActionListener(this::txtNomeActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(btnLimpar)
                                .addGap(48, 48, 48)
                                .addComponent(btnVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                            .addComponent(txtPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(99, 99, 99)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtQuantidadeMinima, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                                .addComponent(txtQuantidadeMaxima, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCategoriaId, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtQuantidadeEstoque))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtQuantidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCategoriaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVoltar)
                    .addComponent(btnLimpar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCategoriaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaIdActionPerformed
        
    }//GEN-LAST:event_txtCategoriaIdActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
     try {
    Produto produto = new Produto();

    produto.setNome(txtNome.getText());
    produto.setPrecoUnitario(Double.parseDouble(txtPrecoUnitario.getText()));
    produto.setUnidade(txtUnidade.getText());
    produto.setQuantidadeEstoque(Integer.parseInt(txtQuantidadeEstoque.getText()));
    produto.setQuantidadeMinima(Integer.parseInt(txtQuantidadeMinima.getText()));
    produto.setQuantidadeMaxima(Integer.parseInt(txtQuantidadeMaxima.getText()));
    produto.setCategoriaId(Integer.parseInt(txtCategoriaId.getText()));

    ProdutoDAO dao = new ProdutoDAO();
    dao.cadastrar(produto);

    JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Erro ao cadastrar produto: " + e.getMessage());
}
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
    txtPrecoUnitario.setText("");
    txtUnidade.setText("");
    txtQuantidadeEstoque.setText("");
    txtQuantidadeMinima.setText("");
    txtQuantidadeMaxima.setText("");
    txtCategoriaId.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtPrecoUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoUnitarioActionPerformed
        
    }//GEN-LAST:event_txtPrecoUnitarioActionPerformed

    private void txtQuantidadeEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeEstoqueActionPerformed
        
    }//GEN-LAST:event_txtQuantidadeEstoqueActionPerformed

    private void txtUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeActionPerformed
       
    }//GEN-LAST:event_txtUnidadeActionPerformed

    private void txtQuantidadeMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeMaximaActionPerformed
        
    }//GEN-LAST:event_txtQuantidadeMaximaActionPerformed

    private void txtNome5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome5ActionPerformed
       
    }//GEN-LAST:event_txtNome5ActionPerformed

    private void txtQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeMinimaActionPerformed
        
    }//GEN-LAST:event_txtQuantidadeMinimaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
       
    }//GEN-LAST:event_txtNomeActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new FrmCadastroProduto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCategoriaId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome5;
    private javax.swing.JTextField txtPrecoUnitario;
    private javax.swing.JTextField txtQuantidadeEstoque;
    private javax.swing.JTextField txtQuantidadeMaxima;
    private javax.swing.JTextField txtQuantidadeMinima;
    private javax.swing.JTextField txtUnidade;
    // End of variables declaration//GEN-END:variables
}
