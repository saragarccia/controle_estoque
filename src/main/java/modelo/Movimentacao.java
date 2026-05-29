package modelo;
/**
 * Classe responsável por representar uma movimentação de estoque.
 * Armazena informações de entrada e saída de produtos.
 * 
 * @author viicp
 */
public class Movimentacao {
/**
 * Identificador da movimentação 
 */
    private int id;
/**
 * Produto relacionado à movimentação 
 */
    private String produto;
/**
 * Quantidade movimentada.
 */
    private int quantidade;
/**
 * Tipo da movimentação.
 * Exemplo: Entrada ou Saída
 */
    private String tipo;
/**
 * Data da movimentação.
 */
    private String data;
/**
 * Retorna o id da movimentação.
 * 
 * @return id da movimentação
 */
    public int getId() {
        return id;
    }
    /**
     * Define o id da movimentação.
     * 
     * @param id identificador da movimentação
     */

    public void setId(int id) {
        this.id = id;
    }
/**
 * Retorna o produto da movimentação.
 * 
 * @return Produto
 */
    public String getProduto() {
        return produto;
    }
/**
 * Define o produto da movimentação.
 * 
 * @param produto nome ou id do produto
 */
    public void setProduto(String produto) {
        this.produto = produto;
    }
/**
 * Retorna a quantidade movimentada.
 * 
 * @return quantidade
 */
    public int getQuantidade() {
        return quantidade;
    }
/**
 * Define a quantidade movimentada.
 * 
 * @param quantidade quantidade do produto
 */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
/**
 * Retorna o tipo da movimentação.
 * 
 * @return tipo da movimentação
 */
    public String getTipo() {
        return tipo;
    }
/**
 * Define o tipo da movimentação.
 * 
 * @param tipo entrada ou saída
 */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
/**
 * Retorna a data da movimentação.
 * 
 * @return data da movimentação
 */
    public String getData() {
        return data;
    }
/**
 * Define a data da movimentação.
 * 
 * @param data data da movimentação 
 */
    public void setData(String data) {
        this.data = data;
    }
}
