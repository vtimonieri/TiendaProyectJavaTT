package com.EDP.TiendaProyectJavaTT.dominio.repositorio;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Category;


import java.util.List;

public interface CategoryRepository {



    List<Category> GetAll();

    public void FindByCategory(int id);

}