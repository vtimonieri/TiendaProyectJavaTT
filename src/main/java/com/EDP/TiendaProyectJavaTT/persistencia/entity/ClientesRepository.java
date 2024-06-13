package com.EDP.TiendaProyectJavaTT.persistencia.entity;

import com.EDP.TiendaProyectJavaTT.persistencia.crud.ClientesCrudRepository;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Clientes;



import java.util.List;

public class ClientesRepository {
    private ClientesCrudRepository clientesCrudRepository;
    public List<Clientes> GetAll(){
        return (List<Clientes>) clientesCrudRepository.findAll();

    }

    public void findById(String id) {
        clientesCrudRepository.findById(id);
    }

    List<Clientes> findByName(String name){
    return clientesCrudRepository.findByname(name);
}

   public Clientes createcliente(Clientes Cliente){
        return clientesCrudRepository.save(Cliente);
   }

    }
