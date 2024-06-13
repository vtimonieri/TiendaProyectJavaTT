package com.EDP.TiendaProyectJavaTT.persistencia;

import com.EDP.TiendaProyectJavaTT.persistencia.crud.ProductosCrudRepository;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Productos;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository

public class ProductosRepository {

    private ProductosCrudRepository productosCrudRepository;

    public List<Productos> GetAll() {
        return (List<Productos>) productosCrudRepository.findAll();

    }

    public void deleteProducto(int id) {
        productosCrudRepository.deleteById(id);
    }

    public void FindById(int id) {
        productosCrudRepository.findById(id);


    }

    public void FindbyCategory(int CategoryId){
        productosCrudRepository.findById(CategoryId);
    }



    List<Productos> findByStockLessThanAndEstado(int stock, boolean state){
        return productosCrudRepository.findByCantidadStockLessThanAndEstado(stock, state);
    }
}


