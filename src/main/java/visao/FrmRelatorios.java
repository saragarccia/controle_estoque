package visao;

import dao.Conexao;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dcris
 */
public class FrmRelatorios extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmRelatorios.class.getName());

    /**
     * Creates new form FrmRelatorios
     */
    public FrmRelatorios() {

        initComponents();

        // Centraliza a janela
        setLocationRelativeTo(null);

        // Define altura das linhas da tabela
        tblRelatorio.setRowHeight(25);

        // Centraliza os botões no painel
        pnlBotoes.setLayout(new java.awt.FlowLayout(
                java.awt.FlowLayout.CENTER,
                15,
                10
        ));
        
        // Centraliza botão fechar no painel
        pnlFechar.setLayout(new java.awt.FlowLayout(
                java.awt.FlowLayout.CENTER,
                10,
                10
        ));

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlBotoes = new javax.swing.JPanel();
        btnListaPrecos = new javax.swing.JButton();
        btnEstoqueBaixo = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        btnMovimentacoes = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        scrRelatorio = new javax.swing.JScrollPane();
        tblRelatorio = new javax.swing.JTable();
        pnlFechar = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("RELATÓRIOS DE ESTOQUE");

        btnListaPrecos.setText("Lista de Preços");
        btnListaPrecos.addActionListener(this::btnListaPrecosActionPerformed);

        btnEstoqueBaixo.setText("Estoque Baixo");
        btnEstoqueBaixo.addActionListener(this::btnEstoqueBaixoActionPerformed);

        btnCategoria.setText("Categoria");
        btnCategoria.addActionListener(this::btnCategoriaActionPerformed);

        btnMovimentacoes.setText("Movimentações");
        btnMovimentacoes.addActionListener(this::btnMovimentacoesActionPerformed);

        btnFinanceiro.setText("Financeiro");
        btnFinanceiro.addActionListener(this::btnFinanceiroActionPerformed);

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(btnListaPrecos)
                .addGap(18, 18, 18)
                .addComponent(btnEstoqueBaixo)
                .addGap(18, 18, 18)
                .addComponent(btnCategoria)
                .addGap(18, 18, 18)
                .addComponent(btnMovimentacoes)
                .addGap(18, 18, 18)
                .addComponent(btnFinanceiro)
                .addGap(156, 156, 156))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaPrecos)
                    .addComponent(btnEstoqueBaixo)
                    .addComponent(btnCategoria)
                    .addComponent(btnMovimentacoes)
                    .addComponent(btnFinanceiro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrRelatorio.setName(""); // NOI18N

        tblRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Preço", "Quantidade em estoque", "Categoria"
            }
        ));
        scrRelatorio.setViewportView(tblRelatorio);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(this::btnFecharActionPerformed);

        javax.swing.GroupLayout pnlFecharLayout = new javax.swing.GroupLayout(pnlFechar);
        pnlFechar.setLayout(pnlFecharLayout);
        pnlFecharLayout.setHorizontalGroup(
            pnlFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFecharLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addGap(340, 340, 340))
        );
        pnlFecharLayout.setVerticalGroup(
            pnlFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFecharLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(btnFechar))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrRelatorio)
                    .addComponent(pnlFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaPrecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPrecosActionPerformed
        // TODO add your handling code here:
        try {

            Connection conn = Conexao.conectar();

            String sql
                    = "SELECT "
                    + "p.nome AS produto, "
                    + "p.preco_unitario, "
                    + "p.quantidade_estoque, "
                    + "c.nome AS categoria "
                    + "FROM produto p "
                    + "INNER JOIN categoria c "
                    + "ON p.id_categoria = c.id_categoria "
                    + "ORDER BY p.nome";

            PreparedStatement stmt
                    = conn.prepareStatement(sql);

            ResultSet rs
                    = stmt.executeQuery();

            DefaultTableModel modelo
                    = new DefaultTableModel();

            modelo.addColumn("Produto");

            modelo.addColumn("Preço");

            modelo.addColumn("Quantidade em Estoque");

            modelo.addColumn("Categoria");

            while (rs.next()) {

                modelo.addRow(new Object[]{
                    rs.getString("produto"),
                    rs.getDouble("preco_unitario"),
                    rs.getInt("quantidade_estoque"),
                    rs.getString("categoria")
                });
            }

            tblRelatorio.setModel(modelo);

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao gerar relatório!"
            );

            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnListaPrecosActionPerformed

    private void btnEstoqueBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueBaixoActionPerformed
        // TODO add your handling code here:
        try {

            Connection conn = Conexao.conectar();

            String sql
                    = "SELECT "
                    + "nome, "
                    + "quantidade_estoque, "
                    + "quantidade_minima "
                    + "FROM produto "
                    + "WHERE quantidade_estoque < quantidade_minima";

            PreparedStatement stmt
                    = conn.prepareStatement(sql);

            ResultSet rs
                    = stmt.executeQuery();

            DefaultTableModel modelo
                    = new DefaultTableModel();

            modelo.addColumn("Produto");

            modelo.addColumn("Quantidade em Estoque");

            modelo.addColumn("Quantidade Mínima");

            while (rs.next()) {

                modelo.addRow(new Object[]{
                    rs.getString("nome"),
                    rs.getInt("quantidade_estoque"),
                    rs.getInt("quantidade_minima")
                });
            }

            tblRelatorio.setModel(modelo);

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao gerar relatório!"
            );

            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEstoqueBaixoActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        // TODO add your handling code here:
        try {

            Connection conn = Conexao.conectar();

            String sql
                    = "SELECT "
                    + "c.nome AS categoria, "
                    + "COUNT(p.id_produto) "
                    + "AS quantidade_produtos "
                    + "FROM categoria c "
                    + "LEFT JOIN produto p "
                    + "ON c.id_categoria = p.id_categoria "
                    + "GROUP BY c.nome";

            PreparedStatement stmt
                    = conn.prepareStatement(sql);

            ResultSet rs
                    = stmt.executeQuery();

            DefaultTableModel modelo
                    = new DefaultTableModel();

            modelo.addColumn("Categoria");

            modelo.addColumn("Quantidade de Produtos");

            while (rs.next()) {

                modelo.addRow(new Object[]{
                    rs.getString("categoria"),
                    rs.getInt("quantidade_produtos")
                });
            }

            tblRelatorio.setModel(modelo);

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao gerar relatório!"
            );

            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnMovimentacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovimentacoesActionPerformed
        // TODO add your handling code here:
        try {

            Connection conn = Conexao.conectar();

            String sql
                    = "SELECT "
                    + "p.nome, "
                    + "m.data_movimentacao, "
                    + "m.quantidade_movimentada, "
                    + "m.tipo_movimentacao "
                    + "FROM movimentacao m "
                    + "INNER JOIN produto p "
                    + "ON m.id_produto = p.id_produto";

            PreparedStatement stmt
                    = conn.prepareStatement(sql);

            ResultSet rs
                    = stmt.executeQuery();

            DefaultTableModel modelo
                    = new DefaultTableModel();

            modelo.addColumn("Produto");

            modelo.addColumn("Data da Movimentação");

            modelo.addColumn("Quantidade");

            modelo.addColumn("Tipo");

            while (rs.next()) {

                modelo.addRow(new Object[]{
                    rs.getString("nome"),
                    rs.getString("data_movimentacao"),
                    rs.getInt("quantidade_movimentada"),
                    rs.getString("tipo_movimentacao")
                });
            }

            tblRelatorio.setModel(modelo);

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao gerar relatório!"
            );

            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnMovimentacoesActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        // TODO add your handling code here:
        try {

            Connection conn = Conexao.conectar();

            String sql
                    = "SELECT "
                    + "nome, "
                    + "quantidade_estoque, "
                    + "preco_unitario, "
                    + "(quantidade_estoque * preco_unitario) "
                    + "AS valor_total "
                    + "FROM produto";

            PreparedStatement stmt
                    = conn.prepareStatement(sql);

            ResultSet rs
                    = stmt.executeQuery();

            DefaultTableModel modelo
                    = new DefaultTableModel();

            modelo.addColumn("Produto");

            modelo.addColumn("Quantidade em Estoque");

            modelo.addColumn("Preço Unitário");

            modelo.addColumn("Valor Total");

            while (rs.next()) {

                modelo.addRow(new Object[]{
                    rs.getString("nome"),
                    rs.getInt("quantidade_estoque"),
                    rs.getDouble("preco_unitario"),
                    rs.getDouble("valor_total")
                });
            }

            tblRelatorio.setModel(modelo);

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao gerar relatório!"
            );

            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new FrmRelatorios().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnEstoqueBaixo;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnListaPrecos;
    private javax.swing.JButton btnMovimentacoes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlFechar;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scrRelatorio;
    private javax.swing.JTable tblRelatorio;
    // End of variables declaration//GEN-END:variables
}
