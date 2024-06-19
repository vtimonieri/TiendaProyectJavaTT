package com.EDP.TiendaProyectJavaTT.dominio;

import com.EDP.TiendaProyectJavaTT.dominio.dto.Product;
import com.EDP.TiendaProyectJavaTT.dominio.repositorio.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    List<Product> GetAll(){
    return productRepository.GetAll();
    }

    List<Product> FindByCategory(int categoryId){
        return productRepository.FindByCategory(categoryId);

    }

    void deleteById(int productId){

    }


}

