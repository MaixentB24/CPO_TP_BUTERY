/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_butery;

import java.util.Random;

/**
 *
 * @author Maixent
 */
public class TP1_guessMyNumber_BUTERY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random generateurAleat = new Random();
    for (int i=0;i<=5;i++){
        int n = generateurAleat.nextInt(100);
    System.out.print("\n"+n);
        
    }
    
    }
    
}
