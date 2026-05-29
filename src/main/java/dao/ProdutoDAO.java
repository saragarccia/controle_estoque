package dao;

import modelo.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/* Classe responsável por realizar operações de acesso ao banco de dados 
 * relacionadas aos produtos. 
 * 
 * Esta classe permite cadastrar, listar, editar, excluir, atualizar estoque e buscar a quantidade em estoque de um produto. 
 *  
 * @author Matheus */
public class ProdutoDAO {

    /* Cadastra um novo produto no banco de dados. 
    * 
    * @param produto Objeto Produto contendo os dados que serão cadastrados */
    public void cadastrar(Produto produto) {
        String sql = "INSERT INTO produto "
                + "(nome, preco_unitario, unidade, quantidade_estoque, quantidade_minima, quantidade_maxima, id_categoria) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPrecoUnitario());
            stmt.setString(3, produto.getUnidade());
            stmt.setInt(4, produto.getQuantidadeEstoque());
            stmt.setInt(5, produto.getQuantidadeMinima());
            stmt.setInt(6, produto.getQuantidadeMaxima());
            stmt.setInt(7, produto.getCategoriaId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }
    }

    /* Lista todos os produtos cadastrados no banco de dados. 
    * 
    * Os produtos são retornados em ordem alfabética pelo nome. 
    * 
    * @return Lista contendo os produtos cadastrados */
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto ORDER BY nome";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Produto p = new Produto();

                p.setId(rs.getInt("id_produto"));
                p.setNome(rs.getString("nome"));
                p.setPrecoUnitario(rs.getDouble("preco_unitario"));
                p.setUnidade(rs.getString("unidade"));
                p.setQuantidadeEstoque(rs.getInt("quantidade_estoque"));
                p.setQuantidadeMinima(rs.getInt("quantidade_minima"));
                p.setQuantidadeMaxima(rs.getInt("quantidade_maxima"));
                p.setCategoriaId(rs.getInt("id_categoria"));

                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar produtos: " + e.getMessage());
        }

        return lista;
    }

    /* Edita os dados de um produto já cadastrado no banco de dados. 
    * 
    * O produto é identificado pelo seu ID. 
    * 
    * @param produto Objeto Produto contendo os novos dados do produto */
    public void editar(Produto produto) {
        String sql = "UPDATE produto SET nome=?, preco_unitario=?, unidade=?, quantidade_estoque=?, "
                + "quantidade_minima=?, quantidade_maxima=?, id_categoria=? WHERE id_produto=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPrecoUnitario());
            stmt.setString(3, produto.getUnidade());
            stmt.setInt(4, produto.getQuantidadeEstoque());
            stmt.setInt(5, produto.getQuantidadeMinima());
            stmt.setInt(6, produto.getQuantidadeMaxima());
            stmt.setInt(7, produto.getCategoriaId());
            stmt.setInt(8, produto.getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao editar produto: " + e.getMessage());
        }
    }

    /* Exclui um produto do banco de dados. 
     * 
     * O produto é identificado pelo seu ID. 
     * 
     * @param id Identificador do produto que será excluído */
    public void excluir(int id) {
        String sql = "DELETE FROM produto WHERE id_produto=?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
        }
    }

    /* Atualiza a quantidade em estoque de um produto. 
    * 
    * O produto é identificado pelo seu ID. 
    * 
    * @param idProduto Identificador do produto 
    * @param novoEstoque Nova quantidade em estoque */
    public void atualizarEstoque(int idProduto, int novoEstoque) {

    String sql = "UPDATE produto SET quantidade_estoque=? WHERE id_produto=?";

    try (Connection conn = Conexao.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, novoEstoque);
        stmt.setInt(2, idProduto);

        stmt.executeUpdate();

    } catch (SQLException e) {

        System.out.println("Erro ao atualizar estoque: " + e.getMessage());

    }
}

    /* Busca a quantidade atual em estoque de um produto. 
    * 
    * O produto é identificado pelo seu ID. 
    * 
    * @param idProduto Identificador do produto * @return Quantidade atual em estoque do produto */
public int buscarEstoque(int idProduto) {

    int estoque = 0;

    String sql = "SELECT quantidade_estoque FROM produto WHERE id_produto=?";

    try (Connection conn = Conexao.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, idProduto);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {

            estoque = rs.getInt("quantidade_estoque");

        }

    } catch (SQLException e) {

        System.out.println("Erro ao buscar estoque: " + e.getMessage());

    }

    return estoque;
}
}
