package com.EDP.TiendaProyectJavaTT.persistencia.Mapper;



import com.EDP.TiendaProyectJavaTT.dominio.dto.Shopping;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Compras;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShoppingMapper {
    @Mappings({
            @Mapping(source ="id_compra", target = "shoppingId"),
            @Mapping(source ="fecha", target = "date"),
            @Mapping(source ="medio_pago", target = "payment"),
            @Mapping(source ="comentario", target = "comment"),
            @Mapping(source ="estado", target = "state"),

    })
    Shopping toShopping(Compras compras);
    List<Compras> toShopping(List<Compras> compras);

    @InheritInverseConfiguration
    Compras toCompras(Shopping shopping);

}
