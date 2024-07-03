package com.poo.accountinghelper;

public class Compte {
    private int id;
    public int getId() {
        return id;
    }
    public String getNumCompte() {
        return numCompte;
    }
    public double getSolde() {
        return solde;
    }
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public String getType() {
        return type;
    }
    private String numCompte;
    private double solde;
    private Utilisateur utilisateur;
    private String type;
    

    public void etatTransaction(){

    }
    public void reconciliationBancaire(){
        
    }
    
}
