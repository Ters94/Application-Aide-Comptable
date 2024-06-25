package com.poo.accountinghelper;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public class UserController {
    @GetMapping("/utilisateur/{id}")
    // pour retourner un objet : 
    //on a rajouter le path parcequ'on a pris le id du getmapping precedent 
    public ResponseEntity<Utilisateur> getUtilisateur(@PathVariable int id){
        //essai de creer un objet
        Utilisateur result = new Utilisateur();
        return null;

    }

}
