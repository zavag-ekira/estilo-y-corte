package com.estiloycorte.service;
import com.estiloycorte.model.*; import com.estiloycorte.repository.CitaRepository; import java.time.*; import java.util.List;
public class DisponibilidadService {
 private final CitaRepository repo; public DisponibilidadService(CitaRepository repo){this.repo=repo;}
 public boolean consultarDisponibilidad(Empleado e,LocalDate fecha,LocalTime inicio,LocalTime fin){
  if(e==null||!e.isActivo()||fecha==null||inicio==null||fin==null||!inicio.isBefore(fin))throw new IllegalArgumentException("Datos de consulta inválidos.");
  List<Cita> citas=repo.buscarPorEmpleadoYFecha(e.getId(),fecha);
  for(Cita c:citas){if(!c.isCancelada()&&inicio.isBefore(c.getFin())&&fin.isAfter(c.getInicio()))return false;}
  return true;
 }
}