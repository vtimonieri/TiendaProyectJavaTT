package com.EDP.TiendaProyectJavaTT.persistencia.entity;
import java.util.ArrayList;
import java.util.Date;
//import jakarta.persistence.*;
import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
@Table(name="COMPRAS")
public class Compras{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
   int id_compra=0;
   Date fecha;
   Character medio_pago;
   String comentario;
   Character estado;

    @OneToMany(mappedBy="Compra")
    private List<CompraProducto> compraproducto;
     @ManyToOne
     @JoinColumn(name="id_cliente", insertable = false, updatable = false)
     private Clientes cliente;

    public Compras() {
    }

    public Compras(int id_compra, Date fecha, Character medio_pago, String comentario, Character estado, List<CompraProducto> compraproducto, Clientes cliente) {
        this.id_compra = id_compra;
        this.fecha = fecha;
        this.medio_pago = medio_pago;
        this.comentario = comentario;
        this.estado = estado;
        this.compraproducto = compraproducto;
        this.cliente = cliente;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(Character medio_pago) {
        this.medio_pago = medio_pago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public List<CompraProducto> getCompraproducto() {
        return compraproducto;
    }

    public void setCompraproducto(List<CompraProducto> compraproducto) {
        this.compraproducto = compraproducto;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
}
