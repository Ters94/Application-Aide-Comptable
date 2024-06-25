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

}
