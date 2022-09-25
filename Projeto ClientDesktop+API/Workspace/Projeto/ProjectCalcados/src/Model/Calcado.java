package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calcado {

    public Integer id;

    public Integer tamanho;

    public String categoria; 

    public String cor;

    public Double preco;

    public String marca;
    
    public Date datacadastro;

    public Integer qtdestoque;

    public String descricao;

    public Integer getId() {
        return id;
    }
  
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getTamanho() {
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

    public Date getdatacadastro() {
        return datacadastro;
    }

    public void setdatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public Integer getqtdestoque() {
        return qtdestoque;
    }

    public void setqtdestoque(Integer qtdestoque) {
        this.qtdestoque = qtdestoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

  @Override
    public String toString() {
         SimpleDateFormat fd = new SimpleDateFormat("dd-MM-yyyy");
        return "Calcado{" + "id=" + id + ", tamanho=" + tamanho + ", categoria=" + categoria + ", cor=" + cor + ", preco=" + preco + ", marca=" + marca + ", datacadastro=" + fd.format(datacadastro) + ", qtdestoque=" + qtdestoque + ", descricao=" + descricao + '}';
    }
 }
