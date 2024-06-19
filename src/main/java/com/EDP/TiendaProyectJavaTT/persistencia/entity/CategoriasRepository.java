package com.EDP.TiendaProyectJavaTT.persistencia.entity;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Category;
import com.EDP.TiendaProyectJavaTT.dominio.repositorio.CategoryRepository;
import com.EDP.TiendaProyectJavaTT.persistencia.Mapper.CategoryMapper;
import com.EDP.TiendaProyectJavaTT.persistencia.crud.CategoriasCrudRepository;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Categorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

public class CategoriasRepository implements CategoryRepository {

    private CategoriasCrudRepository categoriasCrudRepository;
    private CategoryMapper categoryMapper;

    @Autowired
    public CategoriasRepository(CategoriasCrudRepository categoriasCrudRepository, CategoryMapper categoryMapper) {
        this.categoriasCrudRepository = categoriasCrudRepository;
        this.categoryMapper = categoryMapper;
    }

    public CategoriasCrudRepository getCategoriasCrudRepository() {
        return categoriasCrudRepository;
    }

    public void setCategoriasCrudRepository(CategoriasCrudRepository categoriasCrudRepository) {
        this.categoriasCrudRepository = categoriasCrudRepository;
    }

    public CategoryMapper getCategoryMapper() {
        return categoryMapper;
    }

    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<Category> GetAll() {
        List<Categorias> categorias = (List<Categorias>) getCategoriasCrudRepository().findAll();
        return categoryMapper.toCategory(categorias);

    }

    @Override
    public void FindByCategory(int categoryId) {

    }
}






