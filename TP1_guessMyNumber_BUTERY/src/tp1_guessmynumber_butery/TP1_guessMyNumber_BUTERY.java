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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**Random generateurAleat = new Random();
    *for (int i=0;i<=5;i++){
    *    int n = generateurAleat.nextInt(100);
    *System.out.print("\n"+n);
    * 
    *}
    */
    Random generateurAleat = new Random();
    int n = generateurAleat.nextInt(100);
    int m=0;
    int w=0;
    System.out.println("Veuillez choisir une difficulté :");
    while (n!=m){
        
    System.out.println("Veuillez saisir un nombre : ");
    Scanner scanner = new Scanner(System.in);
    m = scanner.nextInt();
    w+=1;
    if (n==m){
        System.out.println("Gagné");
    System.out.println("vous avez fait "+w+" Tentative");
    }
    else if (n<m){
        System.out.println("trop grand !");
    }
    else if (n>m){
        System.out.println("trop petit");
    }
    }
    }
}
