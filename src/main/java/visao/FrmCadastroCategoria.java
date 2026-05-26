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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void receberIdCategoria(int idCategoria) {
    this.idCategoria = idCategoria;
    carregarDadosCategoria();
}

private void carregarDadosCategoria() {
    CategoriaDAO dao = new CategoriaDAO();
    Categoria categoria = dao.buscarCategoria(idCategoria);

    if (categoria != null) {
        jTextField1.setText(categoria.getNome());
        jComboBox1.setSelectedItem(categoria.getTamanho());
        jComboBox2.setSelectedItem(categoria.getEmbalagem());
    } else {
        JOptionPane.showMessageDialog(this, "Categoria não encontrada.");
        this.dispose();
    }
}

private void limparCampos() {
    jTextField1.setText("");
    jComboBox1.setSelectedIndex(0);
    jComboBox2.setSelectedIndex(0);
    jTextField1.requestFocus();
}

private boolean camposValidos() {
    if (jTextField1.getText().trim().equals("")) {
        JOptionPane.showMessageDialog(this, "Informe o nome da categoria.");
        return false;
    }

    if (jComboBox1.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Selecione o tamanho.");
        return false;
    }

    if (jComboBox2.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Selecione a embalagem.");
        return false;
    }

    return true;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LimparCadastro = new javax.swing.JButton();
        SalvarCadastro = new javax.swing.JButton();
        CancelarCadastro = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Tamanho:");

        jLabel3.setText("Embalagem");

        LimparCadastro.setText("Limpar");
        LimparCadastro.addActionListener(this::LimparCadastroActionPerformed);

        SalvarCadastro.setText("Salvar");
        SalvarCadastro.addActionListener(this::SalvarCadastroActionPerformed);

        CancelarCadastro.setText("Cancelar");
        CancelarCadastro.addActionListener(this::CancelarCadastroActionPerformed);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Pequeno", "Médio", "Grande" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Lata", "Vidro", "Plástico" }));

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SalvarCadastro)
                        .addGap(45, 45, 45)
                        .addComponent(LimparCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(CancelarCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LimparCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalvarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
categoria.setNome(jTextField1.getText().trim());
categoria.setTamanho(jComboBox1.getSelectedItem().toString());
categoria.setEmbalagem(jComboBox2.getSelectedItem().toString());

CategoriaDAO dao = new CategoriaDAO();

boolean sucesso;

if (idCategoria == 0) {
    sucesso = dao.cadastrarCategoria(categoria);
} else {
    sucesso = dao.alterarCategoria(categoria);
}

if (sucesso) {
    JOptionPane.showMessageDialog(this, "Categoria salva com sucesso!");
    this.dispose();
} else {
    JOptionPane.showMessageDialog(this, "Erro ao salvar categoria.");
}
    }//GEN-LAST:event_SalvarCadastroActionPerformed

    private void LimparCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCadastroActionPerformed
    limparCampos(); 
    }//GEN-LAST:event_LimparCadastroActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void CancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarCadastroActionPerformed
    this.dispose();
    }//GEN-LAST:event_CancelarCadastroActionPerformed

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
    private javax.swing.JButton CancelarCadastro;
    private javax.swing.JButton LimparCadastro;
    private javax.swing.JButton SalvarCadastro;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
