import java.util.ArrayList;

/**
 * This class tests shapes
 *
 * @author William Van Uitert
 * @version 03/07/2025
 */

public class ShapeTester4 {

    public static String showEffectBoth(ArrayList<Rectangle4> shapes) {
        String effect = "";
        for(Rectangle4 shape : shapes) {
            effect += shape.toString() + "\n";
        }
        return effect;
    }

    public static String testEquality(Rectangle4 rectOne, Rectangle4 rectTwo) {
        if(rectOne.equals(rectTwo)) {
            return rectOne.toString() + " is equal to " + rectTwo.toString();
        }
        return rectOne.toString() + " is NOT equal to " + rectTwo.toString();
    }

    public static void main (String[] args) {
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();
        shapes.add(new Rectangle4(1, 1));
        shapes.add(new Box4(2, 3, 4));
        shapes.add(new Cube4(5));
        shapes.add(new Parallelogram(5, 5, (Math.PI / 6)));
        shapes.add(new Rhombus(5, (Math.PI / 6)));

        System.out.println("My Shapes:  ");
        System.out.println();
        System.out.println(showEffectBoth(shapes));
        System.out.println();
        System.out.println("Test for Equality:");
        System.out.println();
        System.out.println(testEquality(shapes.get(3), shapes.get(4)));
        System.out.println(testEquality(shapes.get(1), shapes.get(2)));
    }
}
