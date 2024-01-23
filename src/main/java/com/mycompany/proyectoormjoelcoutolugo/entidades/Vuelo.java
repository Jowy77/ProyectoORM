package com.mycompany.proyectoormjoelcoutolugo.entidades;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origen;

    private String destino;

    private String numeroDeVuelo;

    private Date fechaVuelo;

    private String horaSalida;

    @ManyToOne
    @JoinColumn(name = "id_piloto")
    private Piloto piloto;

    @ManyToOne
    @JoinColumn(name = "id_miembro")
    private Miembro miembro;
    
    @OneToOne
    @JoinColumn(name = "id_avion")
    private Avion avion;

    public Vuelo(String origen, String destino, String numeroDeVuelo, Date fecha, String horaSalida, Avion avion) {
        this.origen = origen;
        this.destino = destino;
        this.numeroDeVuelo = numeroDeVuelo;
        this.fechaVuelo = fecha;
        this.horaSalida = horaSalida;
        this.avion = avion;
    }

    public Long getId() {
        return id;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public Date getFecha() {
        return fechaVuelo;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setNumeroDeVuelo(String numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public void setFecha(Date fecha) {
        this.fechaVuelo = fecha;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

}
