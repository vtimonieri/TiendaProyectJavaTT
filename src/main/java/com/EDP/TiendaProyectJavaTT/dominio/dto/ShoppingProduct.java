package com.EDP.TiendaProyectJavaTT.dominio.dto;

public class ShoppingProduct {
    private int shoppingProductId;
    private int stock;
    private double total;
    private Boolean  state;

    public int getShoppingProductId() {
        return shoppingProductId;
    }

    public void setShoppingProductId(int shoppingProductId) {
        this.shoppingProductId = shoppingProductId;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
