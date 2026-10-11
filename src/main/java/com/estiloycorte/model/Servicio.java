package com.estiloycorte.model;
import java.math.BigDecimal;
public class Servicio {
 private final String nombre; private final int duracionMinutos; private final BigDecimal precio; private final boolean activo;
 public Servicio(String nombre,int duracionMinutos,BigDecimal precio,boolean activo){this.nombre=nombre;this.duracionMinutos=duracionMinutos;this.precio=precio;this.activo=activo;}
 public String getNombre(){return nombre;} public int getDuracionMinutos(){return duracionMinutos;} public BigDecimal getPrecio(){return precio;} public boolean isActivo(){return activo;}
 public boolean esValido(){return nombre!=null&&!nombre.isBlank()&&duracionMinutos>0&&precio!=null&&precio.signum()>=0&&activo;}
}