package com.estiloycorte.repository;
import com.estiloycorte.model.Cliente; import java.util.*;
public class InMemoryClienteRepository implements ClienteRepository {
 private final Map<String,Cliente> datos=new HashMap<>();
 public Optional<Cliente> buscarPorTelefono(String telefono){return Optional.ofNullable(datos.get(telefono));}
 public Cliente guardar(Cliente cliente){datos.put(cliente.getTelefono(),cliente);return cliente;}
}