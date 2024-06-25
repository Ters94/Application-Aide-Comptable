package com.poo.accountinghelper;

import java.time.LocalDate;

public class Facture {
      private int id;
    private Client client;
    private LocalDate date;
    private double montant;
    private String etatFacture;
    
    public Facture (LocalDate date, String etatFacture,double montant, Client client ){
      this.date = date;
      this.etatFacture = etatFacture;
      this.montant = montant;
      this.client = client;
    }
/*------------------------------------ */
/* Getters and setters */
/*---------------------------------------- */

public int getId() {
  return id;
}

public void setId(int id) {
  this.id = id;
}

public Client getClient() {
  return client;
}

public void setClient(Client client) {
  this.client = client;
}

public LocalDate getDate() {
  return date;
}

public void setDate(LocalDate date) {
  this.date = date;
}

public double getMontant() {
  return montant;
}

public void setMontant(double montant) {
  this.montant = montant;
}

public String getEtatFacture() {
  return etatFacture;
}

public void setEtatFacture(String etatFacture) {
  this.etatFacture = etatFacture;
}
}
