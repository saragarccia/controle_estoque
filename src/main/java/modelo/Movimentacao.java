
package modelo;

public class Movimentacao {
    private int id;

private String produto;

private int quantidade;

private String tipo;

private String data;
    public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getProduto() {
    return produto;
}

public void setProduto(String produto) {
    this.produto = produto;
}

public int getQuantidade() {
    return quantidade;
}

public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public String getData() {
    return data;
}

public void setData(String data) {
    this.data = data;
}
}
