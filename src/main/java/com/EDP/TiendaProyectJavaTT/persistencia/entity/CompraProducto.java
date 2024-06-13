package com.EDP.TiendaProyectJavaTT.persistencia.entity;
//mport jakarta.persistence.*;
import javax.persistence.*;

@Entity
@Table(name="COMPRAS_PRODUCTOS")

public class CompraProducto {
    @EmbeddedId
    int CompraProductoPk;
    int cantidad;
    Double total;
    Boolean  estado;


    @ManyToOne
    @JoinColumn(name="id_producto")
    private Productos producto;

    @ManyToOne
    @JoinColumn(name="id_compra")
    private Compras compra;

    public CompraProducto() {
    }

    public CompraProducto(int compraProductoPk, int cantidad, Double total, Boolean estado, Productos producto, Compras compra) {
        CompraProductoPk = compraProductoPk;
        this.cantidad = cantidad;
        this.total = total;
        this.estado = estado;
        this.producto = producto;
        this.compra = compra;
    }

    public int getCompraProductoPk() {
        return CompraProductoPk;
    }

    public void setCompraProductoPk(int compraProductoPk) {
        CompraProductoPk = compraProductoPk;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Compras getCompra() {
        return compra;
    }

    public void setCompra(Compras compra) {
        this.compra = compra;
    }
}
