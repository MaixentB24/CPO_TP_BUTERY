/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_butery;

import java.util.Scanner;

public class TP2_convertisseurObjet_BUTERY {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Convertisseur convertisseur = new Convertisseur();
        
        boolean continuer = true;

        while (continuer) {
            // Affichage du menu
            System.out.println("----- Menu -----");
            System.out.println("1) de Celsius vers Kelvin");
            System.out.println("2) de Kelvin vers Celsius");
            System.out.println("3) de Fahrenheit vers Celsius");
            System.out.println("4) de Celsius vers Fahrenheit");
            System.out.println("5) de Kelvin vers Fahrenheit");
            System.out.println("6) de Fahrenheit vers Kelvin");
            System.out.println("7) Voir le nombre de conversions effectuées");
            System.out.println("8) Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    // Celsius vers Kelvin
                    System.out.print("Entrez la température en Celsius : ");
                    double tCelsius = scanner.nextDouble();
                    double tKelvin = convertisseur.celsiusVersKelvin(tCelsius);
                    System.out.println(tCelsius + " °C = " + tKelvin + " K");
                    break;

                case 2:
                    // Kelvin vers Celsius
                    System.out.print("Entrez la température en Kelvin : ");
                    tKelvin = scanner.nextDouble();
                    tCelsius = convertisseur.kelvinVersCelsius(tKelvin);
                    System.out.println(tKelvin + " K = " + tCelsius + " °C");
                    break;

                case 3:
                    // Fahrenheit vers Celsius
                    System.out.print("Entrez la température en Fahrenheit : ");
                    double tFahrenheit = scanner.nextDouble();
                    tCelsius = convertisseur.fahrenheitVersCelsius(tFahrenheit);
                    System.out.println(tFahrenheit + " °F = " + tCelsius + " °C");
                    break;

                case 4:
                    // Celsius vers Fahrenheit
                    System.out.print("Entrez la température en Celsius : ");
                    tCelsius = scanner.nextDouble();
                    tFahrenheit = convertisseur.celsiusVersFahrenheit(tCelsius);
                    System.out.println(tCelsius + " °C = " + tFahrenheit + " °F");
                    break;

                case 5:
                    // Kelvin vers Fahrenheit
                    System.out.print("Entrez la température en Kelvin : ");
                    tKelvin = scanner.nextDouble();
                    tFahrenheit = convertisseur.kelvinVersFahrenheit(tKelvin);
                    System.out.println(tKelvin + " K = " + tFahrenheit + " °F");
                    break;

                case 6:
                    // Fahrenheit vers Kelvin
                    System.out.print("Entrez la température en Fahrenheit : ");
                    tFahrenheit = scanner.nextDouble();
                    tKelvin = convertisseur.fahrenheitVersKelvin(tFahrenheit);
                    System.out.println(tFahrenheit + " °F = " + tKelvin + " K");
                    break;

                case 7:
                    // Afficher le nombre de conversions
                    System.out.println(convertisseur);
                    break;

                case 8:
                    // Quitter
                    continuer = false;
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }

        scanner.close();
    }
}

    

