package com.EDP.TiendaProyectJavaTT.dominio.dto;

public class Customer {
     private String customerId;
     private String name;
     private String lastname;
     private String telephone;
     private String adress;
     private String email;
     private Shopping shopping;

     public String getCustomerId() {
          return customerId;
     }

     public void setCustomerId(String customerId) {
          this.customerId = customerId;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getLastname() {
          return lastname;
     }

     public void setLastname(String lastname) {
          this.lastname = lastname;
     }

     public String getTelephone() {
          return telephone;
     }

     public void setTelephone(String telephone) {
          this.telephone = telephone;
     }

     public String getAdress() {
          return adress;
     }

     public void setAdress(String adress) {
          this.adress = adress;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public Shopping getShopping() {
          return shopping;
     }

     public void setShopping(Shopping shopping) {
          this.shopping = shopping;
     }
}
