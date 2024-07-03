package com.poo.accountinghelper;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double montant;
    private Date datePaiement;

    @ManyToOne
    private Facture facture;

    public Paiement(Facture facture, double montant) {
        this.facture = facture;
        this.montant = montant;
        this.datePaiement = new Date();
    }

    public void enregistrerPaiement() {
        facture.setEtatFacture(true);
        System.out.println("Paiement enregistré pour la facture: " + facture);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }
}
