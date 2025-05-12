/*
 * Purpose: to use an object and a tester object
 * 
 * @author William Van Uitert
 * @version 11/27/24
 */

 import java.lang.Math;

class CarV3 {
    int carSpace = 6;

    public CarV3() {
    }

    public int locomotion() {
        return (int)(Math.random() * Math.random() * 100);
    }

    public int remainingSpace(int originalSpace, int numObjects){
        return originalSpace - numObjects;
    }
    
}

public class CarTesterV3 {
    public static void main(String[] args) {
        int originalSpace = 4;
        int numObjects = 2;

        
        System.out.println("Traveled\tRemaining Space");
        for(int i = 0; i <= 30; i++) {
            System.out.print("=");
        }
        System.out.print("\n");

        CarV3 carOne = new CarV3();
        System.out.println(carOne.locomotion() + "\t\t" + carOne.remainingSpace(originalSpace, numObjects));
    }
}
