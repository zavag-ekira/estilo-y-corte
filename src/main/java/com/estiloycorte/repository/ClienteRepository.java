package com.estiloycorte.repository;

import com.estiloycorte.model.Cliente;
import java.util.Optional;

public interface ClienteRepository {
    Optional<Cliente> buscarPorTelefono(String telefono);

    Cliente guardar(Cliente cliente);
}