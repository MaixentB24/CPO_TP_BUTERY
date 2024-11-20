/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_butery;

/**
 *
 * @author Maixent
 */
public class TP2_relation_1_BUTERY {

    public static void main(String[] args) {
        // Création des objets Voiture
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        // Création des objets Personne
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        // Affichage des voitures disponibles
        System.out.println("Liste des voitures disponibles : \n" +
            uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        // Ajout des relations
        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneMicra);
        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneAutreClio);

        // Affichage des voitures de chaque personne
        System.out.println("\nLa première voiture de Bob est : " + bob.liste_voitures[0]);
        System.out.println("Les voitures de Reno sont : ");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println("- " + reno.liste_voitures[i]);
        }
    }

    // Classe Voiture
    static class Voiture {
        String Modele;
        String Marque;
        int PuissanceCV;
        Personne Proprietaire;

        public Voiture(String Modele, String Marque, int PuissanceCV) {
            this.Modele = Modele;
            this.Marque = Marque;
            this.PuissanceCV = PuissanceCV;
            this.Proprietaire = null; // Aucun propriétaire par défaut
        }

        @Override
        public String toString() {
            return "Voiture { Modele: " + Modele + ", Marque: " + Marque +
                ", Puissance: " + PuissanceCV + " CV, Proprietaire: " +
                (Proprietaire != null ? Proprietaire.nom : "aucun") + " }";
        }
    }

    // Classe Personne
    static class Personne {
        String nom;
        String prenom;
        int nbVoitures;
        Voiture[] liste_voitures;

        public Personne(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
            this.nbVoitures = 0;
            this.liste_voitures = new Voiture[3]; // Maximum 3 voitures
        }

        public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
            if (voiture_a_ajouter.Proprietaire != null) {
                System.out.println("Erreur : Cette voiture appartient déjà à quelqu'un !");
                return false;
            }
            if (nbVoitures >= 3) {
                System.out.println("Erreur : " + nom + " possède déjà 3 voitures !");
                return false;
            }
            liste_voitures[nbVoitures] = voiture_a_ajouter;
            voiture_a_ajouter.Proprietaire = this;
            nbVoitures++;
            return true;
        }

        @Override
        public String toString() {
            return "Personne { Nom: " + nom + ", Prénom: " + prenom +
                ", Nombre de voitures: " + nbVoitures + " }";
        }
    }
}

