package com.EDP.TiendaProyectJavaTT.persistencia.entity;
import com.fasterxml.jackson.annotation.JsonAnyGetter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;




//mport jakarta.persistence.ManyToOne;
@Entity
@Table(name="PRODUCTOS")
public class Productos  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    int id_producto ;
    String nombre;
    int id_categoria;
    String codigo_barras;
    Double precio_venta;
    int cantidad_stock;
    boolean estado;



    @OneToMany(mappedBy="producto")
    private List<CompraProducto> compraproducto;


    @ManyToOne
    @JoinColumn(name="id_categoria", insertable = false, updatable = false)
    private Categorias categoria;

    public Productos() {
    }

    public Productos(int id_producto, String nombre, int id_categoria, String codigo_barras, Double precio_venta, int cantidad_stock, boolean estado,  List<CompraProducto> compraproducto, Categorias categoria) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.id_categoria = id_categoria;
        this.codigo_barras = codigo_barras;
        this.precio_venta = precio_venta;
        this.cantidad_stock = cantidad_stock;
        this.estado = estado;
        this.compraproducto = compraproducto;
        this.categoria = categoria;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getCantidad_stock() {
        return cantidad_stock;
    }

    public void setCantidad_stock(int cantidad_stock) {
        this.cantidad_stock = cantidad_stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }





    public List<CompraProducto> getCompraproducto() {
        return compraproducto;
    }

    public void setCompraproducto(List<CompraProducto> compraproducto) {
        this.compraproducto = compraproducto;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }


}







