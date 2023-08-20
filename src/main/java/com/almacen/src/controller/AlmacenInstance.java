package com.almacen.src.controller;

import com.almacen.src.model.Almacen;

public enum AlmacenInstance {

    INSTANCE;

    private  final Almacen almacen;

    AlmacenInstance() {
      almacen= new Almacen();
    }

    public Almacen getAlmacen() {
        return almacen;
    }
}
