/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_creationdesarmes_butery;

/**
 *
 * @author Maixent
 */

abstract class Arme {
    String nom;
    int niveauAttaque;

    // Constructeur de la classe parente
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    @Override
    public String toString() {
        return "Arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }

    public String getNom() {
        return nom;
    }
}

class Epee extends Arme {
    int finesse;

    // Constructeur de la classe Epee, appel du constructeur de la classe parente (Arme)
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque); // Appel du constructeur de la classe parente
        this.finesse = finesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse: " + finesse;
    }
}

class Baton extends Arme {
    int age;

    // Constructeur de la classe Baton, appel du constructeur de la classe parente (Arme)
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); // Appel du constructeur de la classe parente
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Âge: " + age;
    }
}

