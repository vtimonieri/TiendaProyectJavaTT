package com.EDP.TiendaProyectJavaTT.persistencia.Mapper;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Product;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Clientes;
import com.EDP.TiendaProyectJavaTT.dominio.dto.Customer;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Productos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;
import javax.persistence.Column;



@Mapper(componentModel = "spring")
public interface CustomerMapper {

@Mappings({
    @Mapping(source="id", target="customerId"),
    @Mapping(source="nombre", target="name"),
    @Mapping(source="apellidos", target="lastname"),
    @Mapping(source="direccion", target="adress"),
    @Mapping(source="email", target="email"),

})
  Customer toCustomer(Clientes clientes);
 List<Customer> tocustomer(List<Customer> customer);



@InheritInverseConfiguration


@Mappings({
        @Mapping(target ="celular", ignore = true)


})

Clientes toClientes(Customer customer);

}
