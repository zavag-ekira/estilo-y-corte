package com.estiloycorte.service;

import com.estiloycorte.model.Cita;
import com.estiloycorte.repository.CitaRepository;

public class CitaService {
    private final ClienteService clientes;
    private final DisponibilidadService disponibilidad;
    private final CitaRepository citas;

    public CitaService(ClienteService clientes, DisponibilidadService disponibilidad, CitaRepository citas) {
        this.clientes = clientes;
        this.disponibilidad = disponibilidad;
        this.citas = citas;
    }

    public Cita programarCita(Cita c) {
        if (c == null || !c.tieneDatosValidos()) {
            throw new IllegalArgumentException("Datos de la cita inválidos."); }
        if (!clientes.existePorTelefono(c.getCliente().getTelefono())) {
            throw new IllegalArgumentException("Cliente no registrado."); }
        if (!c.getServicio().esValido()) {
            throw new IllegalArgumentException("Servicio inactivo o inválido."); }
        if (!c.getEmpleado().isActivo()) {
            throw new IllegalArgumentException("Empleado inactivo."); }
        if (!disponibilidad.consultarDisponibilidad(c.getEmpleado(), c.getFecha(), c.getInicio(), c.getFin())) {
            throw new IllegalArgumentException("Horario ocupado."); }
        return citas.guardar(c);
    }
}