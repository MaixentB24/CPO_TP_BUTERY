
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tp3_creationdesarmes_butery;
import java.util.ArrayList;


/**
 *
 * @author Maixent
 */
public class TP3_CreationDesArmes_BUTERY {
    public static void main(String[] args) {
        // Création des armes
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        // Création d'un tableau dynamique pour les armes
        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);

        // Affichage des caractéristiques des armes
        System.out.println("Caractéristiques des armes:");
        for (Arme arme : armes) {
            System.out.println(arme);
        }

        // Création des personnages
        Magicien magicien1 = new Magicien("Gandalf", 65, true);
        Magicien magicien2 = new Magicien("Garcimore", 44, false);
        Guerrier guerrier1 = new Guerrier("Conan", 78, false);
        Guerrier guerrier2 = new Guerrier("Lannister", 45, true);

        // Création d'un tableau dynamique pour les personnages
        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(magicien1);
        personnages.add(magicien2);
        personnages.add(guerrier1);
        personnages.add(guerrier2);

        // Affichage des caractéristiques des personnages
        System.out.println("\nCaractéristiques des personnages:");
        for (Personnage personnage : personnages) {
            System.out.println(personnage);
        }
    }
}
