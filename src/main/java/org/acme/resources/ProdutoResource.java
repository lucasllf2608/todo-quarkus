package org.acme.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.acme.dto.ProdutoRequest;
import org.acme.entity.Produto;
import org.acme.service.ProdutoService;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/produtos")
public class ProdutoResource {

    @Inject
    private ProdutoService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Produto";
    }

 
    @GET 
    @Path("/listall")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produto> listAll(){
        return service.listAll();
    }


    @POST
    public Response salvarProduto(@Valid ProdutoRequest request){
        System.out.println(request.toString());
        Produto p = service.salvarProduto(request);    
        return Response.status(Response.Status.CREATED).entity(p).build();
    }

    
    @GET 
    @Path("/consultarPorId")
    @Produces(MediaType.APPLICATION_JSON)
    public void consultarPorId(Long id){

    }

    public void atualizarProduto(){

    }

    public void excluirProduto(){

    }

    
}
