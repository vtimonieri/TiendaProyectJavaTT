package com.EDP.TiendaProyectJavaTT.persistencia.entity;
import com.EDP.TiendaProyectJavaTT.dominio.dto.ShoppingProduct;
import com.EDP.TiendaProyectJavaTT.dominio.repositorio.ShoppingProductRepository;
import com.EDP.TiendaProyectJavaTT.persistencia.crud.CompraProductoCrudRepository;
import java.util.List;
import com.EDP.TiendaProyectJavaTT.persistencia.Mapper.ShoppingProductMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CompraProductoRepository implements ShoppingProductRepository {

    private CompraProductoCrudRepository compraProductoCrudRepository;
    private ShoppingProductMapper shoppingProductMapper;
    private ShoppingProductRepository shoppingProductRepository;

    @Autowired
    public CompraProductoRepository(CompraProductoCrudRepository compraProductoCrudRepository, ShoppingProductMapper shoppingProductMapper) {
        this.compraProductoCrudRepository = compraProductoCrudRepository;
        this.shoppingProductMapper = shoppingProductMapper;
    }

    public CompraProductoCrudRepository getCompraProductoCrudRepository() {
        return compraProductoCrudRepository;
    }

    public void setCompraProductoCrudRepository(CompraProductoCrudRepository compraProductoCrudRepository) {
        this.compraProductoCrudRepository = compraProductoCrudRepository;
    }

    public ShoppingProductMapper getShoppingProductMapper() {
        return shoppingProductMapper;
    }

    public void setShoppingProductMapper(ShoppingProductMapper shoppingProductMapper) {
        this.shoppingProductMapper = shoppingProductMapper;
    }

    public List<CompraProducto> GetListAll() {

        return (List<CompraProducto>) compraProductoCrudRepository.findAll();
    }


    @Override
    public List<ShoppingProduct> GetAll() {

        return (List<ShoppingProduct>) shoppingProductRepository.GetAll();
    }

    public void FindById(int id){
       compraProductoCrudRepository.findById(id);
    }


}