package com.EDP.TiendaProyectJavaTT.dominio.repositorio;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> GetAll();

    public void deleteProduct();

    public void FindById(int id);

    public void FindbyCategory(int CategoryId);
}
