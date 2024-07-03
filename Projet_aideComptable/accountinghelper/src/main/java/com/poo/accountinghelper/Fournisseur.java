package com.poo.accountinghelper;

import javax.persistence.*;
import java.util.List;

@Entity
public class Fournisseur extends Utilisateur {

    @OneToMany(mappedBy = "fournisseur")
    private List<Facture> factures;

    // Méthodes pour gérer les factures
    public void creerFacture(Facture facture) {
        factures.add(facture);
        facture.setFournisseur(this);
        System.out.println("Facture créée: " + facture);
    }

    public void editerFacture(Facture facture) {
        for (Facture f : factures) {
            if (f.getId() == facture.getId()) {
                f.setDescription(facture.getDescription());
                f.setMontant(facture.getMontant());
                f.setEtatFacture(facture.isEtatFacture());
                System.out.println("Facture modifiée: " + f);
            }
        }
    }

    public void supprimerFacture(Facture facture) {
        factures.removeIf(f -> f.getId() == facture.getId());
        System.out.println("Facture supprimée: " + facture);
    }
}
