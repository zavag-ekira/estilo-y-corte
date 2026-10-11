package com.estiloycorte.service;
import com.estiloycorte.model.Cliente; import com.estiloycorte.repository.ClienteRepository;
public class ClienteService {
 private final ClienteRepository repo; public ClienteService(ClienteRepository repo){this.repo=repo;}
 public Cliente registrarCliente(Cliente c){if(c==null||!c.tieneDatosValidos())throw new IllegalArgumentException("Datos del cliente inválidos.");if(repo.buscarPorTelefono(c.getTelefono()).isPresent())throw new IllegalArgumentException("Teléfono duplicado.");return repo.guardar(c);}
 public boolean existePorTelefono(String t){return t!=null&&repo.buscarPorTelefono(t).isPresent();}
}