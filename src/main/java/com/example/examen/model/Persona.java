package com.example.examen.model;

public class Persona {
    private Long idpersona;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(Long idpersona, String nombre, int edad) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
