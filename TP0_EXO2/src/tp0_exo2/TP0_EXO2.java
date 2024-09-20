/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_exo2;
//Butery TDB TP0 17/09/2024

import java.util.Scanner;


public class TP0_EXO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaration des variables
int nb; // nombre dentiers a additionner
int result; // resultat
int ind; //indice
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :5");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
nb=5;
result=0;
// Addition des nb premiers entiers
ind=1;
while (ind <= nb) {
result=result+ind;
ind+=1;
}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);
}
    
}
