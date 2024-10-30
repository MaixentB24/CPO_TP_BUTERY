/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_butery;

/**
 *
 * @author Maixent
 */
public class Convertisseur {

    /**
     * @param args the command line arguments
     */

    // Attribut pour compter le nombre de conversions
    private int nbConversions;

    // Constructeur qui initialise nbConversions à 0
    public Convertisseur() {
        this.nbConversions = 0;
    }

    // Méthode pour convertir Celsius vers Kelvin
    public double celsiusVersKelvin (double tCelcius) {
        nbConversions++;
    double tKelvin=tCelcius+273.15;
    return tKelvin;
    }
    // Méthode pour convertir Kelvin vers Celsius
    public double kelvinVersCelsius(double tKelvin) {
        nbConversions++;
        return tKelvin - 273.15;
    }

    // Méthode pour convertir Fahrenheit vers Celsius
    public double fahrenheitVersCelsius(double tFahrenheit) {
        nbConversions++;
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir Celsius vers Fahrenheit
    public double celsiusVersFahrenheit(double tCelsius) {
        nbConversions++;
        return (tCelsius * 9 / 5) + 32;
    }

    // Méthode pour convertir Kelvin vers Fahrenheit
    public double kelvinVersFahrenheit(double tKelvin) {
        nbConversions++;
        double tCelsius = kelvinVersCelsius(tKelvin);
        return celsiusVersFahrenheit(tCelsius);
    }

    // Méthode pour convertir Fahrenheit vers Kelvin
    public double fahrenheitVersKelvin(double tFahrenheit) {
        nbConversions++;
        double tCelsius = fahrenheitVersCelsius(tFahrenheit);
        return celsiusVersKelvin(tCelsius);
    }

    // Retourne le nombre de conversions effectuées
    public int getNbConversions() {
        return nbConversions;
    }

    // Méthode toString pour afficher le nombre de conversions
    @Override
    public String toString() {
        return "Nombre de conversions : " + nbConversions;
    }
    }
