package com.poo.accountinghelper;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public class UserController {
    @GetMapping("/client/{id}")
    // pour retourner un objet : 
    //on a rajouter le path parcequ'on a pris le id du getmapping precedent 
    public ResponseEntity<Client> getClient(@PathVariable int id){
        return null;

    }

}
