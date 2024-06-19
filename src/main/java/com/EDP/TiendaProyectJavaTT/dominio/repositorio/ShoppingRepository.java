package com.EDP.TiendaProyectJavaTT.dominio.repositorio;

import com.EDP.TiendaProyectJavaTT.persistencia.entity.Compras;



import java.util.List;

public interface ShoppingRepository {


    List<Compras> GetAll() ;

    void deleteShopping(int shoppingId);

    void findById(int shoppingId);
    }
