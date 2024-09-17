
package tp0_exo1;

//Butery TDB TP0 17/09/2024

import java.util.Scanner;

public class TP0_EXO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Bonjour");
       System.out.print("Aurevoir");
       String prenom;
       Scanner sc;
       sc = new Scanner(System.in);
       System.out.println("Bonjour, quel est votre prenom ?");
       prenom = sc.nextLine();
       System.out.print(prenom);
    }
    
}
