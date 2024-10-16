/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_butery;

/**
 *
 * @author Maixent
 */
public class TP2_Bieres_BUTERY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
    7.0 ,"Dubuisson") ;
    uneBiere.ouverte=false;
    uneBiere.lireEtiquette();
    
    BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe") ;
    uneBiere2.lireEtiquette();
    
        BouteilleBiere uneBiere3 = new BouteilleBiere("Tripel Karmeliet",9.2,"Bosteels") ;
    uneBiere3.lireEtiquette();
    
        BouteilleBiere uneBiere4 = new BouteilleBiere("1664",5.5,"Obernai") ;
    uneBiere4.lireEtiquette();
    
        BouteilleBiere uneBiere5 = new BouteilleBiere("Guinness",4.2,"James's Gate") ;
    uneBiere5.lireEtiquette();
    uneBiere5.decapsuler();
    uneBiere5.decapsuler();
    System.out.println(uneBiere) ;
    uneBiere2.decapsuler();
    System.out.println(uneBiere2);
    System.out.println(uneBiere5);
    }
    
    
}
