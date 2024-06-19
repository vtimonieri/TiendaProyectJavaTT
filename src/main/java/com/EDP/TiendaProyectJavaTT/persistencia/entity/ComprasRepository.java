package com.EDP.TiendaProyectJavaTT.persistencia.entity;

import com.EDP.TiendaProyectJavaTT.dominio.repositorio.ShoppingRepository;
import com.EDP.TiendaProyectJavaTT.persistencia.Mapper.ShoppingMapper;
import com.EDP.TiendaProyectJavaTT.persistencia.crud.ComprasCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class ComprasRepository implements ShoppingRepository {

    private ComprasCrudRepository comprasCrudRepository;
    private ShoppingMapper shoppingMapper;

    @Autowired
    public ComprasRepository(ComprasCrudRepository comprasCrudRepository, ShoppingMapper shoppingMapper) {
        this.comprasCrudRepository = comprasCrudRepository;
        this.shoppingMapper = shoppingMapper;
    }

    public ComprasCrudRepository getComprasCrudRepository() {
        return comprasCrudRepository;
    }

    public void setComprasCrudRepository(ComprasCrudRepository comprasCrudRepository) {
        this.comprasCrudRepository = comprasCrudRepository;
    }

    public ShoppingMapper getShoppingMapper() {
        return shoppingMapper;
    }

    public void setShoppingMapper(ShoppingMapper shoppingMapper) {
        this.shoppingMapper = shoppingMapper;
    }

   public List<Compras> GetAll() {
        return (List<Compras>) comprasCrudRepository.findAll();
    }

    public void deleteCompra(int id) {
        comprasCrudRepository.deleteById(id);
    }

    public void findById(int id) {
        comprasCrudRepository.findById(id);

    }



    @Override
    public void deleteShopping(int shoppingId) {
        comprasCrudRepository.deleteById(shoppingId);

    }
}