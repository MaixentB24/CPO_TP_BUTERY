/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_nom1;

import java.util.Scanner;

/**
 *
 * @author Maixent
 */
public class TP1_manipNombresInt_Butery {

    
    public static void main(String[] args) {    
    int VariableA = 0;
    int VariableB = 0;
    System.out.println("Veuiller saisir 2 entiers :");
    Scanner scanner = new Scanner(System.in);
    VariableA = scanner.nextInt();
    VariableB = scanner.nextInt();
    System.out.println("La variable a est :"+VariableA);
    System.out.println("La variable b est :"+VariableB);
    System.out.println("La somme des 2 variables est :"+(VariableA+VariableB));
    System.out.println("La différence des 2 variables est :"+(VariableA-VariableB));
    System.out.println("Le produit des 2 variables est :"+(VariableA*VariableB));
    System.out.println("La divion euclidienne des 2 variables donne :"+(VariableA/VariableB)+" il reste :"+(VariableA%VariableB));
    }
    
}
