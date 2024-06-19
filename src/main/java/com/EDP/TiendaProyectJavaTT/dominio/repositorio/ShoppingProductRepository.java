package com.EDP.TiendaProyectJavaTT.dominio.repositorio;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Product;
import com.EDP.TiendaProyectJavaTT.dominio.dto.ShoppingProduct;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.CompraProducto;

import java.util.List;

public interface ShoppingProductRepository {

    List<ShoppingProduct> GetAll() ;// ShoppingProduct GetAll();

    void FindById(int shoppingproductPk);

}
