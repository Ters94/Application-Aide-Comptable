package com.poo.accountinghelper;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String client;
    private double montant;
    private Date date;
    private boolean etatFacture;

    @ManyToOne
    private Client clientDetails;

    // Constructeurs
    public Facture() {
    }

    public Facture(String client, double montant, Date date, boolean etatFacture) {
        this.client = client;
        this.montant = montant;
        this.date = date;
        this.etatFacture = etatFacture;
    }

    // Méthodes métier
    public void creerFacture() {
        System.out.println("Création de la facture: " + this);
    }

    public void editerFacture(double nouveauMontant) {
        this.montant = nouveauMontant;
        System.out.println("Édition de la facture: " + this);
    }

    public void supprimerFacture() {
        System.out.println("Suppression de la facture: " + this);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isEtatFacture() {
        return etatFacture;
    }

    public void setEtatFacture(boolean etatFacture) {
        this.etatFacture = etatFacture;
    }

    public Client getClientDetails() {
        return clientDetails;
    }

    public void setClientDetails(Client clientDetails) {
        this.clientDetails = clientDetails;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", client='" + client + '\'' +
                ", montant=" + montant +
                ", date=" + date +
                ", etatFacture=" + etatFacture +
                '}';
    }
}
