/*
 * Purpose: to test the various shape classes
 * 
 * @author William Van Uitert
 * @version 03/05/2025
 */

import java.util.ArrayList;

public class ShapeTester3 {

    public static String showCenter(Circle2 circle) {
        String className = circle.getClass().getName();
        return "For this " + className + " the center is at " + circle.getCenter();
    }
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int h = 10;
        int rOne = 5;
        int rTwo = 6;

        ArrayList<Circle2> shapes = new ArrayList<>();
        shapes.add(new Circle2(x, y, rOne));
        shapes.add(new Cylinder2(x + 1, y - 2, rOne, h));
        shapes.add(new Oval2(x + 5, y - 6, rOne, rTwo));
        shapes.add(new OvalCylinder2(x + 2, y - 3, rOne, rTwo, h));

        System.out.println();
        for(Circle2 shape : shapes) {
            System.out.println(showCenter(shape));
        }
        System.out.println();
    }
}
