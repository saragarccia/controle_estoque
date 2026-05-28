package modelo;

/**
 * Representa uma categoria cadastrada no sistema.
 * 
 * A categoria possui informações como identificador, nome,
 * tamanho e tipo de embalagem.
 * 
 * @author Juan André Latronico
 * @version 1.0
 */
public class Categoria {

    /**
     * Identificador único da categoria.
     */
    private int idCategoria;

    /**
     * Nome da categoria.
     */
    private String nome;

    /**
     * Tamanho relacionado à categoria.
     */
    private String tamanho;

    /**
     * Tipo de embalagem da categoria.
     */
    private String embalagem;

    /**
     * Construtor padrão da classe Categoria.
     * 
     * Inicializa os atributos com valores vazios ou zerados.
     */
    public Categoria() {
        this.idCategoria = 0;
        this.nome = "";
        this.tamanho = "";
        this.embalagem = "";
    }

    /**
     * Construtor da classe Categoria com todos os atributos.
     * 
     * @param idCategoria identificador da categoria.
     * @param nome nome da categoria.
     * @param tamanho tamanho relacionado à categoria.
     * @param embalagem tipo de embalagem da categoria.
     */
    public Categoria(int idCategoria, String nome, String tamanho, String embalagem) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    /**
     * Retorna o identificador da categoria.
     * 
     * @return id da categoria.
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * Define o identificador da categoria.
     * 
     * @param idCategoria novo id da categoria.
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * Retorna o nome da categoria.
     * 
     * @return nome da categoria.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da categoria.
     * 
     * @param nome novo nome da categoria.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o tamanho da categoria.
     * 
     * @return tamanho da categoria.
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * Define o tamanho da categoria.
     * 
     * @param tamanho novo tamanho da categoria.
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * Retorna o tipo de embalagem da categoria.
     * 
     * @return embalagem da categoria.
     */
    public String getEmbalagem() {
        return embalagem;
    }

    /**
     * Define o tipo de embalagem da categoria.
     * 
     * @param embalagem nova embalagem da categoria.
     */
    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    /**
     * Retorna o nome da categoria em formato de texto.
     * 
     * Esse método é usado quando o objeto Categoria precisa ser exibido
     * em listas, caixas de seleção ou impressões simples.
     * 
     * @return nome da categoria.
     */
    @Override
    public String toString() {
        return nome;
    }
}