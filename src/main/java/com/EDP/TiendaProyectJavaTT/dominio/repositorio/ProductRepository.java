package com.EDP.TiendaProyectJavaTT.dominio.repositorio;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Product;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Productos;

import java.util.List;

public interface ProductRepository  {
    List<Product> GetAll() ;

    void deleteById(int id);

    Product save(Product product);

    List <Product> FindByCategory(int categoryId);
}
