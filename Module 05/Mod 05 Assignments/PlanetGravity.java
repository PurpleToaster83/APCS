/*
 * Purpose: to calculate the gravitational force of a planet
 * 
 * @author William Van Uitert
 * @versioln 11/20/24
 */

import java.lang.Math;

public class PlanetGravity {

    public static double calcGravity(double mass, double diameter) {;
        return (6.67E-11 * mass) / Math.pow((500 * diameter), 2);
    }

    public static void title() {
        System.out.println("\t\t\t   Planetary Data");
        System.out.println("Planet\t\tDimaeter (km)\t\tMass (kg)\t\tg (m/s^2)");
        for(int i = 0; i <= 75; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public static void printData(String planetName, double diameter, double mass, double g) {
        System.out.println(planetName + "\t\t\t" + diameter + "\t\t" + mass + "\t\t\t" + g);
    }
    public static void main(String[ ] args)
    {
        String name = "Mercury";
        double diameter = 4880;
        double mass = 3.30E23;
        title();
        double g = (int)(calcGravity(mass, diameter) * 100.0) / 100.0;
        printData(name, diameter, mass, g);

        System.out.println();
    }
}
