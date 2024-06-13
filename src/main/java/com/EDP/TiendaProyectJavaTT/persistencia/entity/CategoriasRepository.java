package com.EDP.TiendaProyectJavaTT.persistencia.entity;

import com.EDP.TiendaProyectJavaTT.persistencia.crud.CategoriasCrudRepository;



import java.util.List;

public class CategoriasRepository {

    private CategoriasCrudRepository categoriasCrudRepository;
    public List<Categorias> GetAll() {
        return (List<Categorias>) categoriasCrudRepository.findAll();
    }

   public void FindByCategory(int id){
        categoriasCrudRepository.findById(id);
   }
}
