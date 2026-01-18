package org.acme.service;

import java.util.ArrayList;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.persistence.EntityManager;

import java.util.List;

import org.acme.dto.ProdutoRequest;
import org.acme.entity.Produto;
import org.acme.repository.ProdutoRepository;


@ApplicationScoped
public class ProdutoService {

    @Inject
    ProdutoRepository repository;

    public List<Produto> listAll(){
    List<Produto> listaProdutos = repository.listAll();
    return listaProdutos;
    }

    @Transactional
    public Produto salvarProduto(ProdutoRequest request){
        
        Produto produto = new Produto();
        
        produto.nome = request.nome();
        produto.descricao = request.descricao();
        produto.preco = request.preco();
        produto.estoque = request.estoque();

        repository.persist(produto);

        return produto;

    }



    public void consultarPorId(){

    }

    public void atualizarProduto(){

    }

    public void excluirProduto(){

    }
    
}
