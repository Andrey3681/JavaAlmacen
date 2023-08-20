package com.almacen.src.model;

import java.time.LocalDate;

public class PersonaNatural extends Persona{
    private String email;
    private LocalDate fechaNacimiento;

    public PersonaNatural(String nombre, String apellido, String documento, String direccion, String telefono, TipoPersona tipoPersona,String email, LocalDate fechaNacimiento) {
        super(nombre, apellido, documento, direccion, telefono, tipoPersona);
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate localDate) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
