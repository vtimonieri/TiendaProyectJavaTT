package com.EDP.TiendaProyectJavaTT.dominio.repositorio;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Category;
import com.EDP.TiendaProyectJavaTT.dominio.dto.Product;


import java.util.List;

public interface CategoryRepository {



    List<Category> GetAll();

    void FindByCategory(int categoryId);

}