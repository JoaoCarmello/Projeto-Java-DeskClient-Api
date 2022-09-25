package com.calcadosapi.calcados.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


import com.calcadosapi.calcados.Database.RepositoryCalcado;
import com.calcadosapi.calcados.Model.Calcado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calcado")
public class ControllerCalcado {
  //METODOS RESPONSAVEIS POR REALIZAR A AÇÃO DESEJADA.
  //REQUESTBODY - NECESSÁRIO PASSAR DADOS PELO CORPO DA REQUISIÇÃO
  //REQUESTPARAM - NECESSARIO PASSAR OS DADOS PELA URL QUE SÃO SOLICITADAS AO REPOSITORIO
  //METODOS UTILIZADOS - GET(CONSULTAS), POST(CADASTRO), PUT(ALTERAÇÃO), DELETE(EXCLUSAO)

    @Autowired
    private RepositoryCalcado repositorio;
    
    @GetMapping
    public List<Calcado> listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody Calcado calcado){
        repositorio.save(calcado);
        
    }
    @PutMapping
    public void alterar(@RequestBody Calcado calcado){
        if(calcado.getId() > 0)
        repositorio.save(calcado);
    }

    @DeleteMapping("deletar/")
    public void deletar(@RequestParam Long id){
    repositorio.deleteById(id);
    }

    @GetMapping("BuscarID/")
    public Optional<Calcado> buscarID(@RequestParam Long id) {
        return repositorio.findById(id);
    }

    @GetMapping("buscarTamanho/")
    public ResponseEntity<List<Calcado>> buscarTamanho(@RequestParam Integer tamanho) {

        List<Calcado> calcado = repositorio.buscarPorTamanho(tamanho);
        return new ResponseEntity<List<Calcado>>(calcado, HttpStatus.OK);
    }

   @GetMapping("buscarCategoria/")
   public ResponseEntity<List<Calcado>> buscarCategoria(@RequestParam String categoria) {

       List<Calcado> calcado = repositorio.buscarPorCategoria(categoria.toUpperCase());
       return new ResponseEntity<List<Calcado>>(calcado, HttpStatus.OK);
   }

    @GetMapping("buscarCor/")
    public ResponseEntity<List<Calcado>> buscarCor(@RequestParam String cor) {

        List<Calcado> calcado = repositorio.buscarPorCor(cor.toUpperCase());
        return new ResponseEntity<List<Calcado>>(calcado, HttpStatus.OK);
    }
    
    @GetMapping("buscarPreco/")
    public ResponseEntity<List<Calcado>> buscarPreco(@RequestParam double preco) {

        List<Calcado> calcado = repositorio.buscarPorPreco(preco);
        return new ResponseEntity<List<Calcado>>(calcado, HttpStatus.OK);
    }

    
    @GetMapping("buscarMarca/")
    public ResponseEntity<List<Calcado>> buscarMarca(@RequestParam String marca) {

        List<Calcado> calcado = repositorio.buscarPorMarca(marca.toUpperCase());
        return new ResponseEntity<List<Calcado>>(calcado, HttpStatus.OK);
    }
    
    
    @GetMapping("buscarData/")
    public ResponseEntity<List<Calcado>> buscarData(@RequestParam("datacadastro")
    @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate datacadastro) {
        
        List<Calcado> calcado = repositorio.buscarPorData(datacadastro);
        return new ResponseEntity<List<Calcado>>(calcado, HttpStatus.OK);
    }

    @GetMapping("buscarDescricao/")
    public ResponseEntity<List<Calcado>> buscarDescricao(@RequestParam String descricao) {
 
        List<Calcado> calcado = repositorio.buscarPorDescricao(descricao.toUpperCase());
        return new ResponseEntity<List<Calcado>>(calcado, HttpStatus.OK);
    }
}