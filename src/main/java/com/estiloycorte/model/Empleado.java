package com.estiloycorte.model;

public class Empleado {
    private final String id, nombre;
    private final boolean activo;

    public Empleado(String id, String nombre, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActivo() {
        return activo;
    }
}