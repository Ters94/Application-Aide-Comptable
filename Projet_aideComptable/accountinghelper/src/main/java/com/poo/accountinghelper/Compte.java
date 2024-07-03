package com.poo.accountinghelper;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String numCompte;
    private double solde;
    @ManyToOne
    private Utilisateur utilisateur;
    private String type;

    @OneToMany(mappedBy = "compte", cascade = CascadeType.ALL)
    private List<Transaction> transactions = new ArrayList<>();

    // Affiche l'état des transactions pour le compte
    public void etatTransaction() {
        System.out.println("Transactions pour le compte " + numCompte + ":");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // Effectue la réconciliation bancaire
    public void reconciliationBancaire() {
        System.out.println("Réconciliation bancaire pour le compte " + numCompte + " effectuée.");
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
