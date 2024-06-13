package com.EDP.TiendaProyectJavaTT.dominio.repositorio;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Customer;


import java.util.List;

public interface CustomerRepository {


    List<Customer> GetAll();

    public void findById(String id);

    List<Customer> findByName(String name);

    public Customer createcliente(Customer customer);


}
