package tp1_convertisseur_butery;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Maixent
 */
public class TP1_convertisseur_Butery {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    System.out.println("Veuillez saisir un réel :");
    Scanner scanner = new Scanner(System.in);
    double VarA;
    VarA = scanner.nextDouble();
    System.out.println("La température en Kelvin est :"+(VarA+273.15));
    }
    

public static double CelciusVersKelvin (double tCelcius) {
 double tKelvin=tCelcius+273.15;
    return tKelvin;
}
public static double KelvinVersCelcius (double tKelvin) {
 double tCelcius=tKelvin-273.15;
    return tCelcius;
}
public static double FarenheitVersCelcius (double tFarenheit) {
 double tCelcius=(tFarenheit-32)*5/9;
    return tCelcius;
}
public static double CelciusVersFarenheit (double tCelcius) {
 double tFarenheit=tCelcius*9/5+32;
    return tFarenheit;
}
public static double KelvinVersFarenheit (double tKelvin) {
double tFarenheit = KelvinVersCelcius(tKelvin);
tFarenheit = CelciusVersFarenheit(tFarenheit);
    return tFarenheit;
}
public static double FarenheitVersKelvin (double tFarenheit) {
 double tKelvin=FarenheitVersCelcius(tFarenheit);
tKelvin=CelciusVersFarenheit(tKelvin);
    return tKelvin;
}

}