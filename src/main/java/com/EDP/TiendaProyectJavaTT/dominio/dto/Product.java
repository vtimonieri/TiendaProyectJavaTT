package com.EDP.TiendaProyectJavaTT.dominio.dto;

public class Product {
 private  int productId;
 private String name;
 private int categoryId;
 private double price;
 private int stock;
 private String codigo_barra;
 private boolean state;
 private Category category;

 public int getProductId() {
  return productId;
 }

 public void setProductId(int productId) {
  this.productId = productId;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getCategoryId() {
  return categoryId;
 }

 public void setCategoryId(int categoryId) {
  this.categoryId = categoryId;
 }

 public double getPrice() {
  return price;
 }

 public void setPrice(double price) {
  this.price = price;
 }

 public int getStock() {
  return stock;
 }

 public void setStock(int stock) {
  this.stock = stock;
 }

 public String getCodigo_barra() {
  return codigo_barra;
 }

 public void setCodigo_barra(String codigo_barra) {
  this.codigo_barra = codigo_barra;
 }

 public boolean isState() {
  return state;
 }

 public void setState(boolean state) {
  this.state = state;
 }

 public Category getCategory() {
  return category;
 }

 public void setCategory(Category category) {
  this.category = category;
 }
}
