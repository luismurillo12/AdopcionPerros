package com.adopcion.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {

    @Id
    private Long id;
    private String nombre; 
    private String descripcion; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
