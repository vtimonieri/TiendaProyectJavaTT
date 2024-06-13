package com.EDP.TiendaProyectJavaTT.persistencia.entity;

import com.EDP.TiendaProyectJavaTT.persistencia.crud.ComprasCrudRepository;



import java.util.List;

public class ComprasRepository {

    private ComprasCrudRepository comprasCrudRepository;

    public List<Compras> GetAll() {
        return (List<Compras>) comprasCrudRepository.findAll();
    }

    public void deleteCompra(int id) {
        comprasCrudRepository.deleteById(id);
    }

    public void findById(int id) {
        comprasCrudRepository.findById(id);

    }
}