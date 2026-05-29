package visao;

import dao.CategoriaDAO;
import modelo.Categoria;
import javax.swing.JOptionPane;

/**
 * Tela responsável pelo cadastro e alteração de categorias.
 *
 * Essa classe permite cadastrar uma nova categoria ou editar uma categoria
 * já existente, informando nome, tamanho e tipo de embalagem.
 *
 * A tela utiliza a classe CategoriaDAO para realizar as operações no banco
 * de dados.
 *
 * @author Juan André Latronico
 * @version 1.0
 */
public class FrmCadastroCategoria extends javax.swing.JFrame {
    
    /**
     * Logger utilizado para registrar erros da tela.
     */
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCadastroCategoria.class.getName());
    
    /**
     * Armazena o identificador da categoria em edição.
     *
     * Quando o valor for 0, significa que será feito um novo cadastro.
     * Quando possuir um valor diferente de 0, significa que uma categoria
     * existente será alterada.
     */
    private int idCategoria = 0;
    
    /**
     * Construtor padrão da tela de cadastro de categoria.
     *
     * Inicializa os componentes gráficos da interface.
     */
    public FrmCadastroCategoria() {
        initComponents();
    }
    

    /**
     * Construtor utilizado para abrir a tela em modo de edição.
     *
     * Recebe o id da categoria, inicializa a tela e carrega os dados
     * cadastrados no banco.
     *
     * @param idCategoria identificador da categoria que será editada.
     */
    FrmCadastroCategoria(int idCategoria) {

        initComponents();
        this.idCategoria = idCategoria;
        receberIdCategoria(idCategoria);
    }
    
    /**
     * Recebe o identificador da categoria selecionada e carrega seus dados
     * na tela.
     *
     * @param idCategoria identificador da categoria que será carregada.
     */
    public void receberIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
        carregarDadosCategoria();
    }
    
    /**
     * Carrega os dados da categoria selecionada no formulário.
     *
     * Busca a categoria no banco de dados por meio da classe CategoriaDAO.
     * Caso encontre, preenche os campos da tela. Caso contrário, exibe
     * uma mensagem de erro e fecha a janela.
     */
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
    
    /**
     * Limpa os campos do formulário.
     *
     * Após limpar os dados, o foco retorna para o campo de nome.
     */
    private void limparCampos() {
        txtNome.setText("");
        cmbTamanho.setSelectedIndex(0);
        cmbEmbalagem.setSelectedIndex(0);
        txtNome.requestFocus();
    }
    
    /**
     * Valida o nome da categoria, o tamanho e a embalagem.
     *
     * @return true se todos os campos estiverem corretos, false caso contrário.
     */
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
        btnFechar = new javax.swing.JButton();
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

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(this::btnFecharActionPerformed);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(btnFechar))
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
                            .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Primeiro valida os campos. Depois cria um objeto Categoria com os dados
     * informados na tela. Se o id da categoria for 0, realiza um novo cadastro.
     * Caso contrário, altera uma categoria existente.
     *
     * @param evt evento de ação do botão salvar.
     */
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
    
    /**
     * @param evt evento de ação do botão limpar.
     */
    private void LimparCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCadastroActionPerformed
        limparCampos();
    }//GEN-LAST:event_LimparCadastroActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed
   
    /**
     * Fecha a janela atual sem salvar alterações.
     *
     * @param evt evento de ação do botão cancelar.
     */
    private void CancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarCadastroActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarCadastroActionPerformed
    /**
     * Chama o método responsável por fechar a tela.
     *
     * @param evt evento de ação do botão cancelar.
     */
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed
     
    /**
     * Chama o método responsável por validar os campos e salvar a categoria.
     *
     * @param evt evento de ação do botão salvar.
     */
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        SalvarCadastroActionPerformed(evt);
    }
    
    /**
     * Chama o método responsável por limpar os campos do formulário.
     *
     * @param evt evento de ação do botão limpar.
     */
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {
        LimparCadastroActionPerformed(evt);
    }
    
    /**
     * Método principal da aplicação. 
     *
     * abre a tela de cadastro de categoria.
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

        java.awt.EventQueue.invokeLater(() -> new FrmCadastroCategoria().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
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
