package Model;

import java.util.Date;


public class Calcado {
 
    private long id;

    private Integer tamanho;
 
    private String categoria;

    private String cor;

    private Double preco;

    private String marca;

    private Date  dataCadastro;

    private Integer qtdEstoque;

    private String descricao;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getTamanho() {
        return tamanho;
    }
    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Date getdataCadastro() {
        return dataCadastro;
    }
    public void setdataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public long getqtdEstoque() {
        return qtdEstoque;
    }
    public void setQt_estoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

