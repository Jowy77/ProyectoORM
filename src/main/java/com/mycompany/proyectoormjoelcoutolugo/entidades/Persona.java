package com.mycompany.proyectoormjoelcoutolugo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import javax.annotation.processing.Generated;

@MappedSuperclass
public class Persona {
    
    public String codigo;
    public String nombre;

}
