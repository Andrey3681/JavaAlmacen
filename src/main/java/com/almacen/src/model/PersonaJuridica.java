package com.almacen.src.model;

public class PersonaJuridica extends Persona{
    private String nit;

    public PersonaJuridica(String nit) {
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
