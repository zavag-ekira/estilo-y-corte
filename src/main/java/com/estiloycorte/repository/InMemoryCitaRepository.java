package com.estiloycorte.repository;
import com.estiloycorte.model.Cita; import java.time.LocalDate; import java.util.*;
public class InMemoryCitaRepository implements CitaRepository {
 private final List<Cita> datos=new ArrayList<>();
 public List<Cita> buscarPorEmpleadoYFecha(String empleadoId,LocalDate fecha){return datos.stream().filter(c->c.getEmpleado().getId().equals(empleadoId)).filter(c->c.getFecha().equals(fecha)).toList();}
 public Cita guardar(Cita cita){datos.add(cita);return cita;}
}