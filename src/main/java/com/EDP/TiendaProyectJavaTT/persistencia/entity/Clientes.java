package com.EDP.TiendaProyectJavaTT.persistencia.entity;
import javax.persistence.*;
//import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;
@Entity
@Table(name="CLIENTES")
public class Clientes {
    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private int celular;
    private String direccion;
    @Column(name="correo_electronico")
    private String email;



    @OneToMany(mappedBy="cliente")
    private List<Compras> compra;

    public Clientes() {
    }

    public Clientes(String id, String nombre, String apellidos, int celular, String direccion, String email, List<Compras> compra) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.direccion = direccion;
        this.email = email;
        this.compra = compra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Compras> getCompra() {
        return compra;
    }

    public void setCompra(List<Compras> compra) {
        this.compra = compra;
    }
}



