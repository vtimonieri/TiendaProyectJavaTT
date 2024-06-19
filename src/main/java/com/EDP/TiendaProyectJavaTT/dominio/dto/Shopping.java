package com.EDP.TiendaProyectJavaTT.dominio.dto;

import java.util.Date;

public class Shopping  {
    private int shoppingId;
    private Date date;
    private Character payment;
    private String comment;
    private Character state;

    public int getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(int shoppingId) {
        this.shoppingId = shoppingId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Character getPayment() {
        return payment;
    }

    public void setPayment(Character payment) {
        this.payment = payment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;
    }
}
