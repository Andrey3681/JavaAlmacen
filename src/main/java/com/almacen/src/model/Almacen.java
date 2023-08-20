package com.almacen.src.model;

import java.util.List;
import java.util.stream.Collectors;

public class Almacen {
    List<Persona> clientes;
    List<Producto> productos;
    List<Ventas> ventas;

    public Almacen() {
    }

    public List<Persona> getClientes() {
        return clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void  agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void agregarPersona(Persona persona){
        clientes.add(persona);
    }



    public void eleminarPersona(Persona persona){
        if(persona instanceof PersonaJuridica){

        }
        else {
            clientes.stream().filter(persona1 -> persona1.getDocumento().equals(persona.getDocumento()))
        }

    }
}
