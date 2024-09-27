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
    System.out.println("Bonjour, saisissez une valeur :");
    Scanner scanner = new Scanner(System.in);
    double VarA;
    VarA = scanner.nextDouble();
    System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
    System.out.println("1) de Celcius vers Kelvin");
    System.out.println("2) de Kelvin vers Celcius");
    System.out.println("3) de Farenheit vers Celcius");
    System.out.println("4) de Celcius vers Farenheit");
    System.out.println("5) de Kelvin vers Farenheit");
    System.out.println("6) de Farenheit vers Kelvin");
    int Varb;
    Varb=scanner.nextInt();
    if(Varb==1){
        CelciusVersKelvin(VarA);
    }
    else if(Varb==2){
        KelvinVersCelcius(VarA);
    }
    
    else if(Varb==3){
        FarenheitVersCelcius(VarA);
    }
    else if(Varb==4){
        CelciusVersFarenheit(VarA);
    }
    else if(Varb==5){
        KelvinVersFarenheit(VarA);
    }
    else if(Varb==6){
        FarenheitVersKelvin(VarA);
    }

}
    

public static double CelciusVersKelvin (double tCelcius) {
 double tKelvin=tCelcius+273.15;
 System.out.println(tCelcius+"degré Celcius est égal à"+tKelvin+"degrés Kelvin");
    return tKelvin;
}
public static double KelvinVersCelcius (double tKelvin) {
 double tCelcius=tKelvin-273.15;
  System.out.println(tKelvin+"degré kelvin est égal à"+tCelcius+"degrés Celcius");
    return tCelcius;
}
public static double FarenheitVersCelcius (double tFarenheit) {
 double tCelcius=(tFarenheit-32)*5/9;
  System.out.println(tFarenheit+"degré Farenheit est égal à"+tCelcius+"degrés Celcius");
    return tCelcius;
}
public static double CelciusVersFarenheit (double tCelcius) {
 double tFarenheit=tCelcius*9/5+32;
  System.out.println(tCelcius+"degré Celcius est égal à"+tFarenheit+"degrés Farenheit");
    return tFarenheit;
}
public static double KelvinVersFarenheit (double tKelvin) {
double tFarenheit = KelvinVersCelcius(tKelvin);
tFarenheit = CelciusVersFarenheit(tFarenheit);
 System.out.println(tKelvin+"degré Kelvin est égal à"+tFarenheit+"degrés Farenheit");
    return tFarenheit;
}
public static double FarenheitVersKelvin (double tFarenheit) {
 double tKelvin=FarenheitVersCelcius(tFarenheit);
tKelvin=CelciusVersFarenheit(tKelvin);
 System.out.println(tFarenheit+"degré Farenheit est égal à"+tKelvin+"degrés Kelvin");
    return tKelvin;
}

}