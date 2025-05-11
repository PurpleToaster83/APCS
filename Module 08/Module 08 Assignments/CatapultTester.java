/*
 * Purpose: to test the catapult class
 * 
 * @author William Van Uitert
 * @version 02/16/2025
 */

public class CatapultTester {

    public static void printTable(double[][] distArray, int[] speeds, int[] angles) {
        System.out.println();
        System.out.println("\t\tProjectile Distance (meters)");
        System.out.print("m/s\t");
        for(int angle : angles) {
            System.out.print(angle + " deg\t\t");
        }
        System.out.println();

        for(int i = 0; i < 16 * angles.length + 1; i++) {
            System.err.print("=");
        }
        System.out.println();

        for(int row = 0; row < distArray.length; row++) {
            System.out.print(speeds[row] + "\t");
            for(int column = 0; column < distArray[0].length; column++) {
                System.out.printf("%6.2f\t\t", distArray[row][column]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] speedArray = {10, 20, 30, 40, 50, 60};
        int[] angleArray = {10, 20, 30, 45, 60, 75, 80};
        double[][] distArray = new double[speedArray.length][angleArray.length];

        Catapult catapult = new Catapult();
        
        for(int row = 0; row < distArray.length; row++) {
            for(int column = 0; column < distArray[0].length; column++) {
                distArray[row][column] = catapult.calcDist(speedArray[row], angleArray[column]);
            }
        }

        printTable(distArray, speedArray, angleArray);
    }
    
}
