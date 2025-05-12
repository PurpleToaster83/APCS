/*
 * Purpoose: to use overloaded methods and classes in a program
 * 
 * @author William Van Uitert
 * @version 12/04/24
 */

 class CarV8 {
    private String name;
    private int objectSpace;
    private String color;

    public CarV8(String name, int objectSpace, String color) {
        this.name = name;
        this.objectSpace = objectSpace;
        this.color = color;
    }

    public CarV8() {
        this.name = "car";
        this.objectSpace = 1;
        this.color = "black";
    }

    public String locomotion(double mileTraveled) {
        return name + " traveled " + mileTraveled + " miles!";
    }

    public String locomotion() {
        return name + " moved!";
    }

    public int remainingSpace(int numObjects){
        return objectSpace - numObjects;
    }

    public int getObjectSpace(){
        return objectSpace;
    }

    public String getColor(){
        return color;
    } 

    public String getName(){
        return name;
    }
}

public class CarTesterV8 {
    public static void main(String[] args) {

        System.out.println("Car\tObject Space\tColor");
        for(int i = 0; i <= 30; i++) {
            System.out.print("=");
        }
        System.out.println();

        CarV8 carTwo = new CarV8();
        CarV8 carOne = new CarV8("Truck", 4, "red");
        System.out.println(carOne.getName() + "\t\t" + carOne.getObjectSpace() + "\t" + carOne.getColor());
        System.out.println(carTwo.getName() + "\t\t" + carTwo.getObjectSpace() + "\t" + carTwo.getColor());
        
        System.out.println();

        System.out.println(carOne.locomotion(4.0));
        System.out.println(carTwo.locomotion());
        System.out.println("Enough Space for " + carOne.remainingSpace(2) + " items");
    }
}
