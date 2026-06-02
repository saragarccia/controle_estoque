package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Categoria;

/**
 * Classe responsável pelas operações de acesso ao banco de dados
 * relacionadas à entidade Categoria.
 *
 * @author Juan André Latronico
 * @version 1.0
 */
public class CategoriaDAO {

    /**
     * Cadastra uma nova categoria no banco de dados.
     *
     * @param categoria objeto Categoria contendo nome, tamanho e embalagem.
     * @return true se a categoria for cadastrada com sucesso, false caso contrário.
     */
    public boolean cadastrarCategoria(Categoria categoria) {
        String sql = "INSERT INTO categoria (nome, tamanho, embalagem) VALUES (?, ?, ?)";

        try {
            Connection conexao = Conexao.conectar();

            if (conexao == null) {
                System.out.println("Conexão está nula. Verifique o Conexao.java.");
                return false;
            }

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setString(1, categoria.getNome());
            comando.setString(2, categoria.getTamanho());
            comando.setString(3, categoria.getEmbalagem());

            comando.executeUpdate();
 
            comando.close();
            conexao.close();

            System.out.println("Categoria cadastrada no banco!");

            return true;

        } catch (Exception erro) {
            System.out.println("Erro ao cadastrar categoria: " + erro.getMessage());
            return false;
        }
    }

    /**
     * Altera os dados de uma categoria já cadastrada no banco de dados.
     *
     * @param categoria objeto Categoria contendo os novos dados e o id da categoria.
     * @return true se a alteração for realizada com sucesso, false caso contrário.
     */
    public boolean alterarCategoria(Categoria categoria) {
        String sql = "UPDATE categoria SET nome = ?, tamanho = ?, embalagem = ? WHERE id_categoria = ?";

        try {
            Connection conexao = Conexao.conectar();

            if (conexao == null) {
                System.out.println("Conexão está nula. Verifique o Conexao.java.");
                return false;
            }

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setString(1, categoria.getNome());
            comando.setString(2, categoria.getTamanho());
            comando.setString(3, categoria.getEmbalagem());
            comando.setInt(4, categoria.getIdCategoria());

            comando.executeUpdate();

            comando.close();
            conexao.close();

            return true;

        } catch (Exception erro) {
            System.out.println("Erro ao alterar categoria: " + erro.getMessage());
            return false;
        }
    }

    /**
     * Exclui uma categoria do banco de dados a partir do seu identificador.
     *
     * @param idCategoria identificador da categoria que será excluída.
     * @return true se a exclusão for realizada com sucesso, false caso contrário.
     */
    public boolean excluirCategoria(int idCategoria) {
        String sql = "DELETE FROM categoria WHERE id_categoria = ?";

        try {
            Connection conexao = Conexao.conectar();

            if (conexao == null) {
                System.out.println("Conexão está nula. Verifique o Conexao.java.");
                return false;
            }

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setInt(1, idCategoria);
            comando.executeUpdate();

            comando.close();
            conexao.close();

            return true;

        } catch (Exception erro) {
            System.out.println("Erro ao excluir categoria: " + erro.getMessage());
            return false;
        }
    }

    /**
     * Lista todas as categorias cadastradas no banco de dados.
     *
     * As categorias são retornadas em ordem alfabética pelo nome.
     *
     * @return lista de objetos Categoria encontrados no banco de dados.
     */
    public ArrayList<Categoria> listarCategorias() {
        ArrayList<Categoria> lista = new ArrayList<>();

        String sql = "SELECT * FROM categoria ORDER BY nome";

        try {
            Connection conexao = Conexao.conectar();

            if (conexao == null) {
                System.out.println("Conexão está nula. Verifique o Conexao.java.");
                return lista;
            }

            PreparedStatement comando = conexao.prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();

            while (resultado.next()) {
                Categoria categoria = new Categoria();

                categoria.setIdCategoria(resultado.getInt("id_categoria"));
                categoria.setNome(resultado.getString("nome"));
                categoria.setTamanho(resultado.getString("tamanho"));
                categoria.setEmbalagem(resultado.getString("embalagem"));

                lista.add(categoria);
            }

            resultado.close();
            comando.close();
            conexao.close();

        } catch (Exception erro) {
            System.out.println("Erro ao listar categorias: " + erro.getMessage());
        }

        return lista;
    }

    /**
     * Pesquisa categorias no banco de dados pelo nome.
     *
     * A busca utiliza o operador LIKE, permitindo encontrar categorias
     * que contenham parte do nome informado.
     *
     * @param nome nome ou parte do nome da categoria a ser pesquisada.
     * @return lista de categorias encontradas na pesquisa.
     */
    public ArrayList<Categoria> pesquisarCategoria(String nome) {
        ArrayList<Categoria> lista = new ArrayList<>();

        String sql = "SELECT * FROM categoria WHERE nome LIKE ? ORDER BY nome";

        try {
            Connection conexao = Conexao.conectar();

            if (conexao == null) {
                System.out.println("Conexão está nula. Verifique o Conexao.java.");
                return lista;
            }

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setString(1, "%" + nome + "%");

            ResultSet resultado = comando.executeQuery();

            while (resultado.next()) {
                Categoria categoria = new Categoria();

                categoria.setIdCategoria(resultado.getInt("id_categoria"));
                categoria.setNome(resultado.getString("nome"));
                categoria.setTamanho(resultado.getString("tamanho"));
                categoria.setEmbalagem(resultado.getString("embalagem"));

                lista.add(categoria);
            }

            resultado.close();
            comando.close();
            conexao.close();

        } catch (Exception erro) {
            System.out.println("Erro ao pesquisar categoria: " + erro.getMessage());
        }

        return lista;
    }

    /**
     * Busca uma categoria específica pelo seu identificador.
     *
     * @param idCategoria identificador da categoria que será buscada.
     * @return objeto Categoria encontrado ou null caso não exista.
     */
    public Categoria buscarCategoria(int idCategoria) {
        Categoria categoria = null;

        String sql = "SELECT * FROM categoria WHERE id_categoria = ?";

        try {
            Connection conexao = Conexao.conectar();

            if (conexao == null) {
                System.out.println("Conexão está nula. Verifique o Conexao.java.");
                return null;
            }

            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setInt(1, idCategoria);

            ResultSet resultado = comando.executeQuery();

            if (resultado.next()) {
                categoria = new Categoria();

                categoria.setIdCategoria(resultado.getInt("id_categoria"));
                categoria.setNome(resultado.getString("nome"));
                categoria.setTamanho(resultado.getString("tamanho"));
                categoria.setEmbalagem(resultado.getString("embalagem"));
            }

            resultado.close();
            comando.close();
            conexao.close();

        } catch (Exception erro) {
            System.out.println("Erro ao buscar categoria: " + erro.getMessage());
        }

        return categoria;
    }
}