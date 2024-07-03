package com.poo.accountinghelper;

import java.util.Date;

public class Email {
    private int id;
    private Client destinataire;
    public int getId() {
        return id;
    }

    public Client getDestinataire() {
        return destinataire;
    }

    public Date getDatetime() {
        return datetime;
    }

    public String getSujet() {
        return sujet;
    }

    public String getCorps() {
        return corps;
    }

    public Facture getFacture() {
        return facture;
    }

    private Date datetime;
    private String sujet;
    private String corps;
    private Facture facture;

    public void envoyerFacture() {
      
    } 
}
