package com.EDP.TiendaProyectJavaTT.dominio.repositorio;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Customer;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Clientes;


import java.util.List;

public interface CustomerRepository {


      List<Clientes> GetAll();

    public void findById(String id);

    List<Customer> findByName();

    public Customer createcliente(Customer customer);


}
