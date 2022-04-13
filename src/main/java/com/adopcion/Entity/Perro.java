package com.adopcion.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Perro {
    @Id 
    private Long id; 
    private String nombre; 
    private String Caracteristica;

 
}
