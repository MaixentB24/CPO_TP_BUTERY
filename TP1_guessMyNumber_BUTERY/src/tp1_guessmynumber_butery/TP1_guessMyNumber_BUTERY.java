/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_butery;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maixent
 */
public class TP1_guessMyNumber_BUTERY {
    public static void main(String[] args){
        Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez choisir une difficulté :");
        System.out.println("1. Facile (entre 1 et 50)");
        System.out.println("2. Moyen (entre 1 et 100)");
        System.out.println("3. Difficile (entre 1 et 200)");
        int choixDifficulte = scanner.nextInt();
        int limiteMax = 100;
        switch (choixDifficulte) {
            case 1:
                limiteMax = 50;
                break;
            case 2:
                limiteMax = 100;
                break;
            case 3:
                limiteMax = 200;
                break;
            default:
                System.out.println("Choix invalide, difficulté moyenne choisie par défaut.");
                limiteMax = 100;
                break;
        }
        int nombreAleatoire = generateurAleat.nextInt(limiteMax) + 1;
        int tentative = 0;
        int nombreEntre;
        do {
            System.out.print("Veuillez saisir un nombre entre 1 et " + limiteMax + " : ");
            nombreEntre = scanner.nextInt();
            tentative++;
            if (nombreEntre > nombreAleatoire) {
                System.out.println("Trop grand !");
            } else if (nombreEntre < nombreAleatoire) {
                System.out.println("Trop petit !");
            }
        } while (nombreEntre != nombreAleatoire);
        System.out.println("Gagné !");
        System.out.println("Vous avez trouvé en " + tentative + " tentative(s).");
        scanner.close();
    }
}
