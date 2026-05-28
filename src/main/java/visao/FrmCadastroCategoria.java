package visao;

import dao.CategoriaDAO;
import modelo.Categoria;
import javax.swing.JOptionPane;

public class FrmCadastroCategoria extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCadastroCategoria.class.getName());

    private int idCategoria = 0;

    public FrmCadastroCategoria() {
        initComponents();
    }

    FrmCadastroCategoria(int idCategoria) {

        initComponents();
        this.idCategoria = idCategoria;
        receberIdCategoria(idCategoria);
    }

    public void receberIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
        carregarDadosCategoria();
    }

    private void carregarDadosCategoria() {
        CategoriaDAO dao = new CategoriaDAO();
        Categoria categoria = dao.buscarCategoria(idCategoria);

        if (categoria != null) {
            txtNome.setText(categoria.getNome());
            cmbTamanho.setSelectedItem(categoria.getTamanho());
            cmbEmbalagem.setSelectedItem(categoria.getEmbalagem());
        } else {
            JOptionPane.showMessageDialog(this, "Categoria não encontrada.");
            this.dispose();
        }
    }

    private void limparCampos() {
        txtNome.setText("");
        cmbTamanho.setSelectedIndex(0);
        cmbEmbalagem.setSelectedIndex(0);
        txtNome.requestFocus();
    }

    private boolean camposValidos() {
        if (txtNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o nome da categoria.");
            return false;
        }

        if (cmbTamanho.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione o tamanho.");
            return false;
        }

        if (cmbEmbalagem.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione a embalagem.");
            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblTamanho = new javax.swing.JLabel();
        lblEmbalagem = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbTamanho = new javax.swing.JComboBox<>();
        cmbEmbalagem = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        lblCadastroCategoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNome.setText("Nome:");

        lblTamanho.setText("Tamanho:");

        lblEmbalagem.setText("Embalagem:");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(this::btnLimparActionPerformed);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        cmbTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Pequeno", "Médio", "Grande" }));

        cmbEmbalagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Lata", "Vidro", "Plástico" }));

        txtNome.addActionListener(this::txtNomeActionPerformed);

        lblCadastroCategoria.setText("Cadastro de Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(45, 45, 45)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTamanho)
                            .addComponent(lblEmbalagem)
                            .addComponent(lblNome))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTamanho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbEmbalagem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNome))))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(lblCadastroCategoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblCadastroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTamanho)
                    .addComponent(cmbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmbalagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarCadastroActionPerformed
        if (!camposValidos()) {
            return;
        }

        Categoria categoria = new Categoria();

        categoria.setIdCategoria(idCategoria);
        categoria.setNome(txtNome.getText().trim());
        categoria.setTamanho(cmbTamanho.getSelectedItem().toString());
        categoria.setEmbalagem(cmbEmbalagem.getSelectedItem().toString());

        CategoriaDAO dao = new CategoriaDAO();

        boolean sucesso;

        if (idCategoria == 0) {
            sucesso = dao.cadastrarCategoria(categoria);
        } else {
            sucesso = dao.alterarCategoria(categoria);
        }

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Categoria salva com sucesso!");
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar categoria.");
        }
    }//GEN-LAST:event_SalvarCadastroActionPerformed

    private void LimparCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCadastroActionPerformed
        limparCampos();
    }//GEN-LAST:event_LimparCadastroActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void CancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarCadastroActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarCadastroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        CancelarCadastroActionPerformed(evt);
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        SalvarCadastroActionPerformed(evt);
    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {
        LimparCadastroActionPerformed(evt);
    }

    /**
     * @param args the command line arguments
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
        java.awt.EventQueue.invokeLater(() -> new FrmCadastroCategoria().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbEmbalagem;
    private javax.swing.JComboBox<String> cmbTamanho;
    private javax.swing.JLabel lblCadastroCategoria;
    private javax.swing.JLabel lblEmbalagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTamanho;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
