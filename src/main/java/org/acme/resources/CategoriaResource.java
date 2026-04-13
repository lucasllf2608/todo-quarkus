package org.acme.resources;

import org.acme.entity.Categoria;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/categorias")
@Transactional
public class CategoriaResource {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Categoria";
    }

    @POST
    public Response criarCategoria(Categoria categoria){
        categoria.persist();
        return Response.status(201).entity(categoria).build();
    }

}
