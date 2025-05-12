/*
 * Purpose: to create the catapult class
 * 
 * @author William Van Uitert
 * @version 02/16/2025
 */

 public class Catapult {
    private double g = 9.8;

    public double calcDist(int speed, int angle) {
        return Math.pow(speed, 2) * Math.sin(2 * Math.toRadians(angle)) / g;
    }
}
