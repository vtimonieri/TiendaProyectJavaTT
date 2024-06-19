package com.EDP.TiendaProyectJavaTT.persistencia.Mapper;


import com.EDP.TiendaProyectJavaTT.dominio.dto.ShoppingProduct;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.CompraProducto;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Compras;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Productos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShoppingProductMapper {

    @Mappings({
            @Mapping(source ="compraProductoPk", target = "shoppingId"),
            @Mapping(source ="cantidad", target = "stock"),
            @Mapping(source ="total", target = "payment"),
            @Mapping(source ="estado", target = "state"),

    })
    ShoppingProduct toShoppingProduct(CompraProducto compraproducto);
    List<Compras> toCompras(List<Compras> compras);
    List<Productos> toProductos(List<Productos> producto);
    @InheritInverseConfiguration
    CompraProducto toCompraProducto(ShoppingProduct shoppingproduct);

}