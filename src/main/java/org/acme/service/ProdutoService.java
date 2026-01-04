package org.acme.service;

import java.util.ArrayList;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.persistence.EntityManager;

import java.util.List;

import org.acme.entity.Produto;


@ApplicationScoped
public class ProdutoService {

    public List<Produto> listAll(){

    List<Produto> listaProdutos = new ArrayList<>();
    
        Produto p = new Produto();
        p.nome = "Smartphone";
        p.descricao = "teste de produto";
        p.estoque = 10;
    
    listaProdutos.add(p);

    return listaProdutos;
    }
    
}
