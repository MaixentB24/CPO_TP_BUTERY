/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_creationdesarmes_butery;

/**
 *
 * @author Maixent
 */
abstract class Personnage {
    String nom;
    int niveauVie;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    @Override
    public String toString() {
        return "Personnage: " + nom + ", Niveau de vie: " + niveauVie;
    }

    public String getNom() {
        return nom;
    }
}

class Magicien extends Personnage {
    boolean confirme;

    // Constructeur de Magicien
    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie); // Appel du constructeur de la classe parente Personnage
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return super.toString() + ", Confirmé: " + (confirme ? "Oui" : "Non");
    }
}

class Guerrier extends Personnage {
    boolean aCheval;

    // Constructeur de Guerrier
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie); // Appel du constructeur de la classe parente Personnage
        this.aCheval = aCheval;
    }

    @Override
    public String toString() {
        return super.toString() + ", À cheval: " + (aCheval ? "Oui" : "Non");
    }
}