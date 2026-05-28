package principal;

import visao.FrmMenuPrincipal;

/**
 * Classe principal do sistema de controle de estoque. Responsável por iniciar a
 * aplicação e exibir a tela de menu principal.
 *
 * @author Deise Cristine Souza Soares
 * @version 1.0
 * @see visao.FrmMenuPrincipal
 */
public class Principal {

    /**
     * Método principal da aplicação. Inicializa o sistema e exibe o menu
     * principal.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {

        FrmMenuPrincipal menu = new FrmMenuPrincipal();
        menu.setVisible(true);

    }
}
