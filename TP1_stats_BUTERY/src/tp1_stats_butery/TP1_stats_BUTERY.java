/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_butery;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maixent
 */
public class TP1_stats_BUTERY {


    public static void main(String[] args) {
        int[] des = new int[6];
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez le nombre de lancers de dé (entier m) : ");
        int m = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            int tirage = random.nextInt(6);
            des[tirage]++;
        }
        System.out.println("Résultats des lancers :");
        for (int i = 0; i < des.length; i++) {
            System.out.println("Face " + (i+1) + ": " + des[i] + " fois");
        }
        System.out.println("\nRésultats en pourcentages :");
        for (int i = 0; i < des.length; i++) {
            double pourcentage = ((double) des[i] / m) * 100;
            System.out.printf("Face %d: %.2f%%\n", (i+1), pourcentage);
        }
    }}
