package com.estiloycorte.service;
import com.estiloycorte.model.Cliente; import com.estiloycorte.repository.InMemoryClienteRepository; import org.junit.jupiter.api.*; import static org.junit.jupiter.api.Assertions.*;
class ClienteServiceTest {
 private ClienteService service;
 @BeforeEach void setup(){service=new ClienteService(new InMemoryClienteRepository());}
 @Test void registraClienteValido(){Cliente c=new Cliente("Ana","3001234567","ana@example.com");assertSame(c,service.registrarCliente(c));assertTrue(service.existePorTelefono(c.getTelefono()));}
 @Test void rechazaDatoObligatorioVacio(){assertThrows(IllegalArgumentException.class,()->service.registrarCliente(new Cliente("","3001234567","ana@example.com")));}
 @Test void rechazaCorreoInvalido(){assertThrows(IllegalArgumentException.class,()->service.registrarCliente(new Cliente("Ana","3001234567","correo")));}
 @Test void rechazaTelefonoDuplicado(){service.registrarCliente(new Cliente("Ana","3001234567","ana@example.com"));assertThrows(IllegalArgumentException.class,()->service.registrarCliente(new Cliente("Ana M","3001234567","ana2@example.com")));}
}