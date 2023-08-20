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

    //METODO PARA OBTENER UN PRODUCTO
    public Producto obtenerProducto(int codigo){
        return productos.stream().filter(producto -> producto.getCodigo()==codigo).findFirst().get();
    }

    //METODO PARA OBTENER UNA PERSONA

    public Persona obtenerPersona(String documento){
        return clientes.stream().filter(persona -> persona.getDocumento().equals(documento)).findFirst().get();
    }

    //METODO PARA ELEMINAR PERSONA
    public void eleminarPersona(Persona persona){
        clientes.remove(persona);
    }

    //METODO PARA ELIMINAR UN PRODUCTO
    public void eleminarProducto(Producto producto){
        productos.remove(producto);
    }

    //METODO PARA AGREGAR PRODUCTO
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    //METODO PARA AGREGAR PERSONA
    public void agregarPersona(Persona persona) {
        clientes.add(persona);
    }
}