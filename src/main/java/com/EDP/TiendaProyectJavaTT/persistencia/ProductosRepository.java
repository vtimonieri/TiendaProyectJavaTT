package com.EDP.TiendaProyectJavaTT.persistencia;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Product;
import com.EDP.TiendaProyectJavaTT.dominio.repositorio.ProductRepository;
import com.EDP.TiendaProyectJavaTT.persistencia.Mapper.ProductMapper;
import com.EDP.TiendaProyectJavaTT.persistencia.crud.ProductosCrudRepository;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository

public class ProductosRepository implements ProductRepository {
    private ProductosCrudRepository productosCrudRepository;
    private ProductMapper productMapper;

    @Autowired
    public ProductosRepository(ProductosCrudRepository productosCrudRepository, ProductMapper productMapper) {
        this.productosCrudRepository = productosCrudRepository;
        this.productMapper = productMapper;
    }

    public ProductosCrudRepository getProductosCrudRepository() {
        return productosCrudRepository;
    }

    public void setProductosCrudRepository(ProductosCrudRepository productosCrudRepository) {
        this.productosCrudRepository = productosCrudRepository;
    }

    public ProductMapper getProductMapper() {
        return productMapper;
    }

    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public void FindbyCategory(int CategoryId) {
        productosCrudRepository.findById(CategoryId);
    }


    List<Productos> findByStockLessThanAndEstado(int stock, boolean state) {
        return productosCrudRepository.findByCantidadStockLessThanAndEstado(stock, state);
    }

    @Override
    public List<Product> GetAll() {
        List<Productos> productos = (List<Productos>) getProductosCrudRepository().findAll();
        return productMapper.toProduct(productos);

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public List<Product> FindByCategory(int categoryId) {
        List<Productos> productos = (List<Productos>) getProductosCrudRepository().findIdCategoria(categoryId);
        return productMapper.toProduct(productos);


    }
}















