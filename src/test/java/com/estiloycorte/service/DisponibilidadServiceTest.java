package com.estiloycorte.service;
import com.estiloycorte.model.*; import com.estiloycorte.repository.InMemoryCitaRepository; import org.junit.jupiter.api.*; import java.math.BigDecimal; import java.time.*; import static org.junit.jupiter.api.Assertions.*;
class DisponibilidadServiceTest {
 private InMemoryCitaRepository repo; private DisponibilidadService service; private Empleado empleado; private Cliente cliente; private Servicio servicio; private final LocalDate fecha=LocalDate.of(2026,10,10);
 @BeforeEach void setup(){repo=new InMemoryCitaRepository();service=new DisponibilidadService(repo);empleado=new Empleado("E1","Luis",true);cliente=new Cliente("Ana","3001112222","ana@example.com");servicio=new Servicio("Corte",30,new BigDecimal("25000"),true);}
 @Test void libreSiNoHayCitas(){assertTrue(service.consultarDisponibilidad(empleado,fecha,LocalTime.of(10,0),LocalTime.of(10,30)));}
 @Test void ocupadoSiHayCruce(){repo.guardar(new Cita("C1",cliente,servicio,empleado,fecha,LocalTime.of(10,0),LocalTime.of(10,30),false));assertFalse(service.consultarDisponibilidad(empleado,fecha,LocalTime.of(10,15),LocalTime.of(10,45)));}
 @Test void permiteHorariosConsecutivos(){repo.guardar(new Cita("C1",cliente,servicio,empleado,fecha,LocalTime.of(10,0),LocalTime.of(10,30),false));assertTrue(service.consultarDisponibilidad(empleado,fecha,LocalTime.of(10,30),LocalTime.of(11,0)));}
 @Test void rechazaIntervaloInvertido(){assertThrows(IllegalArgumentException.class,()->service.consultarDisponibilidad(empleado,fecha,LocalTime.of(11,0),LocalTime.of(10,0)));}
 @Test void ignoraCitaCancelada(){repo.guardar(new Cita("C1",cliente,servicio,empleado,fecha,LocalTime.of(10,0),LocalTime.of(10,30),true));assertTrue(service.consultarDisponibilidad(empleado,fecha,LocalTime.of(10,15),LocalTime.of(10,45)));}
}