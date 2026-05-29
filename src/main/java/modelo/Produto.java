package modelo;

/* Classe responsável por representar um produto no sistema de estoque.
 * A classe armazena informações como: * id, nome, preço, unidade e quantidades do produto. 
 * 
 * @author Matheus
 */
public class Produto {

    /* Identificador do produto */
    private int id;
    
   /* Nome do produto */
    private String nome;
    
    /* Preço unitário do produto */
    private double precoUnitario;
    
    /* Unidade de medida do produto */
    private String unidade;
    
    /* Quantidade atual em estoque */
    private int quantidadeEstoque;
    
    /* Quantidade mínima permitida em estoque */
    private int quantidadeMinima;
    
    /* Quantidade máxima permitida em estoque */
    private int quantidadeMaxima;
    
    /* Identificador da categoria do produto */
    private int categoriaId;
    
    /* Construtor vazio da classe Produto */
    public Produto() {
    }
    /* Define o ID do produto. 
    * 
    * @param id Identificador do produto */
    public void setId(int id) {
        this.id = id;
    }
    
    /* Define o nome do produto. 
    *  
    * @param nome Nome do produto */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /* Define o preço unitário do produto. 
     * 
     * @param precoUnitario Preço unitário do produto */
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    /* Define a unidade de medida do produto. 
    * 
    * @param unidade Unidade de medida */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    /* Define a quantidade atual em estoque. 
     *
     * @param quantidadeEstoque Quantidade em estoque */
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /* Define a quantidade mínima do produto. 
     * 
     * @param quantidadeMinima Quantidade mínima */
    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    /* Define a quantidade máxima do produto. 
     * 
     * @param quantidadeMaxima Quantidade máxima */
    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    /* Define o ID da categoria do produto. 
    * 
    * @param categoriaId ID da categoria */
    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    /* Construtor completo da classe Produto. 
    * 
    * @param id Identificador do produto 
    * @param nome Nome do produto 
    * @param precoUnitario Preço unitário 
    * @param unidade Unidade de medida 
    * @param quantidadeEstoque Quantidade em estoque 
    * @param quantidadeMinima Quantidade mínima 
    * @param quantidadeMaxima Quantidade máxima 
    * @param categoriaId ID da categoria */
    public Produto(int id, String nome, double precoUnitario, String unidade,
            int quantidadeEstoque, int quantidadeMinima,
            int quantidadeMaxima, int categoriaId) {
        this.id = id;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.unidade = unidade;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
        this.categoriaId = categoriaId;
    }

    /* Retorna o ID do produto.
     * 
     * @return ID do produto */
    public int getId() {
        return id;
    }

    /* Retorna o nome do produto.
    * 
    * @return nome do produto */
    public String getNome() {
        return nome;
    }

    /*  Retorna o preço unitário do produto. 
    *
    * @return Preço unitário */
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    /* Retorna a unidade de medida do produto. 
    *
    * @return Unidade de medida */
    public String getUnidade() {
        return unidade;
    }

    /* Retorna a quantidade em estoque. 
    * 
    * @return Quantidade em estoque */
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    /* Retorna a quantidade mínima do produto. 
    * 
    * @return Quantidade mínima */
    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    /* Retorna a quantidade máxima do produto. 
    * 
    * @return Quantidade máxima */
    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    /* Retorna o ID da categoria do produto. 
    * 
    * @return ID da categoria */
    public int getCategoriaId() {
        return categoriaId;
    }
}
