package com.EDP.TiendaProyectJavaTT.persistencia.entity;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Customer;
import com.EDP.TiendaProyectJavaTT.dominio.repositorio.CustomerRepository;
import com.EDP.TiendaProyectJavaTT.persistencia.Mapper.CustomerMapper;
import com.EDP.TiendaProyectJavaTT.persistencia.crud.ClientesCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class ClientesRepository implements CustomerRepository {
    private ClientesCrudRepository clientesCrudRepository;
    private CustomerMapper customerMapper;

    @Autowired
    public ClientesRepository(ClientesCrudRepository clientesCrudRepository, CustomerMapper customerMapper) {
        this.clientesCrudRepository = clientesCrudRepository;
        this.customerMapper = customerMapper;
    }

    public ClientesCrudRepository getClientesCrudRepository() {
        return clientesCrudRepository;
    }

    public void setClientesCrudRepository(ClientesCrudRepository clientesCrudRepository) {
        this.clientesCrudRepository = clientesCrudRepository;
    }

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

    @Override
    public List<Customer> findByName() {
        return List.of();
    }

    @Override
    public Customer createcliente(Customer customer) {
        return null;
    }
}

