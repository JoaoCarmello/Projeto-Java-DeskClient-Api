package com.calcadosapi.calcados.Database;

import java.time.LocalDate;
import java.util.List;

import com.calcadosapi.calcados.Model.Calcado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositoryCalcado extends JpaRepository <Calcado, Long>{

    //CONSULTAS NO BANCO NECESSÁRIO PARA REALIZAÇÃO DA AÇÃO NECESSÁRIA.

    @Query(value= "SELECT t FROM Calcado t where t.tamanho = ?1")
    List<Calcado> buscarPorTamanho(Integer tamanho);

    @Query(value= "SELECT c FROM Calcado c where upper(c.categoria) = ?1 ")
    List<Calcado> buscarPorCategoria(String categoria);

    @Query(value= "SELECT c FROM Calcado c where upper(c.cor) like %?1% ")
    List<Calcado> buscarPorCor(String cor);

    @Query(value= "SELECT p FROM Calcado p where p.preco = ?1 ")
    List<Calcado> buscarPorPreco(Double preco);

    @Query(value= "SELECT m FROM Calcado m where upper(m.marca) like %?1% ")
    List<Calcado> buscarPorMarca(String marca);
 
    @Query(value= "SELECT c FROM Calcado c where c.datacadastro = ?1 ")
    List<Calcado> buscarPorData(LocalDate datacadastro);

    @Query(value= "SELECT d FROM Calcado d where upper(d.descricao) like %?1% ")
    List<Calcado> buscarPorDescricao(String Descricao);
    
}
