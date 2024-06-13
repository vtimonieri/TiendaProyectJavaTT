package com.EDP.TiendaProyectJavaTT.persistencia.entity;
//mport jakarta.persistence.*;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="CATEGORIAS")
public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    int  id_categoria;
    String descripcion;
    Boolean estado;
    @OneToMany(mappedBy="categoria")
    private List<Productos> producto;

    public Categorias() {
    }

    public Categorias(int id_categoria, String descripcion, Boolean estado, List<Productos> producto) {
        this.id_categoria = id_categoria;
        this.descripcion = descripcion;
        this.estado = estado;
        this.producto = producto;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Productos> getProducto() {
        return producto;
    }

    public void setProducto(List<Productos> producto) {
        this.producto = producto;
    }

    public void metodo(){
        //metodo vacio
    }


}
