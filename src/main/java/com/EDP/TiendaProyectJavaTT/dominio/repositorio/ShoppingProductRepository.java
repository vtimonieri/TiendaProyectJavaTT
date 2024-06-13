package com.EDP.TiendaProyectJavaTT.dominio.repositorio;

import com.EDP.TiendaProyectJavaTT.dominio.dto.ShoppingProduct;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.CompraProducto;

import java.util.List;

public interface ShoppingProductRepository {

    List<ShoppingProduct> GetAll();

    public void FindById(int id);

}
