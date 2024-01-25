package com.mycompany.proyectoormjoelcoutolugo.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_avion;

    private String codigo;

    private String tipo;

    @OneToOne(mappedBy = "avion", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Vuelo vuelo;

    public Avion() {

    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Avion(String tipo) {
        this.tipo = tipo;
    }

    public Long getId_avion() {
        return id_avion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId_avion(Long id_avion) {
        this.id_avion = id_avion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Avion{id_avion=" + id_avion + ", codigo='" + codigo + "', tipo='" + tipo + "'}";
    }

}
