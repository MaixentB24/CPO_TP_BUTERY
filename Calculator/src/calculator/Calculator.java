/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

//Butery TDB TP0 17/09/2024

import java.util.Scanner;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:"+"\n1) add"+"\n2) substract"+"\n3) multiply"+"\n4) divide"+"\n5) modulo");
        int entier = 0;
        double operande1;
        double operande2;
        double resultat = 0;
        Scanner sc = new Scanner(System.in);
        entier=sc.nextInt();
        if (entier>5){
           System.out.println("error");
           System.exit(0);
        }
        System.out.println("Rentrez une première valeur :");
        operande1=sc.nextInt();
        System.out.println("Rentrez une deuxième valeur :");
        operande2=sc.nextInt();
        if (entier==1){ 
            resultat=operande1+operande2;
        }
        if (entier==2){
            resultat=operande1-operande2;
        }
        if (entier==3){
            resultat=operande1*operande2;
        }
        if (entier==4){
            resultat=operande1/operande2;
        }
        if (entier==5){
            resultat=operande1%operande2;
        }
        
        
        System.out.println("The result is :"+resultat);
    }
}

