package com.estiloycorte.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private final String id;
    private final Cliente cliente;
    private final Servicio servicio;
    private final Empleado empleado;
    private final LocalDate fecha;
    private final LocalTime inicio, fin;
    private final boolean cancelada;

    public Cita(String id, Cliente cliente, Servicio servicio, Empleado empleado, LocalDate fecha, LocalTime inicio,
            LocalTime fin, boolean cancelada) {
        this.id = id;
        this.cliente = cliente;
        this.servicio = servicio;
        this.empleado = empleado;
        this.fecha = fecha;
        this.inicio = inicio;
        this.fin = fin;
        this.cancelada = cancelada;
    }

    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public LocalTime getFin() {
        return fin;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public boolean tieneDatosValidos() {
        return id != null && !id.isBlank() && cliente != null && servicio != null && empleado != null && fecha != null
                && inicio != null && fin != null && inicio.isBefore(fin);
    }

    public boolean seSuperponeCon(Cita otra) {
        return !cancelada && !otra.cancelada && empleado.getId().equals(otra.empleado.getId())
                && fecha.equals(otra.fecha) && inicio.isBefore(otra.fin) && fin.isAfter(otra.inicio);
    }
}