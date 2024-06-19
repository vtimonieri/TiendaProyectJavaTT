package com.EDP.TiendaProyectJavaTT.persistencia.Mapper;
import com.EDP.TiendaProyectJavaTT.dominio.dto.Product;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Productos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Categorias;
import com.EDP.TiendaProyectJavaTT.dominio.dto.Category;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "id_categoria", target = "categoryId"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "descripcion", target = "description"),

    })
    Category  toCategory(Categorias categorias);
    List<Category> toCategory(List<Categorias> categorias);

    @InheritInverseConfiguration
    @Mapping(target = "producto", ignore = true)
    Categorias toCategorias (Category category);
}
