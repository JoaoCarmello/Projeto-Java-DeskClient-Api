 package com.calcadosapi.calcados.Model;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Calcado {
    
   //Propriedades responsaveis por gravar e setar os dados armazenados.
   //Get GUARDAR DADOS - Set - SETAR DADOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Campo não informado.")
    private Long id;
    @Column(nullable = false)
    @NotBlank(message = "Campo não informado.")
    private Integer tamanho;
    @Column(nullable = false)
    @NotBlank(message = "Campo não informado.")
    private String categoria;
    @Column(nullable = false)
    @NotBlank(message = "Campo não informado.")
    private String cor;
    @NotBlank(message = "Campo não informado.")
    @Column(nullable = false)
    private Double preco;
    @NotBlank(message = "Campo não informado.")
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    @NotBlank(message = "Campo não informado.")
    private LocalDate datacadastro = LocalDate.now();
    @NotBlank(message = "Campo não informado.")
    @Column(nullable = false)
    private Integer qtdestoque;
    @NotBlank(message = "Campo não informado.")
    @Column(nullable = true)
    private String descricao;
    
        
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
    public LocalDate getDatacadastro() {
        return datacadastro;
    }
    public void setDatacadastro(LocalDate datacadastro) {
        this.datacadastro = datacadastro;
    }
    public long getQtdestoque() {
        return qtdestoque;
    }
    public void setQtdestoque(Integer qtdestoque) {
        this.qtdestoque = qtdestoque;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
