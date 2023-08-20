package com.almacen.src.model;

public class PersonaJuridica extends Persona{
    private String nit;

    public PersonaJuridica(String nombre, String apellido, String documento, String direccion, String telefono, TipoPersona tipoPersona,String nit) {
        super(nombre, apellido, documento, direccion, telefono, tipoPersona);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
