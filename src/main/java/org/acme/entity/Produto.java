package org.acme.entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import java.math.BigDecimal; 

import lombok.NoArgsConstructor; 
import lombok.AllArgsConstructor; 
import lombok.ToString;
import lombok.EqualsAndHashCode;

@Entity
@NoArgsConstructor 
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Produto extends PanacheEntity {

    public String nome;
    public String descricao;
    public BigDecimal preco;
    public int estoque;

}