package com.example.pia.Entity;

import javax.persistence.*;

@Entity
@Table(name = "citas")
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column()
    private String nombre;

    @Column()
    private String fecha;

    @Column()
    private String doctor;

    @Column()
    private Integer consultorio;

    @Column(unique = true)
    private Integer expediente;

    @Column()
    private String padecimientos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Integer consultorio) {
        this.consultorio = consultorio;
    }

    public Integer getExpediente() {
        return expediente;
    }

    public void setExpediente(Integer expediente) {
        this.expediente = expediente;
    }

    public String getPadecimientos() {
        return padecimientos;
    }

    public void setPadecimientos(String padecimientos) {
        this.padecimientos = padecimientos;
    }
}
