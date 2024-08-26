package fr.lambda.cours;

public class Stagiaire {

    private String nom;
    private String prenom;
    private boolean chouchou;

    public Stagiaire(String nom, String prenom, boolean chouchou) {
        this.nom = nom;
        this.prenom = prenom;
        this.chouchou = chouchou;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public boolean isChouchou() {
        return chouchou;
    }

    public void setChouchou(boolean chouchou) {
        this.chouchou = chouchou;
    }
}
