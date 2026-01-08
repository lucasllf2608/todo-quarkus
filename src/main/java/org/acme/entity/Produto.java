package org.acme.entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import java.math.BigDecimal; 


@Entity
public class Produto extends PanacheEntity {

    public String nome;
    public String descricao;
    public BigDecimal preco;
    public int estoque;

}