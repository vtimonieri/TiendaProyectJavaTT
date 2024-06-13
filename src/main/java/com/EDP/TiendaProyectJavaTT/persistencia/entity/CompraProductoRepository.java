package com.EDP.TiendaProyectJavaTT.persistencia.entity;
import com.EDP.TiendaProyectJavaTT.persistencia.crud.CompraProductoCrudRepository;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.CompraProducto;
import com.EDP.TiendaProyectJavaTT.persistencia.entity.Productos;
import java.util.List;

public class CompraProductoRepository {

    private CompraProductoCrudRepository compraProductoCrudRepository;
    public List<CompraProducto> GetAll() {
        return (List<CompraProducto>) compraProductoCrudRepository.findAll();
    }

    public void FindById(int id){
       compraProductoCrudRepository.findById(id);
    }

}