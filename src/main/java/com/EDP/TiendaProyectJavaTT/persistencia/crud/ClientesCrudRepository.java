package com.EDP.TiendaProyectJavaTT.persistencia.crud;

import com.EDP.TiendaProyectJavaTT.persistencia.entity.Clientes;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.ClientesRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.jar.Attributes;

public interface ClientesCrudRepository extends CrudRepository<Clientes, String> {

    List<Clientes> findByname(String name);

    Clientes createcliente();
    }

