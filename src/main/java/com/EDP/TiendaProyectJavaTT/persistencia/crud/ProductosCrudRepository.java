package com.EDP.TiendaProyectJavaTT.persistencia.crud;

import com.EDP.TiendaProyectJavaTT.persistencia.entity.Productos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductosCrudRepository extends CrudRepository<Productos, Integer> {
    Productos findIdCategoria(int id);
   List<Productos> findByCantidadStockLessThanAndEstado(int stock, boolean state);
}
