package com.poo.accountinghelper;

public class Utilisateur {
   // private int id;
    private String nom;
    private String adresse;
    //private Email email;
    private String role;

public Utilisateur(){

}
//constructeurs à enlever on le laisse par defaut
public Utilisateur(String nom, String adresse, String role){
    this.nom = nom;
    this.adresse = adresse;
    //this.email = email;
    this.role = role;
}

public void createUser(){
    System.out.println("Entrer votre nom :" );


}
public void managePermission(){

}
public void createAccount(){

}
public void manageAccount(){

}
/*public int getId() {
    return id;
}*/
public String getNom() {
    return nom;
}
public String getAdresse() {
    return adresse;
}
/*public Email getEmail() {
    return email;
}*/
public String getRole() {
    return role;
}
}
