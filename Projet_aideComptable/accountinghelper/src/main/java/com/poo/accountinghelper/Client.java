package com.poo.accountinghelper;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Client extends Utilisateur {

    @OneToMany(mappedBy = "client")
    private List<Facture> factures;

    /**
     * Affiche l'historique des transactions pour chaque compte du client.
     */
    public void suivreTransactions() {
        for (Compte compte : getComptes()) {
            compte.etatTransaction();
        }
    }

    /**
     * Permet au client de payer une facture donnée.
     * @param facture La facture à payer.
     * @param montant Le montant à payer.
     */
    public void payerFacture(Facture facture, double montant) {
        // Vérifie si la facture est émise
        if (!facture.isEtatFacture()) {
            System.out.println("La facture n'est pas encore émise.");
            return;
        }

        // Vérifie si le solde du client est suffisant pour payer la facture
        if (getSolde() >= montant) {
            // Déduit le montant de la facture du solde du client
            setSolde(getSolde() - montant);
            // Enregistre le paiement
            Paiement paiement = new Paiement(facture, montant);
            paiement.enregistrerPaiement();
        } else {
            System.out.println("Solde insuffisant pour payer la facture.");
        }
    }
}
