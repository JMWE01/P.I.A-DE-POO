package com.example.pia.Entity;

import javax.persistence.*;


@Entity
@Table(name = "doctores")
public class Doctors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column()
    private String nombre;

    @Column()
    private String especialidad;

    @Column(unique = true)
    private Integer consultorio;

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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Integer consultorio) {
        this.consultorio = consultorio;
    }
}
