/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_butery;

/**
 *
 * @author Maixent
 */
public class TP2_relation_1_BUTERY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    class Voiture{
        String Modele ="";
        String Marque="";
        int PuissanceCV;
            public Voiture(String Modele, String Marque, int PuissanceCV) {
                this.Modele=Modele;
                this.Marque=Marque;
                this.PuissanceCV=PuissanceCV;
            }
        @Override
        public String toString () {
        return "Voiture { Modele: " + Modele + ", Marque: " + Marque + ", Puissance: " + PuissanceCV + " CV }";
}
    }
    class Personne{
        String nom ="";
        String prenom="";

            public Personne(String nom,String prenom) {
                this.nom=nom;
                this.prenom=prenom;
            }
        @Override
public String toString () {
 return "Personne { Nom: " + nom + ", Prénom: " + prenom + " }";
}

    }
    Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
    Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
    Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
    Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
    Personne bob = new Personne("Bobby", "Sixkiller");
    Personne reno = new Personne("Reno", "Raines");
    System.out.println("liste des voitures disponibles "+ uneClio +
    "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

    }
    
}
