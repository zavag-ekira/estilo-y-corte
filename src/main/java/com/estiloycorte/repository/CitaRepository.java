package com.estiloycorte.repository;

import com.estiloycorte.model.Cita;
import java.time.LocalDate;
import java.util.List;

public interface CitaRepository {
    List<Cita> buscarPorEmpleadoYFecha(String empleadoId, LocalDate fecha);

    Cita guardar(Cita cita);
}