package com.EDP.TiendaProyectJavaTT.dominio.repositorio;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Shopping;


import java.util.List;

public interface ShoppingRepository {


   List<Shopping> GetAll();

    public void deleteShopping(int id);

    public void findById(int id);
    }
