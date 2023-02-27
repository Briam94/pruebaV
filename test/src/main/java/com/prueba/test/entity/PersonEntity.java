package com.prueba.test.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="personas", schema = "public")
public class PersonEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="identificador")
    private long identificador;

    @Column(name="apellidos")
    private String apellidos;

    @Column(name="email")
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_creacion")
    private Date fechaCreacion;


    @Column(name="nombres")
    private String nombres;

    @Column(name="numero_identificacion")
    private String numeroIdentificacion;

    @Column(name="tipo_identificacion")
    private String tipoIdentificacion;

    public PersonEntity(Long identificador, String apellidos, String email, Date fechaCreacion, String nombres, String numeroIdentificacion, String tipoIdentificacion) {
        this.identificador = identificador;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaCreacion = fechaCreacion;
        this.nombres = nombres;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
}
