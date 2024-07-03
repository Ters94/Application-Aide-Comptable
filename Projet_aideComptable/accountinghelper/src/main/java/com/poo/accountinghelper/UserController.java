package com.poo.accountinghelper;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/create")
    public void createUser(@RequestBody Utilisateur utilisateur) {
        // Logique pour créer un utilisateur
        System.out.println("Utilisateur créé: " + utilisateur);
    }

    @GetMapping("/{id}")
    public Utilisateur getUser(@PathVariable int id) {
        // Logique pour récupérer un utilisateur
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(id);
        utilisateur.setNom("Nom Exemple");
        utilisateur.setEmail("exemple@email.com");
        return utilisateur;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        // Logique pour supprimer un utilisateur
        System.out.println("Utilisateur supprimé avec ID: " + id);
    }
}

