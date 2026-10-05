package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository; 
import org.acme.entity.Produto; 
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProdutoRepository implements PanacheRepository<Produto> {
    
}
