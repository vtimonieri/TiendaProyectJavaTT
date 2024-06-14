package com.EDP.TiendaProyectJavaTT.persistencia.Mapper;




import com.EDP.TiendaProyectJavaTT.dominio.dto.Product;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Productos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel ="spring", uses ={CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source ="id_producto", target = "productId"),
            @Mapping(source ="nombre", target = "name"),
            @Mapping(source ="id_cateogoria", target = "categoryId"),
            @Mapping(source ="precio_venta", target = "price"),
            @Mapping(source ="estado", target = "state"),

            })
    Product toProduct(Productos productos);
    List<Product> toProduct(List<Productos> productos);

  @InheritInverseConfiguration


  @Mappings({
          @Mapping(target ="stock", ignore = true),
          @Mapping(target ="codigo_barras", ignore = true)

  })

  Product toProduct(Product product);
    }





