package com.poo.accountinghelper;

import java.util.Date;

public class Paiement {
      private int id;
    public int getId() {
        return id;
      }

      public Facture getFacture() {
        return facture;
      }

      public Date getDateTime() {
        return dateTime;
      }

      public double getMontant() {
        return montant;
      }

    private Facture facture;
    private Date dateTime;
    private double montant;

    public void enregistrerPaiement() {
      
    }

    public void genererRecu() {
    }

    public void genererAccuseReception() {
      
    }

    public void genererRappels() {
     
    }
}
