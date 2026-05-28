package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Categoria;

public class CategoriaDAO {

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
