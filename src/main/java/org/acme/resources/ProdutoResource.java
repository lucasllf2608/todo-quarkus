package org.acme.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.acme.entity.Produto;
import org.acme.service.ProdutoService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/produto")
public class ProdutoResource {

    private final Random random = new Random();

    @Inject
    private ProdutoService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Produto";
    }

    @GET 
    @Path("/gerarNumeroRandomico")
    @Produces(MediaType.TEXT_PLAIN) 
    public String gerarNumeroRandomico() {
        int num = random.nextInt(100); 
        return "Seu número randômico é: " + num;
    }

    @GET 
    @Path("/listAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produto> listAll(){
        List<Produto> listaProdutos = service.listAll();
        return listaProdutos;
    }

    
}
