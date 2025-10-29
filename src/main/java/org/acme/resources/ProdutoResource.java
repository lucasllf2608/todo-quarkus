package org.acme.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/produto")
public class ProdutoResource {
 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Produto";
    }
    
}
