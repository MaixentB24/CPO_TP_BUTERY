/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_butery;

/**
 *
 * @author Maixent
 */
public class TP2_manip_BUTERY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    class Tartiflette{
        int nbCalories;

            public Tartiflette(int valeur) {
            nbCalories=valeur;
            }
        
}
    class Moussaka{
        int nbCalories;

            public Moussaka(int valeur) {
                nbCalories=valeur;
            }
        
}
    Tartiflette assiette1 = new Tartiflette(500) ;
    Tartiflette assiette2 = new Tartiflette(700) ;
    Tartiflette assiette3 = assiette2 ;//seulement deux tartiflettes ont été crée, l'assiette 2 et l'assiette 3 font référence à la même tartiflette 
    System.out.println("nb de calories de Assiette 2 : " +
    assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " +
    assiette3.nbCalories) ;
    //on observe que lorsque l'on incrémente l'assiette de tartiflette numéro 2, le même changement s'opère sur l'assiette de tartiflette numéro 3. Il n'y a donc que 2 assiette de tartiflette.
    Tartiflette temp = assiette1;
    assiette1=assiette2;
    assiette2=temp;
    //Moussaka assiette666 = assiette1 ;
    //Moussaka assiette667 = new Tartiflette() ;
    //Aucune de ces 2 lignes ne sont correct. une référence objet qui annonce référencer un type d’objet ne peut pas en référencer un autre qui n’a aucun rapport.
            Moussaka[] tabMoussaka = new Moussaka[10];
        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(200 + i * 50);
        }
        for (int i = 0; i < tabMoussaka.length; i++) {
            System.out.println("Moussaka " + i + " : " + tabMoussaka[i].nbCalories + " calories");
        }
    }
//Oui, un objet peut tout à fait avoir une référence à un autre objet comme attribut. Cela permet de créer des relations entre les objets, comme des liens de composition ou d'association.
}
