package com.estiloycorte.model;
public class Cliente {
 private final String nombre, telefono, correo;
 public Cliente(String nombre, String telefono, String correo) { this.nombre=nombre; this.telefono=telefono; this.correo=correo; }
 public String getNombre(){return nombre;} public String getTelefono(){return telefono;} public String getCorreo(){return correo;}
 public boolean tieneDatosValidos(){return nombre!=null&&!nombre.isBlank()&&telefono!=null&&!telefono.isBlank()&&correo!=null&&correo.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");}
}