package visao;

import dao.CategoriaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

public class FrmGerenciaCategoria extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmGerenciaCategoria.class.getName());

public FrmGerenciaCategoria() {
    initComponents();
    jTable1.setDefaultEditor(Object.class, null);
    carregarTabela();
    setLocationRelativeTo(null);
}

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

private int pegarIdSelecionado() {
    int linhaSelecionada = jTable1.getSelectedRow();

    if (linhaSelecionada < 0) {
        JOptionPane.showMessageDialog(this, "Selecione uma categoria na tabela.");
        return -1;
    }

    return Integer.parseInt(jTable1.getValueAt(linhaSelecionada, 0).toString());
}

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
    FrmCadastroCategoria tela = new FrmCadastroCategoria();
abrirTelaCadastro(tela);
    }//GEN-LAST:event_NovoActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
    int idCategoria = pegarIdSelecionado();

if (idCategoria != -1) {
    FrmCadastroCategoria tela = new FrmCadastroCategoria(idCategoria);
    abrirTelaCadastro(tela);
}
    }//GEN-LAST:event_EditarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
    int idCategoria = pegarIdSelecionado();

if (idCategoria == -1) {
    return;
}

int resposta = JOptionPane.showConfirmDialog(
        this,
        "Deseja realmente excluir esta categoria?",
        "Confirmar exclusão",
        JOptionPane.YES_NO_OPTION
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

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
    carregarTabela();
    }//GEN-LAST:event_AtualizarActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
    System.exit(0);
    }//GEN-LAST:event_FecharActionPerformed

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
