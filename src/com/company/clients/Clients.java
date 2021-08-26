package com.company.clients;

public class Clients {
    // properties
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;

    // constructors


    public Clients(String nom, String prenom, String adresse, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
    }

    public Clients(String nom, String prenom, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = "  ";
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }


}
