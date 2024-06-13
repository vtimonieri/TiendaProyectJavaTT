package com.EDP.TiendaProyectJavaTT.persistencia.Mapper;



import com.EDP.TiendaProyectJavaTT.dominio.dto.Category;
import com.EDP.TiendaProyectJavaTT.dominio.dto.Product;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Categorias;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Productos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source ="id_categoria", target = "categoryId"),
            @Mapping(source ="descripcion", target = "description"),
            @Mapping(source ="estado", target = "state")

    })
    Category toCategory(Categorias categoria);
    List<Category toCategory> toProduct(List<Categorias> categorias);
    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "cantidad", ignore = true),
            @Mapping(target = "codigo_barra", ignore = true),


    })
    Productos productos(Product product);
}



}
